package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
	    double uno=-3.1756d;
	    double dos=-3.1753d;

	    if(areEqualByThreeDecimalPlaces(uno,dos)) System.out.println("true");
	    else System.out.println("false");
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        double diff=abs(number1 - number2);
        if(diff >= 0.0009d) return false;
        return true;
    }

    public static double abs(double number){
        double abs=(number>=0) ? number : number*-1d;
        System.out.println(abs);
        return abs;
    }
}
