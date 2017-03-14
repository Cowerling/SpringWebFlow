package pizza.domain;

/**
 * Created by dell on 2017-3-12.
 */
public class CashOrCheckPayment extends Payment {
    @Override
    public String toString() {
        return "CASH or CHECK: $" + getAmount();
    }
}
