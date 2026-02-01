package String

fun countvow(){

    val str = "Android"
    var count = 0

    for (ch in str.lowercase()) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++
        }
    }
    println("Vowels count: $count")
}

