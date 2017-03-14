package pizza.data;

import pizza.domain.Customer;

/**
 * Created by dell on 2017-3-12.
 */
public interface CustomerRepository {
    Customer lookupCustomer(String phoneNumber);
    void addCustomer(Customer customer);
}
