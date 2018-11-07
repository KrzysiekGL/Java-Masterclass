package pw.szczerbowski;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        printSquareStar(7);
    }

    public static void printSquareStar(int number){
        if(number<5) System.out.println("Invalid Value");
        else{
            for(int y=1; y<=number; ++y){
                for(int x=1; x<=number; ++x){
                    if(y==1 || y==number) System.out.print('*');
                    else if(x==1 || x==number) System.out.print('*');
                    else if(x==y) System.out.print('*');
                    else if(y==(number-x+1)) System.out.print('*');
                    else System.out.print(' ');
                }
                System.out.println();
            }
        }
    }
}



//------ rzad = row

// |
// |  kolumna = column
// |
// |