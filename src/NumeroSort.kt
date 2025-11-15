import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    var numero = scan.nextLine().split("").filter{it.isNotEmpty()}.map { it.toInt() }.toMutableList()
    while (numero.size!=1){
        var numeroFinal = 1
        for (i in numero){
            if (i!=0) numeroFinal*=i
        }
        numero = numeroFinal.toString().split("").filter{it.isNotEmpty()}.map { it.toInt() }.toMutableList()
    }
    println(numero[0])
}