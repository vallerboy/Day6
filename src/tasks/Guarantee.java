package tasks;

import java.time.LocalDate;

public class Guarantee {
    private Product product;
    private LocalDate validUntil;

    public Guarantee(Product product, LocalDate validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public boolean isValid() {
        if(validUntil.isAfter(LocalDate.now())){
            product = null;
            validUntil = null;
            return false;
        }
        return true;
    }
}
