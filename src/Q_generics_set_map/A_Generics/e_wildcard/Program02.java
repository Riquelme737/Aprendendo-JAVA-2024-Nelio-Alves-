package Q_generics_set_map.A_Generics.e_wildcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program02 {
    public static void main(String[] args) {

        List<Cachorro> matilha = new ArrayList<>();
        matilha.add(new Cachorro("Thor", 7.5));
        matilha.add(new Cachorro("Pretinha", 5.2));
        matilha.add(new Cachorro("Hulk", 10.0));

        Cachorro maisPesado = CalcularPeso.pesoMax(matilha);
        System.out.println(maisPesado);
    }
}

abstract class Animal implements Comparable<Animal>{
    double peso;
    String nome;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nome + " | " + String.format("%.2fkg", peso);
    }

    @Override
    public int compareTo(Animal outro) {
        return Double.compare(this.peso, outro.peso);
    }
}

class Cachorro extends Animal{
    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }
}

class CalcularPeso {
    public static <T extends Comparable<? super T>> T pesoMax(List<T> matilha) {
        if (matilha.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        return Collections.max(matilha);
    }
}
