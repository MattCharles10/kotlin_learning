package Arrays.javamom;

public class CircularSumMax {

    static int MaxCircularSum(int arr []){
        int n = arr.length;

        int totalsum = 0;

        int currMaxsum = 0 , currMinsum = 0 ;

        int maxSum = arr[0] , minSum = arr[0];

        for(int i =0 ; i<n ; i++){

            //using kaden algrothim finding max
            currMaxsum = Math.max(currMaxsum+arr[i] , arr[i]);
            maxSum = Math.max(maxSum , currMaxsum);

            //using kaden algrothim finding min
            currMinsum = Math.min(currMinsum+arr[i] , arr[i]);
            minSum = Math.min(minSum ,currMinsum);

            totalsum += arr[i];
        }

        int normalSum = maxSum;
        int circularSum = totalsum - minSum;

        if(minSum == totalsum){
            return  normalSum;
        }

        return Math.max(circularSum,normalSum);
    }


    public static void main(String [] args){
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(MaxCircularSum(arr));
    }
}
