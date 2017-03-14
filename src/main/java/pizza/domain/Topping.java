package pizza.domain;

import org.apache.commons.lang3.text.WordUtils;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dell on 2017-3-6.
 */
public enum Topping implements Serializable {
    PEPPERONI,
    SAUSAGE,
    HAMBURGER,
    MUSHROOM,
    CANADIAN_BACON,
    PINEAPPLE,
    GREEN_PEPPER,
    JALAPENO,
    TOMATO,
    ONION,
    EXTRA_CHEESE;

    public static List<Topping> asList() {
        return Arrays.asList(Topping.values());
    }

    @Override
    public String toString() {
        return WordUtils.capitalizeFully(name().replace('_', ' '));
    }
}
