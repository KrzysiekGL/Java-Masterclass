package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        for(int i=1, sum=0, ifIt=0; i<=1000; ++i){
            if(i%15 == 0){
                sum+=i;
                ++ifIt;
                System.out.println("Current sum = " + sum + "\tCurrent number is " + i);
            }
            if(ifIt==5) break;
        }
    }
}