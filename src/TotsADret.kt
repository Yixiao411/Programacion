import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextInt()
    repeat(rep){
        val size = scan.nextInt()
        val deque = ArrayDeque<Int>()
        repeat(size){
            deque.add(scan.nextInt())
        }
        val desp = scan.nextInt()

        repeat(desp){
            val x = deque.last()
            deque.removeLast()
            deque.addFirst(x)
        }

        println(deque.joinToString(" "))
    }
}