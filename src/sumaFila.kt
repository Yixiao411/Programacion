//A vegades, en la vida, tens que sumar files. Això no és el mateix que sumar filles.
// Sumar filles sona a algo masclista, i seria millor que no passes. Per que es diuen files les files? Segons google ve de "filum", que en llatí és una vora finíssima,
// però no veig que té a veure.
// Tot això no té sentit. No hauria d'escriure més enunciats de problemes.
import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //Llegueix fila i columna que ve de entrada
    var fila = scan.nextInt()
    var columna = scan.nextInt()
    scan.nextLine()
    //inicia matriu
    var matriu = mutableListOf<MutableList<Int>>()
    //introduir els valors
    for (i in 0 until fila){
        matriu.add(scan.nextLine().split(" ").map{ it.toInt() }.toMutableList())
    }
    //llegeix l afila y columna que vol sumar
    var filaColumna = scan.nextInt()
    var totalFila = 0
    var totalColumna = 0
    //suma de fila
    for (i in 0 until matriu[filaColumna].size){
        totalFila += matriu[filaColumna][i]
    }
    //suma de columna
    for (i in 0 until fila){
        totalColumna += matriu[i][filaColumna]
    }
    //mostra el resultat
    println("$totalFila $totalColumna")
}