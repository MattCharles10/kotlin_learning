package Arrays.javamom;

public class GFG2 {

   public static void findElements(int arr[]){
       int n = arr.length;

       int smallest = Integer.MAX_VALUE;
       int secondlargest = Integer.MIN_VALUE;
       int largest = Integer.MIN_VALUE;

       for(int i = 0 ; i<n ; i++){
           if(arr[i] > largest){
               secondlargest = largest;
               largest = arr[i];
           }
           else if(arr[i] > secondlargest && arr[i] != largest){

               secondlargest = arr[i];
           }
           if(arr[i] < smallest){
               smallest = arr[i];
           }
       }
       System.out.println("Smallest" + " : " + smallest);
       System.out.println("Largest" + " : " + largest );
       System.out.println("Secoundlargest" + " : " + secondlargest);
   }

   public static  void main(String [] args){

       int arr [] =  {12 , 34 , 45 , 56, 78 , 1};

       findElements(arr);


   }
}
