package Abstract.Exercicio;

public abstract class Pessoa {
    private String nome;
    private Double rendaAtual;

    public Pessoa() {
    }

    public Pessoa(String nome, Double rendaAtual) {
        this.nome = nome;
        this.rendaAtual = rendaAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAtual() {
        return rendaAtual;
    }

    public void setRendaAtual(Double rendaAtual) {
        this.rendaAtual = rendaAtual;
    }

    public abstract double imposto();
}
