package Q_generics_set_map.A_Generics.e_wildcard;

import java.util.Arrays;
import java.util.List;

public class Program01 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2 ,10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "José", "Jesus");
        printList(myStrs);
    }

    public static void printList(List<?> list) {

        // list.add(3);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
