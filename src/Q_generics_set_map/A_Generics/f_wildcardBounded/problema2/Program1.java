package Q_generics_set_map.A_Generics.f_wildcardBounded.problema2;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {

        // PRINCÍPIO GET/PUT - COVARIÂNCIA
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(5);

        List<? extends Number> list = integerList;

        Number x = list.get(1);
        System.out.println(x);
        // list.add(20); --> erro de compilação

        // ------------------------------------------------------------ //

        // Princípio get/put - CONTRAVARIÂNCIA
        List<Object> myObjts = new ArrayList<>();
        myObjts.add("Maria");
        myObjts.add("Jesus");
        myObjts.add("José");

        List<? super Number> myNumbs = myObjts;
        myNumbs.add(10);
        myNumbs.add(3.14);

        // Number y = myNumbs.getFirst(); --> erro de compilação
    }
}
