package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        int newScore=calculateScore("Krowa", 500);
        System.out.println("New score is " + newScore);

        newScore=calculateScore(75);
        System.out.println(newScore);

        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(13,1));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score*1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, no player score.");
    }

    //challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || !(inches>=0 && inches<=12)) return -1;
        return 12d*2.54d*feet + 2.54d*inches;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0) return -1;
        return calcFeetAndInchesToCentimeters(inches/12d,0);
    }
}