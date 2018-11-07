package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        int switchValue=4;

        switch(switchValue){
                case 1:
                    System.out.println("Value was 1");
                    break;

                case 2:
                    System.out.println("Value was 2");
                    break;

                case 3: case 4: case 5:
                System.out.println(" Value was a 3, or 4, or 5");
                break;

                default:
                    System.out.println("Value was not 1 or 2");
                    break;
        }

        //challenge
        char letter='C';

        switch(letter){
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C':
                System.out.println("C");
                break;

            case 'D':
                System.out.println("D");
                break;

            case 'E':
                System.out.println("E");
                break;

            default:
                System.out.println("Neither A,B,C,D or E. It's "+letter);
                break;
        }

        String month="JanuarY";

        switch(month.toUpperCase()){
            case "JANUARY":
                System.out.println("Jan");
                break;

            case "JUNE":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
