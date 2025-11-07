//Travolta està buscant a la seva dreta i la seva esquerra.
// Què està buscant? No ho sabem, però és a l'esquerra i a la dreta
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //fila columna y valor a detectar
    val row = scan.nextInt()
    val col = scan.nextInt()
    val fantasmas = scan.nextInt()
    //matriu inicialitzat y sortida
    val matriu = MutableList(row) { MutableList(col) { 0 } }
    for (fila in matriu.indices) {
        for (columna in matriu.indices) {
            if (fila == 0 || fila == matriu.size - 1) matriu[fila][columna] = 1
            if (columna == 0 || columna == matriu.size - 1) matriu[fila][columna] = 1
        }
    }
    //llegir el fantasma
    for (fan in 1..fantasmas) {
        val posX = scan.nextInt()
        val posY = scan.nextInt()
        if (fan == 1) matriu[posX][posY] = 2 else matriu[posX][posY] = 1
    }
    //variable de sortida
    var sortida = "OH NO"
    //detecta el lloc de fantansma y mira si esta tancat
    /*
    if (matriu[pox][columna] == 2) {
        if (matriu[fila][columna - 1] == 1
            && matriu[fila][columna + 1] == 1
            && matriu[fila - 1][columna] == 1
            && matriu[fila + 1][columna] == 1
        ) {
            sortida = "THIS IS FINE"
        }
    }
    */

    //mostra resposta
    println(sortida)
}