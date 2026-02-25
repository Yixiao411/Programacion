import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt()

    repeat(rep) {
        val tasks = scan.nextInt()
        val llocSaber = scan.nextInt()
        scan.nextLine()

        val tareas = mutableListOf<Pair<Int, String>>()

        repeat(tasks) {
            val linea = scan.nextLine()
            val espacio = linea.indexOf(" ")
            val prioridad = linea.substring(0, espacio).toInt()
            val nombre = linea.substring(espacio + 1)
            tareas.add(Pair(prioridad, nombre))
        }

        val ordenadas = tareas.sortedBy { it.first }

        println(ordenadas[llocSaber - 1].second)
    }
}