package Q_generics_set_map.A_Generics.d_genericosDelimitados.services;

import java.util.Collections;
import java.util.List;

public class CalculationService_NaoGenerics {
    
    public static Integer max(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty!");
        }
        return Collections.max(list);
    }
}
