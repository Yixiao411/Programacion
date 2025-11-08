import java.util.Locale
import kotlin.math.PI
import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val diametro = scan.nextDouble()
    val ocupa = scan.nextDouble()
    val candidad = scan.nextDouble()
    val caballeros = ocupa*candidad
    var result = "NO"
    if (PI*diametro>caballeros){
        result = "YES"
    }
    println(result)
}