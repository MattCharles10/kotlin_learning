package Arrays.javamom;

/*Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.

Examples:

      Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
      Output: [1, 2, 4, 3, 5, 0, 0, 0]

Explanation: There are three 0s that are moved to the end.

        Input: arr[] = [10, 20, 30]
        Output: [10, 20, 30]

Explanation: No change in array as there are no 0s.

        Input: arr[] = [0, 0]
        Output: [0, 0]

Explanation: No change in array as there are all 0s. */

public class GfG1 {

    static  void pushzeros(int arr []){

      int n = arr.length ;

      int temp [] = new int[n];

      int j = 0 ;

      //Copy non-zeros elements
      for(int i = 0 ; i < n ;i++){
          if(arr[i] != 0){
              temp[j++] = arr[i];
          }
      }

      // remaining elements
      while(j<n){
          temp[j++]=0;
      }

      //Copy to original array
       for(int i=0; i < n ; i++){
           arr[i] = temp[i];
       }


    }

    public static  void  main(String[] args){

        int arr [] = {1, 2, 0, 4, 3, 0, 5, 0};

        pushzeros(arr);

        for(int num : arr){
            System.out.print
                    (num + " ");
        }

    }
}
