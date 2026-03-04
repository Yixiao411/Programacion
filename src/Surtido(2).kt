import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    repeat(n) {
        val x = scan.nextInt()
        var galetes = mutableMapOf<String, Int>()
        repeat(x) {
            val galet = scan.next()
            if (!galetes.containsKey(galet)) {
                galetes[galet] = 1
            }else {
                galetes[galet] = galetes[galet]!! + 1
            }
        }
        var galetesOrdenats = galetes.toList().sortedByDescending { it.second }.toMap().toMutableMap()
        var result = 0

        while (galetesOrdenats.size > 2) {
            var count = 3
            galetesOrdenats.forEach {
                if (count > 0) {
                    galetesOrdenats[it.key] = galetesOrdenats[it.key]!! - 1
                    count--
                }
            }
            galetesOrdenats = galetesOrdenats.filter { it.value > 0 }.toMutableMap()
            result++
        }

        println(result)
    }
}