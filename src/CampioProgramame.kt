import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt()
    repeat(rep){
        val n = scan.nextLine().toInt()-1
        var map = mutableMapOf<String, String>()
        repeat(n){
            val cont = scan.nextLine().split("-")
            map.put(cont[0], cont[1])
        }
        val busca = scan.nextLine()
        var cout = 0

        if (map.containsValue(busca)){
            for (x in map) {
                if (x.value == busca) {
                    cout++
                }
            }
        }
        println(cout)
    }
}