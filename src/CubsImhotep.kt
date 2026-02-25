import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var casos = scan.nextInt()
    repeat(casos) {
        val bloques = scan.nextInt()
        var resultado = 0
        var bloquesNecesarios = 0
        var piso = 1
        if (bloques < 1) {
            println(0)
        } else {
            while (bloquesNecesarios+piso*piso <= bloques) {
                bloquesNecesarios += piso * piso
                piso++
                resultado++
            }
            println(resultado)
        }
    }
}