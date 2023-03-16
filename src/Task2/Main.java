package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cafe a_cafe = new Cafe();

        a_cafe.loadMenuData();


        ArrayList<String> list_of_coffees = a_cafe.getCoffeeMenu();

        for (String coffee_type: list_of_coffees) {

            System.out.println(coffee_type);
        }
    }
}
