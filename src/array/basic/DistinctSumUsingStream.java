package array.basic;

import java.util.*;

public class DistinctSumUsingStream {
    public static void main(String[] args) {

        List<Integer> in = Arrays.asList(10,20,20,40,50,70,70,80,90,70);

        in.stream()
                .distinct()
                .forEach(x -> System.out.print(x+" "));
                //.forEach(System.out::println);

        //sum
        System.out.println();
        Integer sum = in.stream()
                .distinct()
                .reduce(0,(a,b) -> a+b);
        System.out.println(sum);
        System.out.println();
        Integer sum1 = in.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.println(sum1);

        final Integer sum4 = in.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum4);

        final Optional<Integer> max = in.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max.get());

        final Optional<Integer> min = in.stream()
                        .min(Comparator.naturalOrder());
        System.out.println(min.get());


    }
}
