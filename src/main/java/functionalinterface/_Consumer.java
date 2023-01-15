package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer customer = new Customer("Shubham", "295464");
        greet(customer);

        //Consumer functional interface
        greetCustomerConsumer.accept(customer);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name + ", thank you for registering with phone number " + customer.phone);

    static void greet(Customer customer) {
        System.out.println("Hello " + customer.name + ", thank you for registering with phone number " + customer.phone);
    }

    static class Customer {
        private final String name;
        private final String phone;

        Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
