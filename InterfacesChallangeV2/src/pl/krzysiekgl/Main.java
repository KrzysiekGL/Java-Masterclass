package pl.krzysiekgl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player krzysiek = new Player("chris", 100, "sword");
        System.out.println(krzysiek.toString());
        
        Player n00b = new Player();
        ArrayList<String> otherPlayerValues = readValues();
        n00b.loadValues(otherPlayerValues);
        System.out.println(n00b);
        
        ArrayList<String> saveOfKrzysiek = krzysiek.saveValues();
        Player christopher = new Player();
        christopher.loadValues(saveOfKrzysiek);
        System.out.println(christopher.toString());
    }
    
    private static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
    
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n1 to enter a string \n0 to quit");
        
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index++, stringInput);
                    break;
            }
        }
        return values;
    }
}
