package String

fun isPalindrome( ){

    val str = "madam"

    var start = 0
    var end = str.length-1
    var ispalo = true

    while(start < end ){
        if(str[start] != str[end]){
            ispalo = false
            break
        }
        start++
        end--
    }
    println(ispalo)
}