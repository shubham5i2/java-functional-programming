package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer customer = new Customer("Shubham", "295464");
        //Normal java function
        greet(customer);

        //Consumer functional interface
        greetCustomerConsumer.accept(customer);

        greetCustomerConsumer.andThen(greetGoodByeConsumer).accept(customer);

        //BiConsumer functional interface
        greetCustomerBiConsumer.accept(customer, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhone) ->
            System.out.println("Hello " + customer.name +
                    ", thank you for registering with phone number " +
                    (showPhone ? customer.phone : "******"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name +
                    ", thank you for registering with phone number " + customer.phone);

    static Consumer<Customer> greetGoodByeConsumer = customer ->
            System.out.println("Thank you " + customer.name + ". Good Bye!!!");

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
