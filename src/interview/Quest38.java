package interview;

import java.util.ArrayList;
import java.util.Collections;


public class Quest38 {

    static  ArrayList<Integer> findMajority(int [] arr)
    {
        int  n  = arr.length ;

        int ele1 = -1 , ele2 = -1 ;

        int cnt1 = 0 , cnt2 =  0  ;

        for(int ele : arr){

            if(ele1 == ele){
                cnt1++;
            }
            else if (ele1 == ele) {
                cnt2++;
            } else if (cnt1 == 0) {
                ele1 = ele ;
                cnt1 = 1 ;
            } else if (cnt2 == 0) {
                ele2 = ele;
                cnt2 = 1;
            } else  {
                cnt1--;
                cnt2--;
            }

        }

        // To Verfify Candiates
        cnt1 = 0 ;
        cnt2 = 0 ;

        for (int ele : arr) {
            if (ele1 == ele) cnt1++;
            if (ele2 == ele) cnt2++;
        }
        ArrayList<Integer> res = new ArrayList<>();

        if (cnt1 > n / 3) res.add(ele1);
        if(cnt2 > n /3 && ele1 != ele2) res.add(ele2);

        Collections.sort(res);

        return res ;

    }

    public static  void main(String [] args) {

        int arr[] = {2, 2, 3, 1, 3, 2, 1, 1};

        ArrayList<Integer> res = findMajority(arr);

        for(int ele : res ){
            System.out.print(ele + " ");
        }

    }
}
