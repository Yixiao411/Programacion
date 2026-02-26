import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    val espatllat = scan.nextLine()
    val map = mutableMapOf<String, Boolean>()
    repeat(n-1) {
        val interruptor = scan.nextLine()
        if (interruptor != espatllat) {
            if (map.containsKey(interruptor)){
                if (map[interruptor] == true){
                    map[interruptor] = false
                }else map[interruptor] = true
            }else{
                map.put(interruptor, true)
            }
        }else{
            map.keys.forEach { key ->
                map[key] = false
            }
        }
    }

    println("${map.count { it.value }} ${map.count { !it.value }}")

}