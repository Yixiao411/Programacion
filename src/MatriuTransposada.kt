//Donada una matriu i la seva mida, donarem la matriu transposada. La matriu
// transposada es aquella a on les files es converteixen en columnes i les columnes en files
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //medida
    val row = scan.nextInt()
    val col = scan.nextInt()
    scan.nextLine()
    //iniciar matriu i in troduir valors, despres el matriu transposada
    var matriu = mutableListOf<MutableList<Int>>()
    var matriuInvert = MutableList(col) { MutableList(row) { 0 } }
    //introduir el valor
    for (i in 0 until row) {
        var numeros = scan.nextLine().split(" ").filter{it.isNotEmpty()}.map { it.toInt() }.toMutableList()
        matriu.add(numeros)
    }
    //posicio per matriu
    var posX = 0
    var posY = 0
    //anem en columna y afegim valor de matriu per ordre
    for (columna in 0 until row) {
        for (fila in 0 until col) {
            matriuInvert[fila][columna] = matriu[posX][posY]
            posY++
            if (posY == col) posY = 0
        }
        posX++
        if (posX == row) posX = 0
    }

    //mostra el resultat de pantalla
    for (row in matriuInvert) {
        println(row.joinToString(" "))
    }
}
