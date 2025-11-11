//El departament d'ensenyament ha dit que hem de baixar la ràtio d'alumnes.
// Per a aconseguir-ho, farem una loteria i tirarem a un pou amb caimans a aquells que la guanyin.
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //casos
    val rep = scan.nextInt()
    repeat(rep){
        //tamany
        val quantitat = scan.nextInt()
        var lista = MutableList<String>(quantitat){""} //lista buida
        for (i in lista.indices){ //asignar el valor introduit
            lista[i] = scan.next()
        }
        lista.removeAt(scan.nextInt()) //eliminar la posicio que vol
        println(lista.joinToString(" ")) //mostra resultat
    }
}
