package pl.krzysiekgl;

import com.example.game.ISaveable;
import com.example.game.Player;
import com.example.game.Monster;

import java.lang.management.MonitorInfo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Player tim = new Player("Tim", 100, 20);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(9);
        System.out.println(tim.toString());
        tim.setWeapon("stormbringer");
        saveObject(tim);

        loadObject(tim);
        System.out.println(tim.toString());

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(((Monster) werewolf).getStrength()); //cast from ISavable to Monster to get Monster's method
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose: \n1 to enter a string \n0 to quit");

        while(!quit) {
            System.out.print("Choos an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index++, stringInput);
                    break;
            }
        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
