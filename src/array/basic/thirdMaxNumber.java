package array.basic;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class thirdMaxNumber {
    public static int findThirdMax(int[] arr) {
        int k = 3;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
        }
        if (ts.size() < k) {
            return ts.last();
        } else {
            Integer m = ts.last();
            for (int i = 0; i < k-1; i++) {
                m = ts.lower(m);
                if (m == null) {
                    return ts.last();
                }
            }
            return m;
        }

    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        //int[] nums =null;

        System.out.println(findThirdMax(nums));
    }
}
