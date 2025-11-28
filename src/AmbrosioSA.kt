import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    repeat(casos) {
        val tamany = scan.nextInt()
        var correct = true
        val pMedio = tamany / 2
        val maxAnillo = Array<Int>(pMedio + 1) { Int.MIN_VALUE }
        val minAnillo = Array<Int>(pMedio + 1) { Int.MAX_VALUE }
        for (x in 0 until tamany) {
            for (y in 0 until tamany) {
                val numero = scan.nextInt()
                var posX = Math.abs(pMedio - x)
                var posY = Math.abs(pMedio - y)
                val anilloActual = Math.max(posX, posY)
                if (maxAnillo[anilloActual] < numero) maxAnillo[anilloActual] = numero
                if (minAnillo[anilloActual] > numero) minAnillo[anilloActual] = numero
            }
        }

        for (i in 0 until pMedio) {
            if (maxAnillo[i] >= minAnillo[i + 1]) {
                correct = false
            }
        }


        if (correct) {
            println("SI")
        } else println("NO")

    }
    scan.close()
}