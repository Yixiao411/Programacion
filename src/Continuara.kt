//Es vol posar tensió als anuncis de que es farà EL EVENTO es volen posar punts suspensius,
// perquè els punts suspensius donen tensió. No obstant, el responsable de Marketing,
// P. Meloni, no sap de signes de puntuació així que els posa al tuntun.
// Fes un programa que llegeix una frase amb varies paraules i després mitjançant un split
// la separi en un array de paraules. Un cop fet això concatena punts suspensius “...” a
// cada paraula si aquesta és més curta que la paraula següent.
// No afegeixis mai punts a l’última paraula.
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //casos
    val rep = scan.nextLine().toInt()
    repeat(rep){
        val tamany = scan.nextLine().toInt()
        //lista numeros
        val lista = scan.nextLine().split(" ").map{it.toInt()}.toMutableList()
        //persona que cola y la posicio
        val numero = scan.nextInt()
        val posicio = scan.nextInt()
        scan.nextLine()
        //afegir a la lista
        lista.add(posicio,numero)


        //mostra resultat
        println(lista.joinToString(" ")) //mostra resultat
    }
}
