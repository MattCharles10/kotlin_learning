package interview;

public class Quest32 {


    static  void revsArr(int arr []){

        int n = arr.length ;

        int left = 0  , right = n-1;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;

            left++ ;
            right-- ;

        }

    }


    public static void main(String [] args){

        int[] arr = { 1, 4, 3, 2, 6, 5 };

        revsArr(arr);

        for(int i = 0 ; i<arr.length ; i++){

            System.out.print(arr[i] + " ");
        }

    }

}
