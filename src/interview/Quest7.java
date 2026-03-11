package interview;

public class Quest7 {

    static int SecoundLargest(int arr []){

        int n = arr.length ;

        int largest = -1 , secoundLargest = -1 ;

        //Finding largest Array

        for(int i=0 ; i<n ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        //Finding the SecoundLarge

        for(int i=0 ; i<n ; i++){
            if(arr[i] > secoundLargest && arr[i] != largest){
                secoundLargest = arr[i];
            }
        }

        return secoundLargest ;

    }


    public static void main(String [] args){

        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(SecoundLargest(arr));

    }
}
