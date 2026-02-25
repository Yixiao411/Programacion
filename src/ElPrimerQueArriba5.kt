import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    val map = mutableMapOf<String, Int>()
    val meta = 5
    var nom = scan.nextLine()
    while (nom != "xxx") {
        if (map.containsKey(nom)){
            map[nom] = map[nom]!! + 1
        } else {
            map.put(nom, 1)
        }
        nom = scan.nextLine()
    }
    if (map.values.any{it >= 5}){
        var imprimido = false
        for ((nombre, contador) in map) {
            if (contador >= meta&&!imprimido) {
                println(nombre)
                imprimido = true
            }
        }
    }else println("NO")
}