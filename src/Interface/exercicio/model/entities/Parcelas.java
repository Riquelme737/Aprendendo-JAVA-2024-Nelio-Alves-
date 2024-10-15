package Interface.exercicio.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
    private LocalDate vencimentoData;
    private Double quantia;

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Parcelas() {
    }

    public Parcelas(LocalDate vencimentoData, Double quantia) {
        this.vencimentoData = vencimentoData;
        this.quantia = quantia;
    }

    public LocalDate getVencimentoData() {
        return vencimentoData;
    }

    public void setVencimentoData(LocalDate vencimentoData) {
        this.vencimentoData = vencimentoData;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return vencimentoData.format(dtf) + " - " + String.format("%.2f", quantia);
    }
}
