package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        int count=0;
        while(count!=5){
            System.out.println("Count value is " + count);
            ++count;
        }

        int number=4;
        int finishNuber=20;

        int evenNumbersFound=0;
        while(number<=finishNuber){
            ++number;
            if(!isEvenNumber(number)) continue;
            else ++evenNumbersFound;
            System.out.println("Even number " + number);
            if(evenNumbersFound == 5) break;
        }
        System.out.println("Found " + evenNumbersFound + " even numbers");
    }

    //challenge
    public static boolean isEvenNumber(int number){
        if(number%2 == 0) return true;
        else return false;
    }
}
