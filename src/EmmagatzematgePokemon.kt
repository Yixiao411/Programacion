import java.util.Scanner
//Alecs té dues aficions. Queixar-se i col·leccionar Pokèmon.
// No obstant, la seva col·lecció es tan gran que s’ha quedat sense espai al Banc Pokèmon.
// Per això, farà una neteja de tots els seus Pokèmon. Vol quedar-se amb només un Pokèmon de cada tipus (és a dir, no en vol de repetits),
// però vol quedar-se amb el que sigui de més nivell. Els Pokèmon tenen dues dades per a identificar-se.
// El seu nom a la Pokèdex, un nombre que va del 1 al 700, i el seu nivell, que va del 1 al 100.
// L’objectiu es comparar els Pokèmon i quedar-se amb el de més nivell, per tal de que no quedin de repetits
fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //repeticio y tamany
    val rep = scan.nextInt()
    val tamany = scan.nextInt()
    scan.nextLine()
    repeat(rep){
        val pokemons = scan.nextLine().split(" ").map { it.toInt() }.toMutableList()
        val nivels = scan.nextLine().split(" ").map { it.toInt() }.toMutableList()
        for (poke in pokemons.indices){
            for (poke2 in pokemons.indices){
                if (pokemons[poke2]==pokemons[poke]){
                    if (nivels[poke]<nivels[poke2]){
                        pokemons[poke] = -1
                        nivels[poke] = -1
                    }else if (nivels[poke]>nivels[poke2]){
                        pokemons[poke2] = -1
                        nivels[poke2] = -1
                    }
                }
            }
        }
        println(pokemons.filter { it!=-1 }.joinToString(" "))
    }
}