package LambdaEStream.Exercicio.aplicacao;

import LambdaEStream.Exercicio.entidades.Empregado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o caminho do arquivo completo: ");
        String caminhoArquivo = scanner.nextLine();

        System.out.print("Coloque o sálario: ");
        Double salario = scanner.nextDouble();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))){

            List<Empregado> empregadoLista = new ArrayList<>();
            String linha = bufferedReader.readLine();

            while (linha != null) {
                String[] campoDivisao = linha.split(",");
                empregadoLista.add(new Empregado(campoDivisao[0], campoDivisao[1], Double.parseDouble(campoDivisao[2])));
                linha = bufferedReader.readLine();
            }

            List<String> emailEmpregado = empregadoLista.stream()
                    .filter(p -> p.getSalario() > salario)
                    .map(Empregado::getEmail)
                    .sorted()
                    .toList();
            emailEmpregado.forEach(System.out::println);

            Double adicaoSalario = empregadoLista.stream()
                    .filter(p -> p.getNome().startsWith("M"))
                    .map(Empregado::getSalario)
                    .reduce(0.0, Double::sum);
            System.out.println("Adição dos salarios que o nome começa com a letra 'M': " + adicaoSalario);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
