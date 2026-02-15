package Arrays.javamom;

public class Majoritynby2 {

    static int FindNby2(int arr []){

        int n = arr.length;

        int candidate = -1 ;
        int count = 0 ;

        for(int num : arr){
            if(count == 0){
                candidate = num ;
            }
            if(num == candidate){
                count++;
            }else {
                count--;
            }
        }

        count = 0 ;
        for(int num : arr){
            if(num == candidate){
                count++;
            }

        }

        if(count > n/2){
            return candidate;
        }

        return -1;

    }



    public static void main(String[] args){
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        int result = FindNby2(arr);
        System.out.println(result);
    }
}
