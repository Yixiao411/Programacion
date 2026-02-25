fun main(){
    val rep = readln().toInt()
    repeat(rep){
        var num = readln().toLong()
        var base = 2L
        var result = 1L
        while (num>0){
            if (num%2!=0L){
                result *= base
            }
            base *= base
            num /= 2
        }
        println(result)
    }
}


//NO acabado