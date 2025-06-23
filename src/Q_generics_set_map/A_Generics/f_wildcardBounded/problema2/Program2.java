package Q_generics_set_map.A_Generics.f_wildcardBounded.problema2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> myDoubles = Arrays.asList(3.14, 07.01, 26.07);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destination) {
        destination.addAll(source);
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
