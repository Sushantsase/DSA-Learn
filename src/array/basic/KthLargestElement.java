package array.basic;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] arr, int k) {
        if (arr ==  null || arr.length == 0) {
            System.out.println("Not ");
            return -1;
        }

        if(k<=0 || k> arr.length)return -1;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++){
            pq.add(arr[i]);

            if(pq.size() > k){
                pq.poll();
            }
        }
        if(pq.isEmpty()){
            return -1;
        }
            return pq.peek();
    }


    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        //int[] nums =null;
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
