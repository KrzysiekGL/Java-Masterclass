package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(7);
        printDayOfTheWeek(0);
        printDayOfTheWeek(6);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(150);
    }

    public static void printDayOfTheWeek(int day){
        if(!(day>=0 && day<=6)) System.out.println("Invalid Value");
        else {
            switch(day){
                case 0:
                    System.out.println("Sunday");
                    break;

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
