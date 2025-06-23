package Q_generics_set_map.A_Generics.b_problemaMotivador02;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Object> list = new ArrayList<>();

    public void addValue(Object value) {
        list.add(value);
    }

    public Object first(){
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        return list.getFirst();
    }

    public void print(){
        System.out.println(list);
    }
}
