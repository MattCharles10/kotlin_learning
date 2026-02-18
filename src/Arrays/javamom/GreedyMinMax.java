package Arrays.javamom;

public class GreedyMinMax {

    static int min(int a , int b , int c){
        return Math.min(a,Math.min(b,c));
    }

    static  int max(int a, int b , int c){
        return Math.max(a,Math.max(b,c));
    }

    static int maxProd(int arr[]){
        int n = arr.length;

        int currMin = arr[0];

        int currMax = arr[0];

        int maxProd = arr[0];

        for(int i = 1 ; i<n ; i++){

            // Temporary variable to store the maximim product ending
            // at the current index
            int temp = max(arr[i] , arr[i]* currMin, arr[i]*currMax  );

            currMin = min(arr[i] , arr[i]*currMin , arr[i]*currMax);

            currMax  = temp ;

            maxProd = Math.max(maxProd,currMax);

        }
        return maxProd ;
    }

    public static void main(String  [] args){

        int [] arr = {-2 , 6 , -3 , -10 , 0 , 2};
        System.out.println(maxProd(arr));

    }
}
