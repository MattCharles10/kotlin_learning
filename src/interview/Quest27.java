package interview;


/*
Input: arr[] = [12, 35, 1, 10, 34, 1]

Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.

 */


public class Quest27 {


    static int Onepass(int arr []){

        int n = arr.length;

        int secrole = -1 , larole = -1 ;

        for(int i=0 ; i<n ; i++){

            if(arr[i] > larole){
                secrole = larole ;
                larole = arr[i] ;
            } else if (arr[i] < larole && arr[i] > secrole) {
                secrole = arr[i] ;
            }

        }
        return secrole ;
    }


    public static  void main(String[] args){
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(Onepass(arr));
    }
}
