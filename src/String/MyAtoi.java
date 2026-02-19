package String;

/*Input: s = "-123"
Output: -123

Input: s = "   -"
Output: 0
Explanation: No digits are present, therefore 0.

Input: s = "  1231231231311133"
Output: 2147483647
Explanation: The converted number is greater than 231 - 1, therefore print 231 - 1 = 2147483647.

Input: s = "-999999999999"
Output: -2147483648
Explanation: The converted number is smaller than -231, therefore print -231 = -2147483648.

Input: s = "  -0012gfg4"
Output: -12
Explanation: Nothing is read after -12 as a non-digit character 'g' was encountered.*/

public class MyAtoi {

    static  int myAtoi(String s){
        int sign = 1 , res = 0 , idx =0 ;

        //ignore whitespaces
        while(idx<s.length() && s.charAt(idx) == ' '){
            idx++;
        }
        //Store the sign of numbers
        if(idx<s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')){
            if(s.charAt(idx++) == '-'){
                sign = -1;
            }
        }
        //Construct the number digit by digit
        while(idx<s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9'){
            if(res>Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && s.charAt(idx) - '0' > 7)){
                return  sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = 10 * res +(s.charAt(idx++) - '0');
        }
        return res * sign;
    }

    public static void main(String [] args){

        String s = "  -0012g4";
        System.out.println(myAtoi(s));

    }
}
