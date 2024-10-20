package LambdaEStream.exemplo6.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 5, 10, 7));

        Stream<Integer> st1 = list.stream().map(x -> x - 1);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Dev Dojo", "Anelio Alves", "Riquelme");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(1, x -> x + x);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(16).toArray()));

        Stream<Integer> paperline = Stream.of(3, 4, 5, 10, 7)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10);

        paperline.forEach(System.out::println);
    }
}
