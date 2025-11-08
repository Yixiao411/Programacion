import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val donante = scan.next()
    val recep = scan.next()
    when (donante) {
        "O-" -> println("SI")
        "O+" -> if (recep.contains("+")) println("SI") else println("NO")
        "B-" -> if (recep.contains("B")) println("SI") else println("NO")
        "B+" -> if (recep.contains("B+")) println("SI") else println("NO")
        "A-" -> if (recep.contains("A")) println("SI") else println("NO")
        "A+" -> if (recep == "AB+" || recep == "A+") println("SI") else println("NO")
        "AB-" -> if (recep.contains("AB")) println("SI") else println("NO")
        "AB+" -> if (recep == "AB+") println("SI") else println("NO")
    }
}