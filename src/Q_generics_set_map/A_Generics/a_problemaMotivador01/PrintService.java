package Q_generics_set_map.A_Generics.a_problemaMotivador01;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> list = new ArrayList<>();

    public void addValue(int value) {
        list.add(value);
    }

    public Integer first(){
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        return list.getFirst();
    }

    public void print() {
        System.out.println(list);
    }
}
