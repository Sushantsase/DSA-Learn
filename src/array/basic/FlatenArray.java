package array.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
*       lists = [[1,4,5],[1,3,4],[2,6]]
* Output: [1,1,2,3,4,4,5,6].
* */
public class FlatenArray {
    public static void flattenArray(int[][] arr){
        int totalSize =0;
        for (int[] sublist:arr){
            totalSize += sublist.length;

        }
        System.out.println(totalSize);

        int[] flatArr = new int[totalSize];
        int index =0;

        for(int[] i:arr){
            for(int number:i){
                flatArr[index++]=number;
            }
        }

    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,4,5},
                {1,3,4},
                {2,6}
        };
        flattenArray(arr);

//        List<List<Integer>> l = new ArrayList<>();
//        l.add(List.of(1,4,5));
//        l.add(List.of(1,3,4));
//        l.add(List.of(2,6));
//        System.out.println(l);
//
//        List<Integer> list = l.stream()
//                .flatMap(List::stream)
//                .sorted()
//                //.collect(Collectors.toList());
//                .toList();
//        System.out.println(list);

    }
}
