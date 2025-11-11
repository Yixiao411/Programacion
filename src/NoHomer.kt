import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val rep = scan.nextInt()
    repeat(rep){
        val people = scan.nextLine().split(" ")
        val homers = scan.nextLine()
        for (pp in people.indices){
            if (people[pp] == homers&&people[pp+1] == homers){
                people[pp+1]
            }
        }
    }
}