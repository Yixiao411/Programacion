import java.util.Scanner

private data class jugadores(val nombre: String, var posicion: Int)

fun main() {
    val scan = Scanner(System.`in`)
    val final = 63

    val casos = scan.nextInt()
    repeat(casos) {
        val juega = mutableListOf(
            jugadores("MARC", 0),
            jugadores("DANI", 0),
            jugadores("SANTI", 0)
        )
        var dadoMarc = scan.nextInt()
        val incMarc = scan.nextInt()
        var dadoDani = scan.nextInt()
        val incDani = scan.nextInt()
        var dadoSanti = scan.nextInt()
        val incSanti = scan.nextInt()
        var masLejos = 0
        var rondas = 0
        while (masLejos < final) {
            dadoMarc = dadoMarc.coerceAtMost(6)
            juega[0].posicion += dadoMarc
            dadoMarc += incMarc

            dadoDani = dadoDani.coerceAtMost(6)
            juega[1].posicion += dadoDani
            dadoDani += incDani

            dadoSanti = dadoSanti.coerceAtMost(6)
            juega[2].posicion += dadoSanti
            dadoSanti += incSanti

            rondas++
            juega[0].posicion += dadoMarc
            dadoMarc += incMarc
            juega[1].posicion += dadoDani
            dadoMarc += incDani
            juega[2].posicion += dadoSanti
            dadoMarc += incSanti
            //pozo de capitalismo
            if (juega.any { it.posicion % 13 == 0 }) {
                juega.forEach { it.posicion -= 3 }
            }
            //por cada q esta en oca
            juega.forEach {
                if (it.posicion % 4 == 0) {
                    it.posicion = goOca(it.posicion)
                }
            }

            masLejos=juega.maxOf { it.posicion }
        }
        juega.sortByDescending { it.posicion }
        println("R: $rondas - ${juega.first().nombre}" +
                " - ${juega[1].nombre} - pos: ${juega[1].posicion}" +
                " - ${juega[2].nombre} - pos: ${juega[2].posicion}")
    }
}

fun goOca(int: Int): Int {
    return int+4
}