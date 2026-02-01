package String

object isPalindromechecker {

    fun isPaindro(Str : String ) : Boolean{

        return Str == Str.reversed()
    }

    fun isPalindriomeCasesensentive(Str: String) : Boolean{
        val cleanstr = Str.lowercase()
        return cleanstr == cleanstr.reversed()
    }

    fun  isPalindromeWithSpaces(Str: String) : Boolean{
        val cleanstr = Str.filter {
            !it.isWhitespace()
        }
        return cleanstr == cleanstr.reversed()
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