import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val tracks = scan.nextInt()
    var rpm = scan.nextInt()
    var rpmAnterior = rpm
    var total = rpm
    var dinamic = 0
    var maxRpm = rpm
    var minRpm = rpm
    repeat(tracks-1) {
        rpm = scan.nextInt()
        total+=rpm
        if (rpm in rpmAnterior-10..rpmAnterior+10) {
            dinamic++
        }
        if (maxRpm < rpm) maxRpm = rpm
        if (minRpm > rpm) minRpm = rpm

        rpmAnterior = rpm
    }
    var media: Float = total / tracks.toFloat()

    println("Smooth Transitions: $dinamic")
    println("Dynamic Range: ${maxRpm-minRpm}")
    if (media%1==0f) println("Average BPM: ${media.toInt()}") else println("Average BPM: $media")
}