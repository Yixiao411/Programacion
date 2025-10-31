//Aquest estiu caminant pel barri de La Rosaleda, a Màlaga, es va fer l’hora de dinar ... i vet aquí que vaig trobar un lloc on venien pollastres rostits ...
//
//No m’agrada fer publicitat, però era “el asador rosaleda” ... i de seguida vaig veure una cosa curiosa al seu nom ... si el partíem per la meitat,
// les lletres de cada meitat eren les mateixes!!!, incloent-hi els espais.

import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    //repeticions
    val rep = scan.nextLine().toInt()
    repeat(rep){
        //llegim frase de entrada y asignem el longitud a un variable
        val frase = scan.nextLine()
        val longitudMedio = frase.length/2
        //Array vacio
        var arrPrimero = Array<Char>(longitudMedio){' '}
        var arrSegundo = Array<Char>(longitudMedio){' '}
        //si el longitud de frase es parell
        if (frase.length %2 ==0) {
            for (i in 0 until longitudMedio){ //per meitat de frase
                arrPrimero[i]=frase[i] //afegim primer meitat a arrPrimer
                arrSegundo[i]=frase[i+longitudMedio] //afegim el segon meitat a arrSegon sumant a i el longitud de mitg
            }
        }
        else {        //si el longitud de frase es senar
            for (i in 0 until longitudMedio){ //per meitat de frase
                arrPrimero[i]=frase[i] //afegim primer meitat a arrPrimer
                arrSegundo[i]=frase[i+longitudMedio+1] //i + longitud de mitg + 1
            }
        }
        //ordena per comparar
        arrPrimero.sort()
        arrSegundo.sort()
        //comparar si tenen mateix element
        var esIgual = true
        for (i in 0 until arrPrimero.size){
            if (arrPrimero[i]!=arrSegundo[i]) esIgual=false
        }
        //mostra resultat
        if (esIgual) println("SI") else println("NO")
    }
}