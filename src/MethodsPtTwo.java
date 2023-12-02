public class MethodsPtTwo {
    public static void main(String[] args) {

        //Some examples of passing arguments to parameters/calling methods:

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));

        int highScore = calculateScore(true, 800, 5, 100);

        System.out.println(highScore);

        calculateScore(true, 10000, 8, 200);

    }

    //Below is a method returning data.
    //Note that instead of "void" (Returning nothing) We have selected int to return an int value.
    //The most common usage of teh return statement is to return a value back from a method.

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
