//Travolta està buscant a la seva dreta i la seva esquerra.
// Què està buscant? No ho sabem, però és a l'esquerra i a la dreta
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //fila columna y valor a detectar
    val rep = scan.nextInt()
    repeat(rep) {
        val row = scan.nextInt()
        val col = scan.nextInt()
        val fantasmas = scan.nextInt()
        //matriu inicialitzat y sortida
        val matriu = MutableList(row) { MutableList(col) { 0 } }
        for (fila in matriu.indices) {
            for (columna in matriu[fila].indices) {
                if (fila == 0 || fila == row - 1) matriu[fila][columna] = 1
                if (columna == 0 || columna == col - 1) matriu[fila][columna] = 1
            }
        }
        val fantasma = 2
        //llegir el fantasma
        for (fan in 1..fantasmas) {
            val posX = scan.nextInt()
            val posY = scan.nextInt()
            if (fan == 1) matriu[posX][posY] = fantasma else matriu[posX][posY] = 1
        }
//        for (fila in matriu) {
//            println(fila.joinToString(" "))
//        }
        //variable de sortida
        var sortida = "OH NO"
        //detecta el lloc de fantansma (2) y mira si esta tancat
        for (fila in matriu.indices) {
            for (columna in matriu[fila].indices) {
                if (matriu[fila][columna] == fantasma) {
                    if (matriu[fila][columna - 1] == 0
                        || matriu[fila][columna + 1] == 0
                        || matriu[fila - 1][columna] == 0
                        || matriu[fila + 1][columna] == 0
                    ) {
                        sortida = "THIS IS FINE"
                    }
                }
            }
        }
        //mostra resposta
        println(sortida)
    }
}