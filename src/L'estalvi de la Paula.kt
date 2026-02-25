import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt()
    repeat(casos){
        val pConsola = scan.nextInt()
        val pSetmanal = scan.nextInt()
        val setmanas = scan.nextInt()
        var dinero = 0
        for(i in 0 until setmanas){
            if ((i+1)%2==1){
                if (dinero < pConsola) {
                    dinero += pSetmanal
                    if (dinero>pConsola) dinero=pConsola
                } else dinero=pConsola
            }
        }
        println(dinero)
    }
}