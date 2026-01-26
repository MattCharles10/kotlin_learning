package String

fun Interpolation(){

    val s1 = "mathew"
    val s2 = "charles"

    println("$s1$s2")

    val s3 = "Interview"
    val s4 = "bite"

    val s5 = s3 + s4
    val s6 = s4.plus(s1)

    val s7 = StringBuilder()

    s7.append(s5).append(s3)

    println("$s5")
    println("$s7")

}