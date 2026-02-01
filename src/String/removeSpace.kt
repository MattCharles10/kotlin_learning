package String

class removeSpace {

   /* fun removeit(){
        val str = "How Are you devloper"
        var result = " "
        for(ch in str){
            if(ch != ' '){-----------------------------------> using for and if conditions
             result += ch
            }
        }
       println(result)

    }*/

    fun removeit(input : String) : String{

        // using replace in built functiion

        val nospace = input.replace(" " , "")

        return nospace

    }
}