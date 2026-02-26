import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt()
    repeat(rep){
        val interval = scan.nextLine().toInt()
        val list = scan.nextLine().split(" ").toMutableList()

        list.forEach { plat->
            if ((list.indexOf(plat)+1)%interval != 0){
                if(list.indexOf(plat)!=list.lastIndex){
                    print("$plat ")
                }else println("$plat")
            }
        }
    }
}