package Interface.exercicio.model.entities;

import Interface.exercicio.model.services.PagamentoOnlineServico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer numero;
    private LocalDate data;
    private Double valorContrato;

    List<Parcelas> parcelas = new ArrayList<>();


    public Contract() {
    }

    public Contract(Integer numero, LocalDate data, Double valorContrato) {
        this.numero = numero;
        this.data = data;
        this.valorContrato = valorContrato;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcelas> parcelas) {
        this.parcelas = parcelas;
    }

}
