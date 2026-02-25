import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val personas = scan.nextInt()
    val atributs = scan.nextInt()
    val preguntes = scan.nextInt()
    val Y = true
    val N = false

    var lista = MutableList(personas){ MutableList(atributs+1){Y} }
    for (persona in 0 until personas){
        val att = scan.next().split("").filter { it.isNotEmpty() }
        for (atribut in 1 until atributs){
            when(att[atribut]){
                "Y" -> lista[persona][atribut] = Y
                "N" -> lista[persona][atribut] = N
            }
        }
    }

    for (pre in 0 until preguntes){

    }



    for (persona in lista){
        println(persona.joinToString(" "))
    }
}