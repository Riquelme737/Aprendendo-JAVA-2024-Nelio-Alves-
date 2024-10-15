package Interface.exercicio.model.services;

public class PaypalServico implements PagamentoOnlineServico{

    private static final double TAXA_PORCETAGEM = 0.02;
    private static final double JUROS_PORCETAGEM = 0.01;

    @Override
    public Double pagamentoTarifa(double quantidade) {
        return quantidade * TAXA_PORCETAGEM;
    }

    @Override
    public Double juros(double quantidade, int meses) {
        return quantidade * JUROS_PORCETAGEM * meses;
    }
}
