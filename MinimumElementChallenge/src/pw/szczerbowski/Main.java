package pw.szczerbowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] intArray=readIntegers(10);
        findMin(intArray);
    }

    private static int[] readIntegers(int count){
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[count];
        for(int i=0; i<array.length; ++i){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    private static void findMin(int[] array){
        int index=0;
        for(int i=0; i<array.length; ++i){
            if(array[i] < array[index]){
                index=i;
            }
        }
        System.out.println("Minimum value in array is " + array[index]);
    }
}
