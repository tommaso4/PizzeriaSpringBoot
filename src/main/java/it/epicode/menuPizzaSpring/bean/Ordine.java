package it.epicode.menuPizzaSpring.bean;

import it.epicode.menuPizzaSpring.enumPack.StatoOrdine;
import it.epicode.menuPizzaSpring.enumPack.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Ordine {
    private List<Item> listaOrdine = new ArrayList<Item>();
    private Tavolo tavolo;
    private int nrOrdine;
    private StatoOrdine statoOrdine;
    LocalDateTime oraOrdine;
    private int nrCoperti;
    private String coperto;
    private double totalCost;


    public Tavolo setTavolo(Tavolo tavolo) throws Exception {
        if (tavolo.getStatoTavolo().equals(StatoTavolo.LIBERO)) {
            tavolo.setStatoTavolo(StatoTavolo.OCCUPATO);
            return this.tavolo = tavolo;
        } else {
            throw new Exception("tavolo occupato");
        }
    }

    public int checkCopertiPerTavolo(int num) throws Exception {
        if (this.tavolo.getMaxCoperti() >= num) {
            return this.nrCoperti = num;
        } else {
            throw new Exception("troppi coperti per questo tavolo");
        }
    }

    public double totalCount() {
        double count = 0;
        double costoCoperto = 0;
        if (!this.listaOrdine.isEmpty()) {
            for (Item item : this.listaOrdine) {
                count += item.getTotPrice();
            }
        }
        costoCoperto = nrCoperti* Double.parseDouble(coperto);
        return this.totalCost = count + costoCoperto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordine{\n");
        sb.append("  listaOrdine=").append(listaOrdine).append(",\n");
        sb.append("  tavolo=").append(tavolo).append(",\n");
        sb.append("  nrOrdine=").append(nrOrdine).append(",\n");
        sb.append("  statoOrdine=").append(statoOrdine).append(",\n");
        sb.append("  oraOrdine=").append(oraOrdine).append(",\n");
        sb.append("  nrCoperti=").append(nrCoperti).append(",\n");
        sb.append("  coperto=").append(coperto).append(",\n");
        sb.append("  totalCost=").append(totalCost).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
