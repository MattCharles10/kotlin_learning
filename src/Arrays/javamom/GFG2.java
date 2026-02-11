package Arrays.javamom;

public class GFG2 {

    public static void findElements(int arr[]){

        int n = arr.length;

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            if(arr[i] > largest){
                secondLargest = largest ;
                largest = arr[i];
            }

            else if(arr[i] > secondLargest && arr[i] != largest ){
                secondLargest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest" + " : " + smallest);
        System.out.println("secoundlargest" + " : "+ secondLargest);
        System.out.println("largest" + " :" + largest);


    }


    public static void main(String [] args){

        int[] arr = {12, 35, 1, 10, 34, 1};
        findElements(arr);

    }
}
