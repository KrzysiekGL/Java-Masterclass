package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        int[] array=new int[] {1,2,3,4,5,6,7};
        printArray(array);
        reverse(array);
        printArray(array);
    }

    private static void reverse(int[] array){
        int temp;
        for(int i=0; i<(array.length/2); ++i){
            temp=array[i];
            array[i]=array[(array.length-1 - i)];
            array[(array.length-1 - i)]=temp;
        }
    }

    private static void printArray(int[] array){
        for(int i=0; i<array.length; ++i){
            System.out.print(array[i]);
            System.out.print("\t");
        }
        System.out.println();
    }
}
