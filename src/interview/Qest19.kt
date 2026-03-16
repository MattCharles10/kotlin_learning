package interview

class Qest19 {

    fun checkEvenOdd(num : Int) : String{
        return if (num % 2 == 0) "Even" else "Odd"
    }

    fun findlargest(arr : IntArray) : Int {
        var max = arr[0]
        for(i in 1 until arr.size){
            if(arr[i] > max){
                max = arr[i]
            }
        }
        return  max
    }

    // Count Vowels in String a String (Without lowerCase() or in)

    fun countVowels(str : String ) : Int {

        var count = 0

        val vowels = "aeiouAEIOU"

        for(i in 0 until return str.length){
            val c = str[i]
            for(v in vowels){
                if(c == v){
                    count++
                    break
                }
            }
        }
        return count
    }

   /* fun main(){
        println(countVowels("kotlin"))
    } */

}