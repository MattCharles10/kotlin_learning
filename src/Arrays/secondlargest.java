package Arrays;

import java.util.Arrays;

public class secondlargest {

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

