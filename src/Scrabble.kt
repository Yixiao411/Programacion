//En el joc d’Scrabble es disposa d’un taulell de 15x15 caselles on cada jugador forma
// paraules encadenades fins que no resten fitxes per col.locar.
// Les paraules es formen amb lletres (cada lletra en una fitxa). A cada joc hi ha un nombre determinat de lletres,
// les més habituals estan repetides vàries vegades, però hi ha lletres que es troben una o dos vegades únicament.
// En aquesta ocasió considerem es juga a les 26 lletres de l’alfabet anglès (de l’A a la Z).

import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    //repeticions
    val rep = scan.nextLine().toInt()
    repeat(rep) {
        //leemos candidad de letras de entrada y iniciamos un array de abecadario con lestras en la misma posicion
        var quantitats = scan.nextLine().split(" ").map{it.toInt()}.toTypedArray()
        val abecedario: Array<String> = ('A'..'Z').map { it.toString() }.toTypedArray()
        var conseguits = 0 //candidade de letras conseguidos a completar
        var paraula = "" //paraula que ha introducido
        var paraulaFormat = "" //paraula que se ha podido formar
        //si no es un .
        while(paraula!="."){
            var usats : Array<Int> = Array(26){0} //arra de caracters que necessitamos para la parabra actual
            paraula = scan.nextLine().uppercase() //leemos la parabra que introduce y convertimos en mayuscula
            //si no es un .
            if (paraula!=".") {
                //formamos la paraula en array de letras con split y filter
                var letras = paraula.split("").filter { it.isNotEmpty() }.toTypedArray()
                for (letraActual in 0 until letras.size) { //por cada letra de array de letras
                    for (abcActual in 0 until abecedario.size) { //comparamos con cada letra de abecedario si es igual
                        if (letras[letraActual] == abecedario[abcActual]) { //si es igual entonces sumamos uno al posicion de usats que esta la letra correspondiente
                            usats[abcActual]++
                        }
                    }
                }
                //booleano de si es posible formar la letra o no
                var posible = true
                for (i in 0 until quantitats.size) { //por longitud de abecedario
                    if (quantitats[i] < usats[i]) posible = false //si algun caso la quantitat de letras que hay es mas pequeño que las letras necessitadas posible sera false
                }
                //si es posibe
                if (posible) {
                    for (i in 0 until quantitats.size) { //restamos los caracteres usados
                        quantitats[i] -= usats[i]
                    }
                    //anadimos parabra formado a resultado y los conseguidos mas uno
                    paraulaFormat += "$paraula "
                    conseguits++
                }
            }
        }
        //mostra la resultat qutando el espacio del final
        println("$conseguits ${paraulaFormat.removeSuffix(" ")}")
    }
}