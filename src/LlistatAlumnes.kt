//Passar les notes és una de les tasques més avorrides que pot tenir un professor. T'ofereixes a ajudar al professor a passar les notes?
// Potser pots ficar-hi cullerada i arreglar-te les notes...
//Cal mostrar 2 línies, amb el nom de l'alumne, la nota del primer parcial, la nota del segon parcial i la nota final, separades per un espai.
//La primera linia mostrarà el nom de la persona que ocupa el lloc P1 segons el segon parcial.
//La segona linia mostrarà el nom de la persona que ocupa el lloc P2 segons la seva nota final.
import java.util.Locale
import java.util.Scanner

//classe alumno
private data class LlistatAlumnes(val nom: String, val p1: Float, val p2: Float, val pFinal: Float? = null)

fun main(){
    val scan = Scanner(System.`in`).useLocale(Locale.UK) //scanner
    val rep = scan.nextLine().toInt() //quantitat alumnes
    val alumne = mutableListOf<LlistatAlumnes>() //lista de alumnes amb la nota
    //percentatge de cada parcial
    val vP1 = 0.4f
    val vP2 = 0.6f

    repeat(rep){ //afegim alumnes a la lista
        val nombre = scan.next()
        val parcial1 = scan.nextFloat()
        val parcial2 = scan.nextLine().toFloat()
        val parcialFinal = parcial1*vP1 + parcial2*vP2
        alumne.add(LlistatAlumnes(nombre,parcial1,parcial2,parcialFinal))
    }

    //primer ordenem amb parcial 2 y despes amb parcial final
    //despres imprimim el alumne que demana de posicio en cada cas
    val calcIndice = -1
    val posicioP2 = scan.nextInt() + calcIndice
    val posicioFinal = scan.nextInt() + calcIndice
    alumne.sortByDescending { it.p2 }
    val millorP2 = alumne[posicioP2]
    println("${millorP2.nom} ${millorP2.p1} ${millorP2.p2} " + String.format("%.2f",millorP2.pFinal))
    alumne.sortByDescending { it.pFinal }
    val millorFinal = alumne[posicioFinal]
    println("${millorFinal.nom} ${millorFinal.p1} ${millorFinal.p2} "+ String.format("%.2f",millorFinal.pFinal))

}