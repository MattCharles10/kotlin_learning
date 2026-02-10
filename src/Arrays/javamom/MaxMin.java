package Arrays.javamom;

public class MaxMin {

    public static void MaxMinArr(int arr []){

        int n = arr.length ;

        int Max = arr[0];

        int Min = arr[0];

        for(int i=0 ; i<n ;i++){
            if(arr[i] > Max){
                Max = arr[i];
            } else if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("Maximum: " + Max);
        System.out.println("Minimum:" + Min);
    }


    public static void main(String [] args){

        int[] arr = {3, 5, 1, 8, 2, 9, 4};
        MaxMinArr(arr);

    }
}
