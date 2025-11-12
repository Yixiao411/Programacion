//comencen per 1
//acaben per 1
//entre dos uns consecutius, el número de zeros és constant. Sigui N aquest número de zeros Aleshores estem davant d’un número N+1 clonador.?
import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //intro
    var numero = scan.nextLine().toString()
    //fins que no esta buiuda
    while (numero != "0") {
        var max0 = -1
        var count0 = 0
        var siClon = numero[0] == '1' && numero[numero.length-1] == '1'
        if (siClon) {
            for (i in 1 until numero.length) {
                when (numero[i]) {
                    '0' -> count0++
                    '1' -> {
                        if (max0 == -1) {
                            max0 = count0
                        } else if (count0 != max0) {
                            siClon = false
                        }
                        count0 = 0
                    }
                }
            }

            if (siClon) {
                if (max0==-1){
                    println(1)
                }else {
                    println(max0 + 1)
                }
            } else {
                println(0)
            }
        } else println(0)
        numero = scan.nextLine()
    }
}