//L’entrada consisteix en un seguit de línies. Cada línia és un conjunt d’uns
// i zeros, sense espais entremig.
// Els casos acaben amb una línia amb el valor ‘0’, que no s’haurà de processar.

// Leer hasta que llegue un 0
// Leer la línea
// Comprobar que empiece y acabe en 1
// Contar los 0s que hay entre dos 1s consecutivos
// Si siempre hay los mismos --> imprimir n+1
// Si no se cumple alguna de las condiciones --> imprimir 0
import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    // Leer la línea
    var linea = scan.nextLine()
    // Leer hasta que llegue un 0
    while (linea != "0") {
        // Comprobar que empiece y acabe en 1
        var clonador = true
        clonador = linea.first() == '1' && linea.last() == '1'

        if (clonador) {

            var cuentaCeros = 0
            var numCeros = -1
            // Contar los 0s que hay entre dos 1s consecutivos
            for (pos in 1 until linea.length) {
                if (linea.get(pos) == '1') {
                    //llega un 1
                    if (numCeros == -1) {
                        numCeros = cuentaCeros
                    }
                    if (cuentaCeros != numCeros) {
                        clonador = false
                    }
                    cuentaCeros = 0
                } else {
                    // Llega un 0
                    cuentaCeros++
                }
            }
            // Si siempre hay los mismos --> imprimir n+1
            // Si no se cumple alguna de las condiciones --> imprimir 0
            if (clonador) {
                if (numCeros==-1){
                    println(1)
                }else println(numCeros + 1)
            } else println(0)

        } else println(0)
        // Leer la línea
        linea = scan.nextLine()
    }
}