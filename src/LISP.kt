import java.util.Scanner
import kotlin.math.floor

fun main() {
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt()
    //repeat
    repeat(rep){
        val s = scan.nextLine().split("").filter { it.isNotBlank() }.toMutableList()

        var correcto = true
        //map de abiertura y cierre
        val pareja = mapOf("(" to ")", "{" to "}", "[" to "]", "<" to ">")
        val apertura = setOf("(", "{", "[", "<")
        val cierre = setOf(")", "}", "]", ">")
        //Si no esta vacia y sigue correcto
        while (s.isNotEmpty() && correcto){
            val delante = s.first() //Primer elemento

            when (delante) {
                ")","}",">","]" -> correcto = false //Si cierre esta delante esta mal
                "(","{","<","[" -> { //si encontramos una abertura
                    val detras = pareja[delante] //elemento q deberiamos buscar
                    var nivel = 0 //capas de parentesis
                    var posDef = -1 //posicion de cierre deseado

                    for (x in 1 until s.size) { //apartir del pos 1 pq el primero ya lo tenemos
                        if (s[x] in apertura) nivel++ //si encontramos un apertura entramos una capa
                        else if (s[x] in cierre) { //si es un cierre
                            //si esta en capa correcto guardamos la pos y salimos del bucle
                            if (nivel == 0 && s[x] == detras) {
                                posDef = x
                                break
                            } else if (nivel > 0) nivel-- //si estamos en un capa mas restamos una capa
                        }
                    }
                    //Si ha podido encontrar eliminamos el correspondiente
                    //Y sino se ha encontrado esta invalido
                    if (posDef != -1){
                        s.removeAt(posDef)
                        s.removeFirst()
                    }else correcto = false
                }

                else -> s.removeFirst() //en resto de caso
            }
        }

        if (correcto) println("si") else println("no")
    }
}