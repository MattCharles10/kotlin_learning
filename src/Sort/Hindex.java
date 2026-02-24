package Sort;

import java.util.Arrays;

public class Hindex {

    static int hIndex(int[] citations) {

        // sort the citations in descending order
        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;

        // keep incrementing idx till citations[n - 1 - idx] > idx
        while (idx < n && citations[n - 1 - idx] > idx) {
            idx++;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] citations = {6, 0, 3, 5, 3};
        System.out.println(hIndex(citations));
    }

}
