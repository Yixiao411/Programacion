import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val filas = scan.nextInt()
    val atributs = scan.nextInt()
    val preguntas = scan.nextInt()
    scan.nextLine()
    var activos = Array(filas) { it + 1 }
    var personas = Array(filas) { Array(atributs) { false } }

    for (i in 0 until filas) {
        val atr = scan.nextLine().split("").filter { it.isNotEmpty() }
        for (b in atr.indices) {
            when (atr[b]) {
                "S" -> personas[i][b] = true
                "Y" -> personas[i][b] = true
                "N" -> personas[i][b] = false
            }
        }
    }

    for (p in 0 until preguntas) {
        val posicio = scan.nextInt() - 1
        val atrib = scan.next() != "N"

        for (fila in personas.indices) {
            if (personas[fila][posicio] != atrib) {
                activos[fila] = -1
            }

        }

    }

    if (activos.count { it != -1 } == 1) {
        println("SI ${activos.indexOfFirst { it != -1 }+1}")
    } else {
        println("NO ${activos.count { it != -1 }}")
    }

    scan.close()
}