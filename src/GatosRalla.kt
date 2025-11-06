//La primera línia indica els casos de prova a considerar.
// Cada cas tindrà dues línies, la primera tindrà el nombre de files (F) i
// la segona el nombre de columnes (C), seguit de una matriu F*C amb una serie de nombres que seràn 1 (gat) o 0 (res).
// (Els gats utilitzats en una ratlla no poden utilitzar-se per formar una altre).
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    val rep = scan.nextInt()
    val GATO = 1
    val VACIO = 0

    repeat(rep) {
        //Llegueix fila i columna que ve de entrada
        val fila = scan.nextInt()
        val columna = scan.nextInt()
        var contadorLinias = 0
        //inicia matriu
        var matriuGatos = mutableListOf<MutableList<Int>>()
        //introduir els valors
        for (i in 0 until fila) {
            var gatos = mutableListOf<Int>()
            //introduim els valors a una lista y la lista al matriu
            repeat(columna) {
                gatos.add(scan.nextInt())
            }
            matriuGatos.add(gatos)
        }
        //comproba si hay 3 gatos que estan el linia
        //en cas cert transformara a vacio
        for (fil in matriuGatos.indices) {
            for (col in matriuGatos.indices) {
                if (col + 2 < columna && matriuGatos[fil][col] == GATO && matriuGatos[fil][col + 1] == GATO && matriuGatos[fil][col + 2] == GATO) {
                    contadorLinias++
                    matriuGatos[fil][col] = VACIO
                    matriuGatos[fil][col + 1] = VACIO
                    matriuGatos[fil][col + 2] = VACIO
                } else if (fil + 2 < fila && matriuGatos[fil][col] == GATO && matriuGatos[fil + 1][col] == GATO && matriuGatos[fil + 2][col] == GATO) {
                    contadorLinias++
                    matriuGatos[fil][col] = VACIO
                    matriuGatos[fil + 1][col] = VACIO
                    matriuGatos[fil + 2][col] = VACIO
                } else if (col + 2 < columna && fil + 2 < fila && matriuGatos[fil][col] == GATO && matriuGatos[fil + 1][col + 1] == GATO && matriuGatos[fil + 2][col + 2] == GATO) {
                    contadorLinias++
                    matriuGatos[fil][col] = VACIO
                    matriuGatos[fil + 1][col + 1] = VACIO
                    matriuGatos[fil + 2][col + 2] = VACIO
                }
            }
        }
        //mostra resultat
        println(contadorLinias)
    }
}