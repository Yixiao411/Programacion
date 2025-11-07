//Molt software gràfic es basa en el que es coneixen com rasters.
// El cas més senzil de ràster es el que tracta una pantalla com una matriu de pixels i després hi dibuixa.
import java.util.Scanner

fun main(){
    //scanner
    val scan = Scanner(System.`in`)
    //medida
    val row = scan.nextInt()
    val col = scan.nextInt()
    //iniciar matriu i in troduir valors
    var matriu = MutableList(row){MutableList(col){"."}}
    //inici i final de rectangle
    val iniciX = scan.nextInt()
    val iniciY = scan.nextInt()
    val finalX = scan.nextInt()
    val finalY = scan.nextInt()
    scan.nextLine()
    //por . que estan dentro de la area se cambia por X
    for(fila in matriu.indices){
        for (columna in matriu[fila].indices){
            if (fila>=iniciX&&columna>=iniciY&&fila<=finalX&&columna<=finalY){
                matriu[fila][columna]="X"
            }
        }
    }
    //mostra el resultat de pantalla
    for (row in matriu){
        println(row.joinToString (" "))
    }

}