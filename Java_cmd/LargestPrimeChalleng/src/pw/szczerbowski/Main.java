package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        if(isPrim(179)) System.out.println("TAK");
        else System.out.println("NIE");
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        int prime = -1;
        int bufor = 1;
        for (int i = 2; i <= number; ++i) {
            if (number % i == 0){
                //Czy i jest liczbą pierwszą?
                //------------------
                boolean jest=true;
                for (int k = 2; k <= i; ++k) {
                    if (i%k == 0 && k<i) jest=false;
                }
                if(jest) {
                    bufor=i;
                    if(prime<bufor) prime=bufor;
                }
                //------------------
            }
        }
        return prime;
    }

    public static boolean isPrim(int number){
        for(int i=2; i<=number; ++i){
            if(number%i==0 && i<number) return false;
        }
        return true;
    }
}
