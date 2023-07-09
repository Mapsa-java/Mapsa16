package org.mapsa;

import org.mapsa.entities.Address;
import org.mapsa.entities.Customer;
import org.mapsa.service.CustomerService;

import java.text.ParseException;

public class CustomerCrudTest {


    public static void main(String[] args) throws ParseException {

        CustomerService customerService = new CustomerService(SessionFactoryProvider.getSessionFactory());
        Customer customer = new Customer("101010");
        customer.setHomeAddress(new Address("Kabol", "Afghan"));
        customerService.create(customer);


    }


}
