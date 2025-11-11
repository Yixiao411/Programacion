//El Joc de la Vida és un autòmata cel·lular dissenyat pel matemàtic britànic John Horton Conway al 1970
//És un joc de zero jugadors, el que vol dir que la seva evolució està determinada pel seu estat inicial i
// no necessita cap entrada de dades posterior. El tauler de joc és espai bidimensional rectangular, dividit en caselles (cèl·lules).
// Cada casella te fins a 8 caselles veïnes, les que estan al seu voltant. Les cèl·lules tenen dos estats: vives o mortes.
// Es tracta d’anar evolucionant el tauler de joc en base a unes regles, que marcaran si les caselles estan vives o mortes.
// L’estat d’una casella evoluciona,
// d’una generació per la següent, sempre en funció de l’estat inicial de la matriu. en funció d’una sèrie de regles:
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //filas y columnas
    val row = scan.nextInt()
    val col = scan.nextInt()
    scan.nextLine()

    // Crear la matriz inicial y la matriz de salida
    val matriu = mutableListOf<MutableList<Int>>()
    val novaMatriu = MutableList(row) { MutableList(col) { 0 } }

    // Leer la matriz
    for (fila in 0 until row) {
        val numero = scan.nextLine().trim().map { it.toString().toInt() }.toMutableList()
        matriu.add(numero)
    }

    // Recorrer la matriz
    for (fila in 0 until row) {
        for (columna in 0 until col) {
            // Contador de vecinos
            var vecinosVivos = 0

            // Contar los vecinos vivos alrededor de la posicion actual
            if (fila > 0 && matriu[fila - 1][columna] == 1) vecinosVivos++
            if (fila < row - 1 && matriu[fila + 1][columna] == 1) vecinosVivos++
            if (columna > 0 && matriu[fila][columna - 1] == 1) vecinosVivos++
            if (columna < col - 1 && matriu[fila][columna + 1] == 1) vecinosVivos++
            if (fila > 0 && columna > 0 && matriu[fila - 1][columna - 1] == 1) vecinosVivos++
            if (fila > 0 && columna < col - 1 && matriu[fila - 1][columna + 1] == 1) vecinosVivos++
            if (fila < row - 1 && columna > 0 && matriu[fila + 1][columna - 1] == 1) vecinosVivos++
            if (fila < row - 1 && columna < col - 1 && matriu[fila + 1][columna + 1] == 1) vecinosVivos++

            // Aplicar las reglas del Juego de la Vida de Conway
            if (matriu[fila][columna] == 1) {
                novaMatriu[fila][columna] = if (vecinosVivos == 2 || vecinosVivos == 3) 1 else 0
            } else {
                novaMatriu[fila][columna] = if (vecinosVivos == 2 || vecinosVivos == 3) 1 else 0
            }
        }
    }

    // Imprimir la matriz
    for (fila in novaMatriu) {
        println(fila.joinToString(""))
    }
}
