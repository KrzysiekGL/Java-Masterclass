package pw.szczerbowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter=0;

        while(counter!=10){
            System.out.print("Enter number" + (counter+1) + "# ");
            boolean hasNextInt=scanner.hasNextInt();
            if(hasNextInt){
                scanner.nextInt();
                ++counter;
            }
            else System.out.println("Invalid Number");
            scanner.nextLine();
        }

        scanner.close();
    }
}
