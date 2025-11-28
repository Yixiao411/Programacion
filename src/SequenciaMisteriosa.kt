import java.util.Scanner

// Función para verificar si una lista es estrictamente creciente
fun esEstrictamenteCreciente(lista: List<Int>): Boolean {
    for (i in 0 until lista.size - 1) {
        if (lista[i] >= lista[i + 1]) {
            return false
        }
    }
    return true
}

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextLine().toInt()

    repeat(casos) {
        val nNum = scan.nextLine().toInt()
        val listaNum = scan.nextLine().split(" ").map { it.toInt() }
        var siCrece = false

        // Verificar si ya es estrictamente creciente
        if (esEstrictamenteCreciente(listaNum)) {
            siCrece = true
        } else {
            var encontradoQuiebre = false
            var i = 0

            // Buscar el primer quiebre sin usar break
            while (i < listaNum.size - 1 && !encontradoQuiebre) {
                if (listaNum[i] >= listaNum[i + 1]) {
                    encontradoQuiebre = true

                    // Primer intento: eliminar el elemento actual (i)
                    val listaSinActual = listaNum.toMutableList().apply { removeAt(i) }
                    if (esEstrictamenteCreciente(listaSinActual)) {
                        siCrece = true
                    } else {
                        // Segundo intento: eliminar el elemento siguiente (i+1)
                        val listaSinSiguiente = listaNum.toMutableList().apply { removeAt(i + 1) }
                        if (esEstrictamenteCreciente(listaSinSiguiente)) {
                            siCrece = true
                        }
                    }
                }
                i++
            }
        }

        if (siCrece) println("SI") else println("NO")
    }
}