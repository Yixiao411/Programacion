import java.util.Scanner

private data class alumne(val nombre: String, val ejercicio: Int, val correctos: Int)

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    repeat(casos) {
        var alumos = mutableListOf<alumne>()
        var salida = mutableListOf<alumne>()
        //linies correctes
        val liniesCorrectes = scan.nextInt()
        scan.nextLine()
        repeat(liniesCorrectes){
            val info = scan.nextLine().split(" - ")
            println("$info")
            alumos.add(alumne(info[0], info[1].toInt(), info[2].toInt()))
        }
        val liniesIncorrectos = scan.nextInt()
        repeat(liniesIncorrectos){
            val info = scan.nextLine().split(" - ")
            println("$info")
            alumos.add(alumne(info[0], info[1].toInt(), (info[2].toInt())*-1))
        }
        for (al in alumos) {
            println(al)
        }

    }
}