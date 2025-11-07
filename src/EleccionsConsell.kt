//L’excelent programador, superb professor i millor persona Gregorio deixa el
// consell escolar, i vol amanyar les votacions per a que no li torni a tocar.
// Fes un software per a ajudar a marcar vots en les eleccions al consell escolar del Institut
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //medida
    val rowCol = scan.nextInt()
    scan.nextLine()

    //iniciar matriu i in troduir valors
    var matriu = MutableList(rowCol){ MutableList(rowCol){"."} }
    //pintar
    for (row in matriu.indices){
        for (col in matriu.indices){
            //si es un borde pintamos a X
            if (row==0||row==matriu.size-1) matriu[row][col]="X"
            if (col==0||col==matriu.size-1) matriu[row][col]="X"
        }
        //pintada diagonal i inversa
        matriu[row][row]="X"
        matriu[row][rowCol-row-1]="X"
    }

    //mostra el resultat de pantalla
    for (row in matriu) {
        println(row.joinToString(" "))
    }
}
