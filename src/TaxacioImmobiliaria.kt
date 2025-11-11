import java.util.Locale
import java.util.Scanner
//El mercat immobiliari a la ciutat de Barcelona s'ha tornat boig, i per això, la nostra amiga Mika Soplon propietària de la coneguda agència immobiliària líder del moment, ens demana ajuda per fer les taxacions dels immobles que té en cartera. Com que els preus són molt canviants, per a cada nova taxació cal introduïr els preus actualitzats.
// El que no canvia és la seva manera de taxar els pisos. A continuació es detalla aquesta manera de taxar-los:
fun main() {
    //executa scanner
    val scan = Scanner(System.`in`).useLocale(Locale.UK)
    //valors de entrada
    val vHabitatgeNou = scan.nextInt()
    val vHabitatgeSegonaMa = scan.nextInt()
    val vPreuHabitacio = scan.nextInt()
    val preuReforma = scan.nextInt()
    val preuAscensor = scan.nextInt()
    val pcPintura = scan.nextFloat()
    val pcMobles = scan.nextFloat()
    //preguntes fixes y valor final de sortida
    val preguntes = 8
    var valorFinal = 0f
    //si te mes per escanejar
    while (scan.hasNext()){
        //Boolean per preguntes y contador
        var habitatgeNou = false
        var reformaCuina = false
        var reformaBany = false
        var ascensor = false
        var pintura = false
        var mobles = false
        var numHabitacio = 0
        var altura = 0
        //repeteix fin q acabi les preguntes
        for(i in 0 until preguntes){
            //llegeix la resposta y imprimeix segon la pregunta
            var resposta = scan.next()
            when(i){
                0->if (resposta=="N") habitatgeNou=true
                1->numHabitacio=resposta.toInt()
                2->if (resposta=="S") reformaCuina=true
                3->if (resposta=="S") reformaBany=true
                4->if (resposta=="S") ascensor=true
                5->altura=resposta.toInt()
                6->if (resposta=="S")pintura=true
                7->if (resposta=="S")mobles=true
            }
        }
        //si es un habitatgenou
        if (habitatgeNou){
            //suma valor de habitage y valor de habitacio per numero
            valorFinal+=vHabitatgeNou+(vPreuHabitacio*numHabitacio)
            //si te ascensor sumara segon pis
            if (ascensor){
                when(altura){
                    0->null
                    in 1..2->valorFinal+= preuAscensor/2
                    else -> valorFinal += preuAscensor
                }
            }
            //si te pintura o moble incrementa o decrementa segon preu
            if (pintura) valorFinal -= valorFinal*pcPintura/100
            if (mobles) valorFinal += valorFinal*pcMobles/100
        }
        //si es un habitatge de segona ma
        if (!habitatgeNou){
            //suma valor de habitage y valor de habitacio per numero
            valorFinal+=vHabitatgeSegonaMa+(vPreuHabitacio*numHabitacio)
            //si te ascensor sumara segon pis
            if (ascensor){
                when(altura){
                    0->null
                    in 1..2->valorFinal+= preuAscensor/2
                    else -> valorFinal += preuAscensor
                }
            }
            //si esta els dos reformat o nomes un reformat
            if (reformaCuina&&reformaBany){
                //en cas de els dos reformat es multiplicara per 3
                valorFinal+=preuReforma*3
            }else if (reformaCuina||reformaBany){
                valorFinal+=preuReforma
            }
            //si te pintura o moble incrementa o decrementa segon preu
            if (pintura) valorFinal *= pcPintura
            if (mobles) valorFinal *= pcMobles
        }
        //mostra el resulta y reinicia el valorFinal
        println(String.format("%.2f",valorFinal))
        valorFinal = 0f
    }
}