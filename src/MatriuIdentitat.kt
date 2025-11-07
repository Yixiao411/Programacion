//Una matriu identitat és una matriu tots els valors de la qual són zero excepte
// en la seva diagonal principal que són 1.
// La matriu cal que sigui quadrada, d'N posicions. N es demana a l'usuari.
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //medida
    val rowCol = scan.nextInt()
    //iniciar matriu i in troduir valors
    var matriu = MutableList(rowCol) { MutableList(rowCol) { 0 } }
    //cambia el 0 a 1 en diagonal
    var pos = 0
    for (fila in matriu.indices) {
        matriu[fila][pos]=1
        pos++
    }

    //mostra el resultat de pantalla
    for (row in matriu) {
        println(row.joinToString(" "))
    }
}
