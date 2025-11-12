//Aquest mes celebrarem el Carnaval. Per finalitzar la festa tenim la cavalcada, on tothom s’acumula
// per poder disfrutar-la al màxim. Però els més baixets tenen grans dificultats per disfrutar-la.
// Quins podran veure-la sense obstacles?
import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //tamany
    var tamany = scan.nextInt()
    //fins que no esta buiuda
    while (tamany != 0) {
        val alturas = MutableList<Int>(tamany) { -1 } //lista de altura de persones
        for (i in alturas.indices) { //llegir eles persones
            alturas[i] = scan.nextInt()
        }
        var pVisibles = 0 //persones que veu
        var alturaMax = -1 //altra de persona mes alt pins aquell posicio
        //contem de aprop a alluyat
        for (altura in alturas.size - 1 downTo 0) {
            if (alturaMax < alturas[altura]) { //si es mes alt es veu
                alturaMax=alturas[altura]
                pVisibles++
            }
        }
        //mostra resultat y llegim de nou el tamany
        println(pVisibles)
        tamany = scan.nextInt()
    }
}