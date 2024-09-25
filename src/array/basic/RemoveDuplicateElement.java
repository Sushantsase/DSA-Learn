package array.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateElement {
//    public static void removedyplicate(int[] arr){
//      //  int[] ans =
//    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,5,8,5,6,2,8,2,5,9};
        //removedyplicate(arr);
        int[] res = IntStream.of(arr).
                distinct().toArray();

        System.out.print(Arrays.toString(res));
        List<Integer> abc = Arrays.asList(2,5,5,8,5,6,2,8,2,5,9);

      List<Integer> ns= abc.stream()
                .distinct()
                .toList();
        System.out.println(ns);
    }
}
