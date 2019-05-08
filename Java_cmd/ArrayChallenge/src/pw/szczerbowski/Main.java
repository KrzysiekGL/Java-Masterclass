package pw.szczerbowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] intArray=getArrayOfSize(15);
        printArray(intArray);
        sortArray(intArray, 0, intArray.length-1);
        printArray(intArray);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; ++i){
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] getArrayOfSize(int size){
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[size];
        System.out.println("Enter " + size + " elements of array:\r");
        for(int i=0; i<array.length; ++i){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void sortArray(int[] array, int left, int right){
        int axis=array[(left + right)/2];
        int p=left; int q=right;

        do {
            while (array[p] < axis) ++p;
            while (array[q] > axis) --q;
            if(p<=q) {
                int temp = array[p];
                array[p] = array[q];
                array[q] = temp;
                ++p; --q;
            }
        }while (p<=q);

        if(q>left) sortArray(array, left, q);
        if(p<right) sortArray(array, p, right);
    }
}
