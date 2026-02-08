package Arrays.javamom;

public class rotation {

    //Function to rotate the array
    static  void rotateArr(int arr [] , int d){

        int n = arr.length;

        d %= n ;

        rev(arr , 0 , d-1);

        rev(arr , d , n-1);

        rev(arr , 0 , n-1);


    }
    static  void rev(int arr [] , int start , int end){

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String []  args){

        int arr [] = {1,2,3,4,5,6};

        int d = 2 ;

        rotateArr(arr , d);

        for(int num : arr){
            System.out.print(num + " ");
        }



    }
}

/*WRONG: while (start < end) ← checks immutable parameters (never changes)

RIGHT: while (i < j) or while (left < right) ← checks mutable variables (changes each loop)*/

