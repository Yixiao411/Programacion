import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt()
    repeat(rep){
        val n = scan.nextLine().toInt()-1
        var set = mutableSetOf<Pair<String, String>>()
        repeat(n){
            val cont = scan.nextLine().split("-")
            set.add(Pair(cont[0], cont[1]))
        }
        val busca = scan.nextLine()
        set = set.sortedBy { it.first }.toMutableSet()
        print("{")
        for (x in set){
            print("${x.first}=${x.second}")
            if (x != set.last()) print(", ")
        }
        println("}")
        for (x in set){
            if (x.second == busca){
                println(x.first)
            }
        }
    }
}