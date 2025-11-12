//El Cap d'estudis m'ha cridat l'atenció per les sabates que duc, que estan totalment
// trencades. He intentat convencer-lo de que les sabates trencades son l'evoució lògica dels
// texans estripats i que per tant vaig a la moda, pero m'ha dit que em compri unes noves sabates.
// Jo calço un 42, pero realment un 41 o un 43 ja em van bé.
import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    //numero de casos
    val rep = scan.nextInt()
    repeat(rep){
        val sabates = scan.nextInt() //quantitat de sabates
        val medidas = MutableList(sabates){-1} //iniciar lista
        for (i in 0 until sabates){ //llegir entrada de medidas
            medidas[i] = scan.nextInt()
        }
        val miCalzado = scan.nextInt() //mi calzo
        val adap = scan.nextInt() //calzado que es pot adaptar

        //saber cuales puedo adaptar
        //añadimos el nuestro y luego hacia arriba y hacia abajo
        val adapCalzados = mutableListOf<Int>()
        adapCalzados.add(miCalzado)
        for (i in 1..adap){
            adapCalzados.add(miCalzado+i)
        }
        for (i in 1..adap){
            adapCalzados.add(miCalzado-i)
        }
        //ordenar asi queda bonito
        adapCalzados.sort()
        //buscar en medidas
        var adapta = 0
        for (medida in medidas){
            if (adapCalzados.contains(medida)){
                adapta++
            }
        }
        //decir cuantas hay
        println(adapta)

    }

}