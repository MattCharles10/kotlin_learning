package interview;

public class Quest34 {

    static  int[] rotateArr(int arr [] , int d){

        int n = arr.length ;

        d%=n ;



        reverrr(arr , 0 , d-1);

        reverrr(arr , d , n-1);

        reverrr(arr , 0 , n-1);

        return arr ;

    }

    static void reverrr(int arr [] , int start , int end){

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;

            start++;
            end--;
        }
    }

    public static void main(String [] args){

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr , d);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
