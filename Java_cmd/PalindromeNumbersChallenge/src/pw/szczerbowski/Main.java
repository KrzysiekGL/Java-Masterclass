package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        isPalindrome(1);
    }

    public static boolean isPalindrome(int number){
        int howLong=10;
        do{
            if(number/howLong != 0) howLong*=10;
        }while(number/howLong != 0);
        howLong/=10;
        int tempNumber=number;
        int newNumber=0;
        while(howLong!=0){
            newNumber+=tempNumber%10 * howLong;
            tempNumber/=10;
            howLong/=10;
        }
        if(number == newNumber) return true;
        return false;
    }
}
