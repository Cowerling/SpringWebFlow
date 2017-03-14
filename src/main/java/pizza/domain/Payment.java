package pizza.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by dell on 2017-2-17.
 */
@Component
public abstract class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private float amount;

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
}
