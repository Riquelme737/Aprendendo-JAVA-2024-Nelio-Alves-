package Q_generics_set_map.A_Generics.z_exercicios_germineAI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex03_Copiando_Lista_Flexibilidade_PECS {
    public static void main(String[] args) {
        List<String> santissimaTrindade = Arrays.asList("Jesus Cristo", "Deus Pai", "Espirito Santo");
        List<Object> objectList = new ArrayList<>();

        printList(santissimaTrindade, objectList);
        copiarLista(santissimaTrindade, objectList);
        printList(santissimaTrindade, objectList);
    }

    public static <T> void copiarLista (List<? extends T> origem , List<? super T> destino) {
        destino.addAll(origem);
    }

    public static void printList(List<?> list1, List<?> list2) {
        System.out.print(list1);
        System.out.println(" | " + list2);
    }
}
