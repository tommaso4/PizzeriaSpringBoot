package it.epicode.menuPizzaSpring.bean;

import it.epicode.menuPizzaSpring.enumPack.StatoTavolo;
import lombok.Data;

@Data
public class Tavolo {
    private int nrTavolo;
    private int nrCoperti;
    private int maxCoperti;
    private StatoTavolo statoTavolo;;
    public int setMaxCoperti (){
        if (this.nrCoperti == 2){
            this.maxCoperti = 3;
        } else if (this.nrCoperti == 4) {
           this.maxCoperti =6;
        } else if (this.nrCoperti > 6) {
            this.maxCoperti = this.nrCoperti;
        }
        return this.maxCoperti;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "nrTavolo=" + nrTavolo +
                ", nrCoperti=" + nrCoperti +
                ", maxCoperti=" + maxCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
