package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        for(int i=2; i<=8; ++i){
//            System.out.println("10,000 at 2% interest = " + calcualteInterest(10000,i));
        }

        extendedMain();
    }

    public static double calcualteInterest(double amount, double interestRate){
        return amount*interestRate/100;
    }

    //challenge
    public static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2; i<=Math.sqrt(n); ++i)
            if(n%i == 0) return false;
         return true;
    }

    private static void extendedMain(){
        for(int primesFound=0, i=156_532_659; primesFound<3;++i){
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
                ++primesFound;
            }
        }
    }
}
