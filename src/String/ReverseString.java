package String;

import  java.util.* ;

public class ReverseString {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = obj.nextLine();

        String rev = " " ;

        for(int i = str.length() - 1 ; i >= 0 ; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
