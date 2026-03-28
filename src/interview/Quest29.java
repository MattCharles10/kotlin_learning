package interview;

public class Quest29 {

    static  void  moveZeros(int arr []){

        int n = arr.length ;

        int  j = 0 ;

        for(int i = 0 ; i< n ; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i] ;
            }

        }

        while(j < n){
            arr[j++] = 0 ;
        }
    }


    public static  void main(String[] args){

        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        moveZeros(arr);
        for(int num : arr){
            System.out.println( num + " ");
        }

    }
}
