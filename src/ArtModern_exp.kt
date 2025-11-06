//Un artista emergent ho està petant perque té una manera única de pintar.
// La seva técnica és utilitzar un llenç de M-per-N que inicialment és completament negre.
// Aleshores, l'artista tria repetidament una fila o columna i passa el seu pinzell màgic al
// llarg de la fila o columna. El pinzell canvia el color de cada cel·la de la fila o columna
// de negre a daurat o de daurat a negre. Tenint en compte els moviments de l'artista,
// la teva tasca és determinar quantes cel·les daurades apareixeran finalment en el llenç.
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    val filas = scan.nextInt()  // Número de filas del lienzo
    val columnas = scan.nextInt()  // Número de columnas del lienzo

    //cantidad de pinceladas (movimientos)
    val pinceladas = scan.nextInt()
    //array de true o false (pintado o no)
    val files = BooleanArray(filas)
    val columnes = BooleanArray(columnas)

    //Pintar cada movimiento
    repeat(pinceladas) {
        val tipus = scan.next()
        val pos = scan.nextInt() - 1
        // Según el tipo, pintamos fila o columna.
        if (tipus == "R") files[pos] = !files[pos]
        else columnes[pos] = !columnes[pos]
    }

    // Si una fila/columna tiene true, significa que ha sido alternada un número impar de veces
    val filesOn = files.count { it }
    val columnesOn = columnes.count { it }
    // Resultado final:
    val daurades = filesOn * columnas + columnesOn * filas - 2L * filesOn * columnesOn
    // Muestra cuántas celdas quedan doradas tras todas las pasadas del pincel
    println(daurades)
}
