package String

fun itCount(){

    val str = "Andriod"

    var count = 0

    for(ch in str){
        if( ch !=  ' ' ){
            count++
        }
    }

    println("the count of the String $count")

}