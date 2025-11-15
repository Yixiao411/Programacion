//Amb la inflació disparada el cistell de la compra s'ha posat pels núvols.
// Ajuda'ns a triar els millors productes.
//Cal mostrar 3 línies, amb el producte més car, més barat i el que ocupa la posició P si ordenem del més car al més barat.
//La primera línia mostrarà "EL MES CAR: " seguit del nom i el preu del producte, separats per un espai.
//La segona línia mostrarà "EL MES BARAT: " seguit del nom i el preu del producte, separats per un espai.
//La tercera línia mostrarà "EL BUSCAT: " seguit del nom i el preu del producte, separats per un espai.

import java.util.Scanner

//Crear data class de cistella de compra amb nom de producte y el seu preu
private data class CistelldeCompra(val producte: String, val preu: Float)

fun main(){
    //scanner
    val scan = Scanner(System.`in`)
    val compra = mutableListOf<CistelldeCompra>() //lista de objectes de cistella de compra
    val rep = scan.nextInt() //productes que n'hi ha
    repeat(rep){
        val product = scan.next() //el producte
        val preu = scan.nextLine().toFloat() //el preu
        compra.add(CistelldeCompra(product,preu)) //afegim a la lista
    }

    val producteBuscat = scan.nextInt()-1 //el producte que busquem per preu -1 en indice
    val producteMesCar = compra.maxBy { it.preu } //el producte amb el preu mes alt
    val producteMesBarat = compra.minBy { it.preu } //el producte amb el preu mes baix
    val producteN = compra.sortedByDescending { it.preu } //el producte amb el preu del ordre que busquem

    //mostra resultat
    println("EL MES CAR: ${producteMesCar.producte} ${producteMesCar.preu}\n" +
            "EL MES BARAT: ${producteMesBarat.producte} ${producteMesBarat.preu}\n" +
            "EL BUSCAT: ${producteN[producteBuscat].producte} ${producteN[producteBuscat].preu}"
    )
}