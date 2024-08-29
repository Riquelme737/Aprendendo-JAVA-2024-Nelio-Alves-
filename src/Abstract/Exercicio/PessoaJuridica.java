package Abstract.Exercicio;

public class PessoaJuridica extends Pessoa{
    private int numeroFuncionario;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAtual, int numeroFuncionario) {
        super(nome, rendaAtual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double imposto() {
        double imposto = 0.0;
        if (numeroFuncionario > 10) {
            imposto = imposto + getRendaAtual() * 14 / 100;
        } else {
            imposto = imposto + getRendaAtual() * 16 / 100;
        }
        return imposto;
    }
}
