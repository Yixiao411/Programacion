fun main(){
    val membreEquip = readln().toInt()
    val listaEquip = mutableListOf<List<String>>()
    for (i in 0 until membreEquip){
        val list = readln().split(",")
        listaEquip.add(list)
    }

    val copConsulta = readln().toInt()
    for (x in 0 until copConsulta){
        val alumne = readln()
        val result = "-"
        var coneguts = mutableSetOf<String>()
        for (k in listaEquip){
            if (k.contains(alumne)){
                for (j in k) {
                    if(j != alumne) coneguts.add(j)
                }
            }
        }
        if (coneguts.isEmpty()) println(result) else {
            val ordenats = coneguts.sorted()
            println(ordenats.joinToString(","))
        }


    }
}