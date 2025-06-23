package Q_generics_set_map.A_Generics.z_exercicios_germineAI;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ex05_GenericosEntidades {
    public static void main(String[] args) {
        Repositorio<Produto> produtoRepositorio = new Repositorio<>();

        produtoRepositorio.adicionar(new Produto(77, "RX 6600", 1500.00));
        produtoRepositorio.adicionar(new Produto(200, "World of Warcraft", 50.00));
        produtoRepositorio.adicionar(new Produto(12, "Samsung S23", 2000.00));
        produtoRepositorio.adicionar(new Produto(142, "Monitor", 500.00));

        Produto produtoEncontrado = produtoRepositorio.buscarPorId(12);
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado);
        }

        produtoRepositorio.mostrarTodos();
        produtoRepositorio.remover(142);
        produtoRepositorio.mostrarTodos();

        produtoEncontrado = produtoRepositorio.buscarPorId(500);
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado);
        } else {
            System.out.println("Produto pelo id proposto não foi encontrado!");
        }

        System.out.println("-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Repositorio<Cliente> clienteRepositorio = new Repositorio<>();
        clienteRepositorio.adicionar(new Cliente(2006, "Riquelme", "Salvador"));
        clienteRepositorio.adicionar(new Cliente(1978, "Valdnei", "Camaraçi"));
        clienteRepositorio.adicionar(new Cliente(1988, "Jorge Leão", "Rio de Janeiro"));

        Cliente clienteEncontrado = clienteRepositorio.buscarPorId(2006);
        if (clienteEncontrado != null) {
            System.out.println("Cliente contrado = " + clienteEncontrado);
        }

        clienteRepositorio.mostrarTodos();
        clienteRepositorio.remover(1988);
        clienteRepositorio.mostrarTodos();
    }
}

interface Entidade {
    Integer getId();
}

abstract class EntidadeBase implements Entidade {
    private final Integer id;
    private String nome;

    public EntidadeBase(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

}
class Produto extends EntidadeBase {
    private double preco;

    public Produto(Integer id, String nome, double preco) {
        super(id, nome);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Id: " +getId() + " | " + getNome() + String.format(" | R$%.2f", preco);
    }
}

class Cliente extends EntidadeBase{
    private String endereco;

    public Cliente(Integer id, String nome, String endereco) {
        super(id, nome);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return getId() + " | " + getNome() + " | " + endereco;
    }
}

class Repositorio<T extends Entidade> {
    private Map<Integer, T> dados = new HashMap<>();

    public void adicionar(T entidade){
        dados.put(entidade.getId(), entidade);
    }

    public T buscarPorId(Integer id) {
        T entidadeAchada = null;

        for (T entidade : dados.values()) {
            if (Objects.equals(entidade.getId(), id)) {
                return entidadeAchada = entidade;
            }
        }

        return null;
    }

    public void remover (Integer id) {
        System.out.println("Removendo Id: " + id);
        dados.remove(id);
    }

    public void mostrarTodos() {
        if (dados.isEmpty()) {
            System.out.println("Repositório está vazio!");
            return;
        }

        System.out.println("Listando todos os repositórios: ");
        for (T entidade : dados.values()) {
            System.out.println(entidade);
        }
    }
}
