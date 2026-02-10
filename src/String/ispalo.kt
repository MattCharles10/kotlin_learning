package String

object ispalo {

    fun isplao(Str : String) : Boolean{
       return Str == Str.reversed()
    }

    fun isPalindromeCaseInsensitive(Str : String) : Boolean{
        var clean = Str.lowercase()
        return  clean == Str.reversed()

    }

    fun isPalindromeIgnoringSpaces(Str : String) : Boolean{
        var clean = Str.filter { !it.isWhitespace() }
        return clean == Str.reversed()
    }

    fun isPalindromeManual(Str : String): Boolean{
        var s =0
        var l = Str.length-1

        while(s<l){
           if(Str[s] != Str[l]){
               return false
           }
            s++
            l--

        }
        return true
    }
}