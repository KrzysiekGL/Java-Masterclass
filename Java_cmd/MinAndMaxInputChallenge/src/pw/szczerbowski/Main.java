package pw.szczerbowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isSet=false;

        int min=0, max=0;

        while(true){
            boolean hasNextInt=scanner.hasNextInt();
            if(hasNextInt){
                int bufor=scanner.nextInt();
                scanner.nextLine();

                if(!isSet){
                    max=bufor;
                    min=bufor;
                    isSet=true;
                }
                else if(bufor<min) min=bufor;
                else if(bufor>max) max=bufor;
            }
            else{
                break;
            }
        }

        System.out.println("Max value: " + max + "\tMin value: " + min);
        scanner.close();
    }
}
