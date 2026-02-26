import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextInt()
    repeat(rep) {
        val n = scan.nextInt()
        scan.nextLine()
        val map = mutableMapOf<String, String>()
        repeat(n-1) {
            val amistat = scan.nextLine().split(" ")
            map[amistat[0]] = amistat[1]
            if (map.containsKey(amistat[1])){
                map[amistat[1]] = amistat[0]
            }
        }
        val buscat = scan.nextLine()
        var encontrado = false
        for (ami in map.keys){
            if (!encontrado){
                println(map[ami])
                encontrado = true
            }
        }
    }
}