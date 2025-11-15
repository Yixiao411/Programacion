import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val casos = scan.nextLine().toInt()
    var est = 0L
    var pro = 0L
    var vis = 0L
    repeat(casos){
        val entrada = scan.nextLine().split(" ")
        if (entrada[0]=="EST") {
            if (entrada[1]=="IN") est += entrada[2].toLong()
            else est -= entrada[2].toLong()
        }
        if (entrada[0]=="PRO") {
            if (entrada[1]=="IN") pro += entrada[2].toLong()
            else pro -= entrada[2].toLong()
        }
        if (entrada[0]=="VIS"){
            if (entrada[1]=="IN") vis += entrada[2].toLong()
            else vis -= entrada[2].toLong()
        }
    }
    //println("$est $pro $vis")
    if (pro == 0L) {
        if (est == 0L && vis == 0L) {
            println("OK")
        } else {
            println("ALARMA ${est + vis}")
        }
    }else if (est<=pro*5&&vis<=pro){
        print("OK")
    }else{
        var visSobra = 0L
        var estSobra :Long = 0L
        if (vis>pro) visSobra = vis-pro
        if (est>pro*5) estSobra = est - (pro*5)
        print("ALARMA " + (estSobra+visSobra))
    }


}