package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 200, 7, 1650);

        int highScore = calculateScore(true, score, 4,1000);
        displayHighScorePosition("Krowa", calculateHighScorePosition(highScore));
        displayHighScorePosition("Kurczak", calculateHighScorePosition(950));

        Car myCar = new Car();
        myCar.runCar();
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score was "+finalScore);
            return finalScore;
        }
        return -1;
    }

    private static void displayHighScorePosition(String player, int position) {
        System.out.println(player+" managed to get into position "+position+" on the high score table.");
    }

    private static int calculateHighScorePosition(int score) {
        int position;
        if(score >= 1000) return 1;
        else if(score >= 500) return 2;
        else if(score >= 100) return 3;
        return 4;
    }
}