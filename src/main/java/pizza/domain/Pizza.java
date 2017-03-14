package pizza.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017-2-17.
 */
@Component
public class Pizza implements Serializable {
    private PizzaSize size;
    private List<Topping> toppings;

    public Pizza() {
        toppings = new ArrayList<Topping>();
        size = PizzaSize.LARGE;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(String sizeString) {
        size = PizzaSize.valueOf(sizeString);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void setToppings(String[] toppingStrings) {
        for (String toppingString : toppingStrings) {
            toppings.add(Topping.valueOf(toppingString));
        }
    }
}
