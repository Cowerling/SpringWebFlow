package pizza.domain;

import org.apache.commons.lang3.text.WordUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dell on 2017-3-7.
 */
public enum PaymentType {
    CASH, CHECK, CREDIT_CARD;

    public static List<PaymentType> asList() {
        return Arrays.asList(PaymentType.values());
    }

    @Override
    public String toString() {
        return WordUtils.capitalizeFully(name().replace('_', ' '));
    }
}
