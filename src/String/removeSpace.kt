package String

class removeSpace {

    fun removeit(){
        val str = "How Are you devloper"
        var result = " "
        for(ch in str){
            if(ch != ' '){
             result += ch
            }
        }
       println(result)

    }
}