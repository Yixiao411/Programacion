import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    repeat(casos) {
        val partidas = scan.nextInt()
        var puntsA = 0
        var puntsB = 0
        var lidera = 0
        var diferencia = 0
        var lider = 'E'
        var nuevoLider = 'E'
        repeat(partidas) {
            val part = scan.next()
            when (part) {
                "A" -> puntsA += 3
                "B" -> puntsB += 3
                "E" -> {
                    puntsA += 1
                    puntsB += 1
                }
            }

            if (puntsA > puntsB) nuevoLider='A'
            else if (puntsB > puntsA) nuevoLider='B'
            else nuevoLider='E'

            if (nuevoLider != lider && nuevoLider != 'E') {
                lidera++
            }
            lider = nuevoLider
        }
        if (puntsA < puntsB) {
            diferencia = puntsB - puntsA
        }else diferencia = puntsA - puntsB
        println("$puntsA $puntsB $diferencia $lidera")
    }
}