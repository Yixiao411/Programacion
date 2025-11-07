//Travolta està buscant a la seva dreta i la seva esquerra.
// Què està buscant? No ho sabem, però és a l'esquerra i a la dreta
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //fila columna y valor a detectar
    val row = scan.nextInt()
    val col = scan.nextInt()
    val detec = scan.nextInt()
    //matriu inicialitzat y sortida
    val matriu = MutableList(row) { MutableList(col) { 0 } }
    var sortida = "NO"
    //llegir el matriu introduit
    for (fila in matriu.indices) {
        for (columna in matriu[fila].indices) {
            matriu[fila][columna] = scan.nextInt()
        }
    }
    //comprova si el actual es igual que dos anterior
    //comenzant en el posicio 2 ya que en altres casos no tindran esquerra
    //despres que sigui igual que valor a detectar
    //llavor la sortida sera el valor que esta al mitg
    for (fila in matriu.indices) {
        for (columna in 2 until matriu[fila].size) {
            if (matriu[fila][columna] == matriu[fila][columna - 2]&&matriu[fila][columna]==detec) {
                sortida = matriu[fila][columna - 1].toString()
            }
        }
    }
    //mostra la resposta
    println(sortida)
}