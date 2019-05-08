package pw.szczerbowski;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);


        anotherIntValue++;

        System.out.println("\nmyIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);



        int[] myIntArray=new int[5];    //reference to int[5] array
        int[] anotherArray=myIntArray;  //reference to the same array as myIntArray is pointing to

        System.out.println("\nmyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0]=1;

        System.out.println("\nmyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray=new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("\nmyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));


        IntValue object1=new IntValue();
        object1.value = 10;

        //it is not a copy, it is a reference
        IntValue object2=object1;
        object2.value = 11;

        System.out.println("\n\nobject1 value = " + object1.value);
        System.out.println("object2 value = " + object2.value);
    }

    private static void modifyArray(int[] array){
        array[0]=2;

        //dereferencing array variable (reference)
        array=new int[] {1,2,3,4,5};
    }
}
