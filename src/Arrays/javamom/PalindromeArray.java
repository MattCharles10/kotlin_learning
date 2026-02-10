package Arrays.javamom;

public class PalindromeArray {

    static  boolean isPalindrome(int arr []){

        if(arr == null && arr.length <= 1) return true ; // edge cases ............


        int start = 0 ;
        int end = arr.length-1;

        while(start<end){
            if(arr[start] != arr[end] ){
                return false ;
            }
            start++;
            end--;

        }
        return true;

    }


    public static  void main(String [] args){

        int arr [] = {1, 2, 3, 2, 1};
        int arr1 [] = {1, 2, 3, 4};

        System.out.println(isPalindrome(arr));
        System.out.println(isPalindrome(arr1));

    }
}
