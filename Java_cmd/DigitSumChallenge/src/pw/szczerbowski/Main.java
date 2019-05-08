package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1));
    }

    public static int sumDigits(int number){
        if(!(number>=10)) return -1;
        int sum=0;
        do{
            sum+=number%10;
            number/=10;
        }while(number!=0);
        return sum;
    }
}
