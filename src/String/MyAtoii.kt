package String

fun myAtoii(s : String) : Int{
    var i = 0 ;
    val n = s.length
    val INT_MAX = Int.MAX_VALUE
    val INT_MIN = Int.MIN_VALUE

    while(i<n && s[i] == ' '){
        i++
    }

    //Handel sign
    var sign = 1
    if(i<n && (s[i] == '+' || s[i] == '-')){
        sign = if(s[i] == '-') -1 else 1
        i++
    }
    //Convert digits
    var result = 0

    while(i<n && s[i].isDigit()){
        val digit = s[i] -'0'

        if(result > (INT_MAX - digit) / 10){
            return  if(sign == 1) INT_MAX else INT_MIN
        }
        result = result * 10 + digit
        i++
    }
    return result*sign
}