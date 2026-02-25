import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var pPerdut = 0
    var pGuanyat = 0
    var pCaidas = 0
    var guanyat = false
    while (scan.hasNext()){
        val valor = scan.nextInt()
        val action=scan.next()
        when(action){
            "M"->{
                pPerdut+=pCaidas
                pCaidas = valor
                pGuanyat = 0
            }
            "D"->{
                pGuanyat=valor
            }
            "G"->{
                pGuanyat = valor+pCaidas
                pCaidas = 0
                guanyat=true
            }
        }
    }
    println("P: $pPerdut")
    println("A: $pGuanyat")
    if (!guanyat) println("D")
    else if (pGuanyat>pPerdut) println("SI")
    else if (pPerdut==pGuanyat) println("IGUAL")
    else println("NO")
}