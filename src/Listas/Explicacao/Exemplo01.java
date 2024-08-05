package Listas.Explicacao;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Riquelme");
        list.add("Vanusa");
        list.add(0, "Neuza");
        list.add("Djalma");
        list.add("Valdinei");
        list.add("Richard");
        list.add("Ronald");

        System.out.println(list.size());

        for(String minhaLista : list) {
            System.out.println(minhaLista);
        }

        System.out.println("----------------------------");
        System.out.println("Todos com V, foram excluido!");
        list.removeIf(x -> x.charAt(0) == 'V');
        for(String minhaLista : list) {
            System.out.println(minhaLista);
        }

        System.out.println("----------------------------");
        System.out.println("Posicão na lista!");
        System.out.println("Index of Neuza -> " + list.indexOf("Neuza"));
        System.out.println("Index of Valdinei -> " + list.indexOf("Valdinei"));

        System.out.println("----------------------------");
        System.out.println("Ficaram apenas aqueles com R!");
        list.removeIf(y -> y.charAt(0) != 'R');
        for (String minhaLista : list) {
            System.out.println(minhaLista);
        }

        System.out.println("----------------------------");
        System.out.println("Encontra um elemento!");
        String nameJ = list.stream().filter(z -> z.charAt(0) == 'R').findFirst().orElse(null);
        System.out.println(nameJ);
    }
}
