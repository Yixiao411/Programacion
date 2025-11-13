//Per si era poc complicat l'anar a comprar, a sobre la mare vol comprovar si ho hem comprat tot i a quin preu.
// Com que ens fa comprar un munt de productes, quan ens pregunta pels kiwis remanem i remanem fins trobar-los. Estaria molt bé tenir-los ordenats...
//Si trobem el producte li direm "SI, M'HA COSTAT " seguit del preu i,
// si no és el primer producte en ordre alfabètic,
// seguirem amb "I TAMBE TINC " producte " A " preu ,
// amb la informació del producte anterior en ordre alfabètic
import java.util.Scanner

//Crear data class de cistella de compra amb nom de producte y el seu preu
private data class Cistella(val producte: String, val preu: Float)

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    val rep = scan.nextLine().toInt() //repeticio
    val listaCompra = mutableListOf<Cistella>() //lsita de compra buida

    repeat(rep) { //per productes que n'hi ha sumem a la lista
        val nombre = scan.next()
        val precio = scan.nextLine().toFloat()
        listaCompra.add(Cistella(nombre, precio))
    }

    //lo que vol la mama y si tengo en la cistella
    val buscaMama = scan.nextLine()
    val siTengo = listaCompra.any { it.producte == buscaMama }

    if (!siTengo){ //si no tengo
        println("NO N'HI HAVIA")
    }else{ //si tengo
        listaCompra.sortBy { it.producte } //ordena por nombre
        val producteBuscat = listaCompra.find { it.producte == buscaMama } //el producte buscat
        if (producteBuscat == listaCompra.firstOrNull()){ //si el producte buscat es el primer de la lista
            println("SI, M'HA COSTAT ${producteBuscat?.preu}") //mostra resultat
        }
        else{ //si no es el primer
            val indice = listaCompra.indexOfFirst { it==producteBuscat } //el indice del producte que busquem
            val producteAnterior = listaCompra[indice-1] //el producte anterior
            println("SI, M'HA COSTAT ${producteBuscat?.preu} I TAMBE TINC ${producteAnterior.producte} A ${producteAnterior.preu}")
        }
    }
}