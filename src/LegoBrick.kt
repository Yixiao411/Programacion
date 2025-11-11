import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val rep = scan.nextInt()
    val brick = arrayOf(1,2,3,4,6,8,10)
    val maxNum = 64
    val arr = Array<Long>(maxNum+1){0}
    arr[0] = 1
    for (i in 1 until maxNum){
        for (br in brick){
            if (i-br >= 0){
                arr[i] += arr[i-br]
            }
        }
    }
    repeat(rep){
        val longitud = scan.nextInt()
        println(arr[longitud])
    }
}