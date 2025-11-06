//Arnau va el 16 a veure la peli de Spiderman. Això significa que es perdrà una hora de classe
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //Llegueix fila i columna que ve de entrada
    val filaColumna = scan.nextInt()
    //inicia matriu
    var matriu = mutableListOf<MutableList<Int>>()
    //introduir els valors

    for (i in 0 until filaColumna) {
        var filaNumero = mutableListOf<Int>()
        //introduim els valors a una lista y la lista al matriu
        repeat(filaColumna) {
            filaNumero.add(scan.nextInt())
        }
        matriu.add(filaNumero)
    }
    //sumar matriu
    for (fila in matriu.indices) {
        for (columna in matriu[fila].indices) {
            matriu[fila][columna] += scan.nextInt()
        }
    }
    //mostrar resultat
    for (fila in matriu) {
        println(fila.joinToString(" "))
    }
}