import java.util.Scanner

val BUIDA = 0

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt()
    repeat(rep){
        val q = scan.nextLine().toInt()
        val n = scan.nextLine().split(" ").map { it.toInt() }.toMutableList()
        val direc = scan.nextLine()
        var desp = 0
        when (direc) {
            "L" -> desp = -1
            "R" -> desp = 1
        }

        val numTemp = mutableListOf<Int>()
        for (x in n) {
            if (x != BUIDA) numTemp.add(x)
        }

        val fusion = mutableListOf<Int>()
        var pos = 0
        while (pos < numTemp.size) {
            if (pos + 1 < numTemp.size && numTemp[pos] == numTemp[pos + 1]) {
                fusion.add(numTemp[pos] + numTemp[pos + 1])
                pos += 2
            } else {
                fusion.add(numTemp[pos])
                pos++
            }
        }

        val vacias = MutableList(n.size-fusion.size){0}

        var resultat = mutableListOf<Int>()
        if (desp == 1) {
            resultat = vacias
            resultat.addAll(fusion)
        } else {
            fusion.addAll(vacias)
            resultat = fusion
        }

        println(resultat.joinToString(" "))
    }
}