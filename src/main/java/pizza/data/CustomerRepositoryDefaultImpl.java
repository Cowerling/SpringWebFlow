package pizza.data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pizza.domain.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017-3-12.
 */
@Component
@Qualifier("default")
public class CustomerRepositoryDefaultImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<String, Customer>();

    public Customer lookupCustomer(String phoneNumber) {
        return customers.get(phoneNumber);
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getPhoneNumber(), customer);
    }
}
