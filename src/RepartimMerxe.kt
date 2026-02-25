fun main(){
    val rep = readln().toInt()
    var registro = mutableSetOf<String>()
    var count = 0
    repeat(rep){
        val nombre = readln()
        if (registro.contains(nombre)){
            count++
        }else registro.add(nombre)
    }
    println("${registro.size} $count")
}