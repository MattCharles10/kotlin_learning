package interview;

// Secound Largest Element





public class Quest25 {


    static  int  FindySec(int arr []){

        int n = arr.length ;

        int secoundlar = -1  , lar = -1 ;

        //To Find the Largest element
        for(int i = 0 ; i<n ; i++){
            if(arr[i] > lar){
                lar = arr[i] ;
            }
        }

        //To Find the SecoundLargest Element
        for(int i =0 ; i<n ; i++){
            if(arr[i] > secoundlar && arr[i] != lar){
                secoundlar = arr[i] ;
            }
        }
        return secoundlar ;
    }


    public static  void main(String [] args){

        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println(FindySec(arr));

    }
}
