//L'Albert és un noi molt aficionat als videojocs.
// A vegades, no es pot contenir i acaba jugant quan hi ha classe online.
// Com que és un noi orgullós, no desactiva la "Game Ativity" al Discord, ja que confia en
// que ningú es dona compte. El Marc, però, sol fixar-se en el que juguen els seus alumnes,
// però no l'importa si juguen o no, el que sí que fa és jutjar, com aquesta pàgina et jutja a tú.
// Si et pilla jugant algo que no accepta durant la classe, et posa a la Shitlist.
// Fes un programa per simular la ocasional vigilància del Marc per saber quin nivell de Shitlist li cauria a l'Albert a un dia qualsevol.
import java.util.Scanner

fun main() {
    //scanner
    val scan = Scanner(System.`in`)
    //casos
    val rep = scan.nextLine().toInt()
    repeat(rep) {
        //lista de activitats
        //cops que ha revisat
        //lista de hores revisades
        val lista = scan.nextLine().split(" ").filter { it.isNotEmpty() }.toMutableList() //lista actividad
        var cops = scan.nextLine().toInt()
        val horas = scan.nextLine().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.toMutableList()
        //sortida de shitlist
        var shitlist = 0
        //lista de jocs y valor de cada un
        val HDZ = listOf("HollowKnight", "DarkSouls", "Zelda")
        val eclipse = 0
        val lol = 2
        //per cada hora mirat, la activitat del posicio suma punts o no fa res
        for (hora in horas) {
            //la posicion actual es restant la hora -15
            val pos = hora - 15
            //si es una hora correcte, si es lol +2 si es un dels HDZ y no es eclipse sumara 1
            when (hora) {
                15, 16, 17, 18, 19, 20 -> if (lista[pos] == "LoL") {
                    shitlist += lol
                } else if (lista[pos] !in HDZ&&lista[pos]!="Eclipse") {
                    shitlist++
                }
            }
        }

        //mostra resultat
        println("Nivell de Shitlist: $shitlist") //mostra resultat
    }
}
