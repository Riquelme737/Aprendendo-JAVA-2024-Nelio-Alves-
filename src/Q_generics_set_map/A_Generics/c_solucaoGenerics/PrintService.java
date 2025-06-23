package Q_generics_set_map.A_Generics.c_solucaoGenerics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> lista = new ArrayList<>();

    public void addValue(T value) {
        lista.add(value);
    }

    public T first() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        return lista.getFirst();
    }

    public void print() {
        System.out.println(lista);
    }
}
