package Arrays.javamom;

class GfG4 {

    static int maxProduct(int arr[]) {

        int n = arr.length;

        // Initializing result
        int maxProd = arr[0];

        for (int i = 0; i < n; i++) {
            int mul = 1;

            // traversing in current subarray
            for (int j = i; j < n; j++) {

                mul *= arr[j];


                maxProd = Math.max(maxProd, mul);
            }
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }
}