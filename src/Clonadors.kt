//comencen per 1
//acaben per 1
//entre dos uns consecutius, el número de zeros és constant. Sigui N aquest número de zeros Aleshores estem davant d’un número N+1 clonador.?
import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //intro
    var numero = scan.nextInt()
    //fins que no esta buiuda
    while (numero != 0) {
        val listaN = numero.toString().split("").filter{it.isNotEmpty()}
        var pos1_1 = 0
        var pos1_2 = 0
        var count0 = 0
        var siClon = true
        if (listaN[0]=="1"&&listaN[listaN.size-1]=="1"){
            for (i in listaN.indices){
                when(listaN[i]){
                    "0"->{

                    }
                    "1"->{
                        if (pos1_1==0) pos1_1 = i
                        if (pos1_2==0&&pos1_1!=0) pos1_2 = i
                    }
                }
            }

            if (siClon) println(count0+1) else println(0)
        }else println("0")
        numero = scan.nextInt()
    }
}