package Abstract.Exercicio;

public class PessoaFisica extends Pessoa{
    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAtual, Double gastoSaude) {
        super(nome, rendaAtual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
       if (getRendaAtual() < 20000.00) {
           return getRendaAtual() * 15 / 100 - gastoSaude * 50 / 100;
       } else {
           return getRendaAtual() * 25 / 100 - gastoSaude * 50 / 100;
       }
    }
}
