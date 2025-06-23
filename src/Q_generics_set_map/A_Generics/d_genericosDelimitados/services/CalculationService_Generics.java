package Q_generics_set_map.A_Generics.d_genericosDelimitados.services;

import java.util.Collections;
import java.util.List;

public class CalculationService_Generics {

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty!");
        }
        return Collections.max(list);
    }
}
