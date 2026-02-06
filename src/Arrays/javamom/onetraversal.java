package Arrays.javamom;

public class onetraversal {

    /*
    The idea is similar to the previous approach where we took a pointer,
    say count to track where the next non-zero element should be placed.
    However, on encountering a non-zero element, instead of directly placing the non-zero element at arr[count],
    we will swap the non-zero element with arr[count]. This will ensure that if there is any zero present at arr[count],
    it is pushed towards the end of array and is not overwritten.
     */

    static  void pushnonzerooos(int arr []) {

        int n = arr.length ;

        int count = 0;

        for (int i = 0; i < n; i++){

            if(arr[i] != 0){

                int temp  = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;

            }
        }

    }
    public static  void main(String[] args){

        int arr [] = {1, 2, 0, 4, 3, 0, 5, 0};

        pushnonzerooos(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}


/*Time Complexity: O(n), as we are traversing the array only once.
Auxiliary Space: O(1)*/