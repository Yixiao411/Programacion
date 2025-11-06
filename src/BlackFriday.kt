//La setmana que ve es Black Friday, així que en cert centre
// comercial van a pujar els preus massivament per a poder dir que en
// el black friday han fet grans rebaixes.
// Ajuda a redistribuïr el seu magatzem
import java.util.Scanner

fun main(){
    //scanner
    val scan = Scanner(System.`in`)
    //medida
    val row = scan.nextInt()
    val col = scan.nextInt()
    //iniciar matriu i in troduir valors
    var matriu = MutableList(row){MutableList(col){0}}
    for (i in 0 until row){
        for (x in 0 until col){
            matriu[i][x]=scan.nextInt()
        }
    }
    //augment q aplicara
    val augment = scan.nextInt()
    for (i in 0 until row){
        for (x in 0 until col){
            matriu[i][x] *= augment
        }
    }

    //mostra el resultat
    for (fila in matriu) {
        println(fila.joinToString(" "))
    }
}