import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //leer el numero de entrada y booleano de si es cap y cua o no
    val numero = scan.nextLine().split("").filter { it.isNotEmpty() }
    var siCapcua = true
    //si el tamany es 1 llavors mante false
    if (numero.size == 1) {
        null
    } else if (numero.size % 2 == 0) { //si es mateix longitud
        for (i in 0..numero.size / 2) { //per mitg de numero
            if (numero[i] != numero[numero.size - 1 - i]) { //si no es igual
                siCapcua = false
            }
        }
    } else {
        for (i in 0..<numero.size / 2) { //peri mitg -1 de numero
            if (numero[i] != numero[numero.size - 1 - i]) { //si no es igual
                siCapcua = false
            }
        }
    }
    //mostra resultat
    if (siCapcua) println("SI") else println("NO")
}