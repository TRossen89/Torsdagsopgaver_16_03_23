package Task2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu;

    public Cafe(){}


    public void loadMenuData(){

        coffeeMenu = new ArrayList<>();

        File file = new File("src/Task2/coffees.txt");


        try {
            Scanner a_scanner = new Scanner(file);

            while (a_scanner.hasNextLine()) {

                String a_line = a_scanner.nextLine();
                //String[] data = a_line.split(". ");
                String coffee_type = a_line;
                coffeeMenu.add(coffee_type);



            }


        }
        catch (IOException e){

            System.out.println("No file is found or the file isn't readable");
        }



    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}


