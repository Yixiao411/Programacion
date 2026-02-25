import java.util.Locale
import java.util.Scanner

data class farola(val puntA: Float, val puntB: Float, val indexValue: Int)

fun main() {
    val scan = Scanner(System.`in`).useLocale(Locale.UK)

    while (scan.hasNextFloat()){
        val start = scan.nextFloat()
        val end = scan.nextFloat()

        val numfarola = scan.nextInt()

        var llistaFaroles = mutableListOf<farola>()

        for (i in 0 until numfarola) {
            val llegirFarola = farola(scan.nextFloat(), scan.nextFloat(), i)
            llistaFaroles.add(llegirFarola)
        }

        llistaFaroles.sortBy { it.puntA }

        var hiHaCami = true
        var arribar = false

        var minPuntActual = start
        var maxPuntActual = start

        var farolaUtils = mutableListOf<Int>()
        var pos = 0

        while (hiHaCami && !arribar){
            hiHaCami = false
            var farolaMesLluny = maxPuntActual
            var millorPos = -1

            while (pos < llistaFaroles.size && llistaFaroles[pos].puntA <= minPuntActual) {
                val farola = llistaFaroles[pos]
                if (farola.puntB > farolaMesLluny) {
                    farolaMesLluny = farola.puntB
                    millorPos = pos
                    hiHaCami = true
                }
                pos++
            }

            if (millorPos != -1) {
                farolaUtils.add(llistaFaroles[millorPos].indexValue)
                minPuntActual = llistaFaroles[millorPos].puntA
                maxPuntActual = llistaFaroles[millorPos].puntB
            }

            if (maxPuntActual >= end) arribar = true
        }

        farolaUtils.sort()

        if (arribar) {
            println(farolaUtils.count())
            println(farolaUtils.joinToString(" "))
        } else {
            println("PayStayXon all the night!")
        }

        if (scan.hasNextFloat()) println()
    }
}