import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //repeticio
    val rep = scan.nextLine().toInt()
    repeat(rep) {
        //persones, homer, y posicio de homer
        val people = scan.nextLine().split(" ").toMutableList()
        val homers = scan.nextLine()
        var posHomer = -1
        //per el primer homer guardem el seu posicio
        for (pp in 0 until people.size) {
            if (people[pp] == homers && posHomer == -1) {
                posHomer = pp
            }
        }
        //pasa el primer homer,o be que tingu una altre nom
        println(people.filterIndexed { index, name -> index == posHomer || name != homers })
    }
}