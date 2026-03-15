package interview;

import java.util.ArrayList;
import java.util.Collections;

public class Quest14 {

    static ArrayList<Integer> FindMajority(int arr []){

        int n = arr.length ;

        int ele1 = 0 , ele2 = 0 ;
        int cnt1 = 0 , cnt2 = 0 ;

        for(int els : arr){
            if(els == ele1){
                ele1++;
            } else if ( els == ele2) {
                ele2++;
            } else if (cnt1 == 0) {
                ele1 = els ;
                cnt1++;
            } else if ( cnt2 == 0) {
                ele2 = els ;
                cnt2++;
            }else {
                cnt1--;
                cnt2--;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        for(int ele : arr){
            if(ele1 == ele) cnt1++;
            if(ele2 == ele) cnt2++;
        }

        if(cnt1 > n / 3) res.add(ele1);
        if(cnt2 > n / 3 && ele1 != ele2)  res.add(ele2);

        Collections.sort(res);

        return res;
    }

    public static  void main(String [] args){

        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        ArrayList<Integer> res = FindMajority(arr);
        for (int ele : res) {
            System.out.print(ele + " ");
        }

    }
}
