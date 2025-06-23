package Q_generics_set_map.A_Generics.z_exercicios_germineAI;

import java.util.ArrayList;
import java.util.List;

public class ex01_Trocando_Elementos_em_uma_Lista_Generica {
    public static void main(String[] args) {
        List<String> minhaFamilia = new ArrayList<>();
        minhaFamilia.add("Riquelme");
        minhaFamilia.add("Vanusa");
        minhaFamilia.add("Djalma");
        minhaFamilia.add("Neuza");

        printList(minhaFamilia);
        trocarElementos(minhaFamilia, 1, 4);
        printList(minhaFamilia);
    }

    public static <T> void trocarElementos(List<T> lista, int pos1, int pos2) {
        int x = pos1 - 1;
        int y = pos2 - 1;

        T primeiroElemento = lista.get(x);

        lista.set(x, lista.get(y));
        lista.set(y, primeiroElemento);
    }

    public static void printList(List<?> lista) {
        System.out.println(lista);
    }
}
