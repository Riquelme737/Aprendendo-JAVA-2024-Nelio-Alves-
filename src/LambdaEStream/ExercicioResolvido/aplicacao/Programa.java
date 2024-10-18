package LambdaEStream.ExercicioResolvido.aplicacao;

import LambdaEStream.ExercicioResolvido.entidades.Produto;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caminho inteiro de onde esta localizado o seu arquivo: ");
        String caminhoArquivo = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))){

            List<Produto> produtosLista = new ArrayList<>();
            String linha = bufferedReader.readLine();
            while (linha != null) {
                String[] divisaoString = linha.split(",");
                produtosLista.add(new Produto(divisaoString[0], Double.parseDouble(divisaoString[1])));
                linha = bufferedReader.readLine();
            }

            double media = produtosLista.stream()
                    .map(Produto::getPrice)
                    .reduce(0.0, Double::sum) / produtosLista.size();

            System.out.println("Média de preço: " + String.format("%.2f", media));

            List<String> nomesDecrescente = produtosLista.stream()
                    .filter(p -> p.getPrice() <= media)
                    .map(Produto::getName)
                    .sorted(Comparator.reverseOrder())
                    .toList();

            nomesDecrescente.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
