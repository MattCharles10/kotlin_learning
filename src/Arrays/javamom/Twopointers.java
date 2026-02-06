package Arrays.javamom;

public class Twopointers {

    static  void reverseit(int arr []){
        int left = 0 ;

        int right = arr.length-1;

        while(left<right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }


    public static  void main(String [] args){

        int arr[] = {12, 23 , 34 , 45 ,56};

        reverseit(arr);

        for(int num : arr){



            System.out.print(num + " ");
        }


    }
}
