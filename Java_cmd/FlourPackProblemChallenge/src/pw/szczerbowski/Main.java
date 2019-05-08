package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        canPack(1,2,7);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0) return false;
        while(bigCount!=0 && goal>=5){
            --bigCount;
            goal-=5;
            System.out.println("bigCount: " + bigCount + "\ngoal: " + goal);
        }
        while(smallCount!=0 && goal>0){
            --smallCount;
            goal-=1;
            System.out.println("smallCount: " + smallCount + "\ngoal: " + goal);
        }
        if(goal==0) return true;
        return false;
    }
}
