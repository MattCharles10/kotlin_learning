package String

fun index(){

    val str = "kotlin"

    for( i in str.indices){
        println("index of $i -> ${str[i]}")
    }
}