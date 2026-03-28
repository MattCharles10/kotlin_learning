package interview;

public class Quest31 {


    static void movieZeros(int arr [])
    {
        int n = arr.length ;

        int count = 0 ;

        for(int i = 0 ; i<n ; i++ ){

            if(arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp ;

                count++;

            }
        }

    }

    public static  void main(String[] args){

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        movieZeros(arr);

        for(int num : arr){
            System.out.print(num);
        }

    }
}
