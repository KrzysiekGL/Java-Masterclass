package pw.szczerbowski;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue=myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue=myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray=new String[10];
	    int[] intArray=new int[10];

        ArrayList<String> stringArrayList=new ArrayList<String>();
        stringArrayList.add("Tim");

        //ArrayList<int> intArrayList=new ArrayList<int>(); //Argument can't be of primitive type(!!!)
        ArrayList<IntClass> intClassArrayList=new ArrayList<IntClass>(); //Argument has to be Class
        intClassArrayList.add(new IntClass(42));

        Integer integer=new Integer(54);        //Deprecated
        Double doubleValue=new Double(12.25);   //Deprecated

        ArrayList<Integer> intArrayList=new ArrayList<Integer>();
        for (int i=0; i<10; ++i) {
            intArrayList.add(Integer.valueOf(i)); //object wrapper
        }

//        for (int i=0; i<10; ++i) {
//            System.out.println(i + "-->" + intArrayList.get(i).intValue());
//        }

        Integer myIntValue=56; //New class object initialization, but without explicitly calling constructor (!!!)
        Integer secondIntValue=Integer.valueOf(56); //The same as above -> what is going on during compile-time

        int myInt=myIntValue; //Primitive type initialized with Class type
        int mySecondInt=myIntValue.intValue(); //What is actually happening

        ArrayList<Double> myDoubleArrayList=new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl+=0.5) {
            myDoubleArrayList.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoubleArrayList.size(); ++i) {
            //double value=myDoubleArrayList.get(i).doubleValue();  //due to auto unboxing I don't have to
                                                                    //explicitly call .doubleValue() to store
                                                                    //specific value from class into primitive type
            double value=myDoubleArrayList.get(i);
            System.out.println(i + "-->" + value);
        }
    }
}