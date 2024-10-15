package Interface.exercicio.model.services;


import Interface.exercicio.model.entities.Contract;
import Interface.exercicio.model.entities.Parcelas;

import java.time.LocalDate;

public class ContratoServico {

    private PagamentoOnlineServico pagamentoOnlineServico;

    public ContratoServico(PagamentoOnlineServico pagamentoOnlineServico) {
        this.pagamentoOnlineServico = pagamentoOnlineServico;
    }

    public void processoContrato(Contract contract, Integer meses) {
        double parcelaBasica = contract.getValorContrato() / meses;

        for (int i = 0; i <= meses ; i++) {
            LocalDate dataVencimento = contract.getData().plusMonths(i);

            double juros = pagamentoOnlineServico.juros(parcelaBasica, i);
            double taxa = pagamentoOnlineServico.pagamentoTarifa(parcelaBasica + juros);

            double cota = parcelaBasica + taxa + juros;

            contract.getParcelas().add(new Parcelas(dataVencimento, cota));
        }
    }
}
