import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val qPlats = scan.nextInt()
    val qPinyons = scan.nextInt()
    scan.nextLine()
    val dentsPlats = scan.nextLine().split(" ").map { it.toDouble() }
    val dentsPinyons = scan.nextLine().split(" ").map { it.toDouble() }

    val casos = qPlats * qPinyons
    val relacio = mutableListOf<MutableList<Double>>()
    for (plato in 0 until qPlats) {
        for (pinyo in 0 until qPinyons) {
            val rel = MutableList<Double>(3) { 0.0 }
            rel[0] = dentsPlats[plato] / dentsPinyons[pinyo]
            rel[1] = dentsPlats[plato]
            rel[2] = dentsPinyons[pinyo]
            relacio.add(rel)
        }
    }

    relacio.sortWith(compareBy({ it.first() }, { it[1] }))

    for (rel in relacio) {
        println("(${String.format("%.0f", rel[1])},${String.format("%.0f", rel[2])})")
    }
}