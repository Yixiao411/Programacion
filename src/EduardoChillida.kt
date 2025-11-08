import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val min = 88
    val max = 93
    val recte = 90
    val angle1 = scan.nextInt()
    val angle2 = scan.nextInt()
    val angle3 = scan.nextInt()
    if (angle1==recte||angle2==recte||angle3==recte||
        angle1<min||angle1>max||
        angle2<min||angle2>max||
        angle3<min||angle3>max){
        println("NO")
    }else{
        var angle4 = 360-angle1-angle2-angle3
        if (angle4 !in min..max||angle4==recte){
            println("NO")
        } else println("SI")
    }
}