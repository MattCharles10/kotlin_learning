package Arrays;

import java.util.Arrays;

public class secondlargest {
   /* ----------------------------------------------------------------->//Time Complexity: O(n*log(n)),
     as sorting the array takes O(n*log(n)) time and
     traversing the array can take O(n) time in the worst case,
     so total time complexity = (n*log(n) + n) = O(n*log(n)).
     Auxiliary space: O(1), as no extra space is required. */

    static int getsecondlargest(int arr []){
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = n-2; i >=0 ; i--){
            if(arr[i] != arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static  void main(String[] args){
        int arr [] = {12,34,15,56,67,18};
        int result = getsecondlargest(arr);

        System.out.println("result is " + result);
    }
}

