package array.basic;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateElement {
        public static int removeduplicate(int[] arr){
            Arrays.sort(arr);
        int n= arr.length;
        if(n==0) return 0;

        int k=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
    public static void removedyplicateScratch(int[] arr) {
        int[] res = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == res[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                res[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void removeDuplicates(int[] a) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        System.out.print(set);
    }

    public static int removeDuplicatesLeetcode(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (k==0 || nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,9,7,4,2, 5, 5, 8, 5, 6, 2, 8, 2, 5, 9};
       // removedyplicateScratch(arr);
        //removedyplicate(arr);
        System.out.println( removeduplicate(arr));
//        int[] res = IntStream.of(arr).
//                distinct().toArray();
//
       int[] result = IntStream.of(arr)
               .distinct()
               .sorted()
               .toArray();
        System.out.println(Arrays.toString(result));

//        System.out.print(Arrays.toString(res));
//        List<Integer> abc = Arrays.asList(2, 5, 5, 8, 5, 6, 2, 8, 2, 5, 9);
//
//        List<Integer> ns = abc.stream()
//                .distinct()
//                .toList();
//        System.out.println(ns);
    }
}
