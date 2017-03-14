package pizza.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pizza.data.CustomerRepository;
import pizza.domain.*;
import pizza.service.CustomerNotFoundException;

/**
 * Created by dell on 2017-3-2.
 */
@Component
public class PizzaFlowActions {
    @Autowired
    @Qualifier("default")
    private CustomerRepository customerRepository;

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        Customer customer = customerRepository.lookupCustomer(phoneNumber);

        if (customer == null) {
            throw new CustomerNotFoundException();
        }

        return customer;
    }

    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    public boolean checkDeliveryArea(String zipCode) {
        return false;
    }

    public Payment verifyPayment(PaymentDetails paymentDetails) {
        return paymentDetails.getPaymentType() == PaymentType.CREDIT_CARD ? new CreditCardPayment() : new CashOrCheckPayment();
    }

    public void saveOrder(Order order) {

    }
}
