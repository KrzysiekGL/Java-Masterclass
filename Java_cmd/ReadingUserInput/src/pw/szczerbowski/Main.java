package pw.szczerbowski;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt=scanner.hasNextInt(); //if next input entered is a number (int)
        if(hasNextInt){
            int yearOfBirth=scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)
            int age=2018-yearOfBirth;

            System.out.println("Enter tour name: ");
            String name=scanner.nextLine();

            if(age>=0 && age<=100) System.out.println("Your name is " + name + ", and your age is " + age);
            else System.out.println("Invalid year of birth");
        }
        else System.out.println("Unable to parse year of birth");

        scanner.close();
    }
}
