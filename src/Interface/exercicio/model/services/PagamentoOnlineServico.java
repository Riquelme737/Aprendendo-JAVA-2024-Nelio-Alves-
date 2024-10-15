package Interface.exercicio.model.services;

public interface PagamentoOnlineServico {
     Double pagamentoTarifa(double quantidade);
     Double juros(double quantidade, int meses);
}
