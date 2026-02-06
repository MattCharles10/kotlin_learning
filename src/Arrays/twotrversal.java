package Arrays;

public class twotrversal {

    static  void pushnozero(int arr[]){
        int n = arr.length ;

        int count = 0 ;

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count<n){
            arr[count++] = 0 ;
        }
    }

    public static  void main(String [] args){

        int arr [] = {1, 2, 0, 4, 3, 0, 5, 0};

        pushnozero(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}


/*Time Complexity: O(n), as we are traversing the array only twice.
Auxiliary Space: O(1)*/