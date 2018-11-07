package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int myMin = -2_147_483_648; //dopuszczalne od java 7 '_' jako przerywniki w zapisie dlugiej liczby
        int myMax = 2_147_483_647;
        int myIntValue = (myMax/2);

        //byte has a width of 8
        byte myByteValueMin = -128;
        byte myByteValueMax = 127;
        byte myByteValue = (byte)(myByteValueMax/2); //can't sign into byte int value

        //width of 16
        short myShortValueMax = 32767;

        long myLongValue = 100L; //'L' means "Long" value

        //challenge
        byte smallValue=8;
        short shortValue=(short)smallValue;
        int intValue=smallValue;
        long longValue=(50000 + 10*(smallValue + shortValue + intValue));
        System.out.println("My long value is " + longValue);
    }
}
