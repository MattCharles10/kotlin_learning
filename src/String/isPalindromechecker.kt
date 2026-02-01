package String

class isPalindromechecker {

    fun isPaindro(Str : String ) : Boolean{

        return Str == Str.reversed()
    }

    fun isPalindromeManual(Str: String) : Boolean{

        var start = 0
        var end = Str.length - 1

        while(start < end){
            if(Str[start] != Str[end]){
                return false
            }
            start++
            end--
        }
        return  true
    }
}