package Task1;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        Customer customer_1 = new Customer("Jonas", "Rossen", "Bror");
        Customer customer_2 = new Customer("Finn", "Rossen", "Far");
        Customer customer_3 = new Customer("Lykke", "Andersen", "Mor");
        Customer customer_4 = new Customer("Angela", "Juhlin", "Kusine");
        Customer customer_5 = new Customer("Kirsten", "Rossen", "Farmor");
        Customer customer_6 = new Customer("Johan", "Ambrosius", "Fætter");


        customers.add(customer_1);
        customers.add(customer_2);
        customers.add(customer_3);
        customers.add(customer_4);
        customers.add(customer_5);
        customers.add(customer_6);

        printCustomers();



        //System.out.println(customers.get(3));
        //Customer a_customer = new Customer("Tobias", "Rossen", "TRossen");
        //System.out.println(a_customer);
        }



    public static void printCustomers() {

        for (Customer c: customers) {

            System.out.println(c);
        }


        }



}
