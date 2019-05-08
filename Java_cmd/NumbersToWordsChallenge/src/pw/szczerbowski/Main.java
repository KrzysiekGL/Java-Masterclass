package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        for(int i=0; i!=11; ++i){
            System.out.println("for i = " + i + "\tgDC = " + getDigitCount(i));
        }
}

    public static void numberToWords(int number){
        if(number<0) System.out.println("Invalid Value");
        else {
            int digitNumber=getDigitCount(number);
            int reverseNumber=reverse(number);
            for(; digitNumber>0; --digitNumber){
                switch(reverseNumber%10){
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
                reverseNumber/=10;
            }
        }
    }

    public static int reverse(int number){
        int reverseNumber=0;

        int numberTemp=number;
        int digitCount=0;
        while(numberTemp!=0){
            ++digitCount;
            numberTemp/=10;
        }

        int iteration=digitCount;
        for(; iteration>0; --iteration){
            reverseNumber+=(number%10)*Math.pow(10, iteration-1);
            number/=10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if(number<0) return -1;
        if(number==0) return 1;
        int digitCount=0;
        while(number!=0){
            ++digitCount;
            number/=10;
        }
        return digitCount;
    }
}
