package interview;

public class Quest35 {

    static int[] MaxMin(int arr[]) {

        int n = arr.length;

        int MAX = arr[0], MIN = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            } else if (arr[i] < MIN) {
                MIN = arr[i];
            }
        }

        return new int[]{MIN, MAX};
    }

    public static void main(String[] args) {

        int arr[] = {12, 34, 56, 67, 678};
        int[] result = MaxMin(arr);

        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
}