package pw.szczerbowski;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrayOfInt=getIntegers(5);

        printArray(arrayOfInt);
        System.out.println("Average is " + getAverage(arrayOfInt));



        //Syntax clue:
        //int_array_type name_of_variable = new  int_array_of_N_elements_object
	    int[] myVariable=new int[10];

        myVariable[0]=10;
        myVariable[9]=789;

        System.out.println(myVariable[9]);


        int[] manyVariables={1,2,3,4,57};

        System.out.println(manyVariables[4]);

        int A=20;

        int[] anotherIntArray=new int[A];
        for(int i=0; i<anotherIntArray.length;){
            anotherIntArray[i]=i*11;
            System.out.println("Element " + i + " is " + anotherIntArray[i] + " (" + (++i) + ")");
        }

        printArray(anotherIntArray);

    }

    //Return type of an int array (int[]) (!!!)
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values:\r");
        int[] values=new int[number];
        for(int i=0; i<values.length; ++i){
            values[i]=scanner.nextInt();
        }
        return values;
    }


    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0; i<array.length; ++i){
            sum+=array[i];
        }
        return (double)sum / array.length;
    }


    public static void printArray(int[] array){
        for(int i=0; i<array.length; ++i){
            System.out.println("Element " + i + " is " + array[i]);
        }
    }
}