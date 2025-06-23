package Q_generics_set_map.A_Generics.z_exercicios_germineAI;

import java.util.ArrayList;
import java.util.List;

public class ex02_Somando_uma_Lista {
    public static void main(String[] args) {
        List<Integer> myNumbs1 = new ArrayList<>();
        myNumbs1.add(07);
        myNumbs1.add(31);
        myNumbs1.add(25);

        printList(myNumbs1);
        System.out.println(calculadora(myNumbs1));
    }

    public static <T extends Number> double calculadora(List<T> numeros){
        double soma = 0.0;
        for (Number num : numeros) {
            soma += num.doubleValue();
        }
        return soma;
    }

    public static void printList(List<?> lista) {
        System.out.println (lista);
    }
}
