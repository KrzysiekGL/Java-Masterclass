package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        int myIntValue=5;
        float myFloatValue=(float)5.4; //f means Float value (ie. 5.4f instead of (float)5.4)
        double myDoubleValue=5d; //d means Double value

        double pounds=234.78d;
        double kilograms=pounds*0.453_592_37d;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
