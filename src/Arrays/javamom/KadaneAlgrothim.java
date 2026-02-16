package Arrays.javamom;

public class KadaneAlgrothim {

    static  int MaxSum(int arr []){

        int n = arr.length;

        int maxending = arr[0];

        int res = arr[0];

        for(int i = 1 ; i < n ; i++){

            maxending = Math.max(maxending+arr[i] , arr[i]);

            res = Math.max(res , maxending);
        }
        return  res ;

    }

    public static void main(String[] args){

        int arr [] = {2, 3, -8, 7, -1, 2, 3};

        int res = MaxSum(arr);

        System.out.println(res);

    }
}
