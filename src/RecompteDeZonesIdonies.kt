import java.util.Scanner
import java.util.ArrayDeque
fun main() {
    val scan = Scanner(System.`in`)
    val nPis = scan.nextInt()
    val nRes = scan.nextInt()
    var pisos = ArrayDeque<Int>()
    repeat(nPis) {
        pisos.add(scan.nextInt())
    }
    var restrinccions = mutableListOf<Triple<Int, Int, Int>>()
    repeat(nRes) {
        restrinccions.add(Triple(scan.nextInt(),scan.nextInt(),0))
    }
    var pisosR = mutableListOf<Int>()
    while (pisos.isNotEmpty()) {
        var correct = true
        val pis = pisos.pollFirst()
        pisosR.add(pis)

        for (x in 0 until restrinccions.size) {

        }
    }

    while (pisosR.isNotEmpty()) {}

}