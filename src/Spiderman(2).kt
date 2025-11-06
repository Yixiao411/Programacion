//Arnau va el 16 a veure la peli de Spiderman.
// Això significa que es perdrà una hora de classe abans i una hora de classe després.
// Qui va a veure una peli EN MEITAT DEL SEU HORARI ESCOLAR?
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //Llegueix fila i columna que ve de entrada
    val fila = scan.nextInt()
    val columna = scan.nextInt()
    //inicia matriu
    var matriu = mutableListOf<MutableList<String>>()
    //introduir els valors
    for (i in 0 until fila) {
        var clases = mutableListOf<String>()
        //introduim els valors a una lista y la lista al matriu
        repeat(columna) {
            clases.add(scan.next())
        }
        matriu.add(clases)
    }

    //posicio y resultat
    var posicio = 0
    var claseAnterior = "NO"
    var clasePosterior = "NO"
    //si es igual la paraula que spiderman
    //guardara la posicio y el resultat del clase anterior y posterior
    for (fila in matriu.indices) {
        for (columna in matriu[fila].indices) {
            if (matriu[fila][columna] == "SPIDERMAN") {
                posicio = fila
                if (fila != 0) claseAnterior = matriu[fila - 1][columna]
                if (fila != matriu.size - 1) clasePosterior = matriu[fila + 1][columna]
            }
        }
    }
    //mostrar resultat
    println(claseAnterior)
    println(clasePosterior)
}