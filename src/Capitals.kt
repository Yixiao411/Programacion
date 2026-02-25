import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt()
    repeat(rep){
        val n = scan.nextLine().toInt()-1
        var set = mutableMapOf<String, String>()
        repeat(n){
            val cont = scan.nextLine().split("-")
            set.put(cont[0], cont[1])
        }
        val busca = scan.nextLine()

        if (set.containsKey(busca)){
            for (x in set) {
                if (x.key == busca) {
                    println(x.value)
                }
            }
        }else {
            println("NO HO SE")
        }
    }
}