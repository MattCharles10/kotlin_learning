package Arrays.javamom;

public class CircularSum {
    static int maxCircularSum(int[] arr) {

        int n = arr.length;
        int res = arr[0];

        // Subarray that starts with index i
        for(int i = 0; i < n; i++) {
            int currSum = 0;

            // Considering all possible endpoints of the
            // Subarray that begins with index i
            for(int j = 0; j < n; j++) {

                // Circular index
                int idx = (i + j) % n;
                currSum = currSum + arr[idx];
                res = Math.max(res, currSum);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxCircularSum(arr));
    }
}
