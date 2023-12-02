public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

//*****************************************************************************************************
        //The code below can be removed, as we are invoking, or calling the calculateScore method,
        //which does the work for us.

//        if(gameOver){
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//******************************************************************************************************
        //Below, we invoke the method and pass arguments to its parameters:

        calculateScore(true, 800, levelCompleted, bonus);
                           //Arguments are the values we pass into the parameters of a method, when called.
                           //Parameters are "definitions as shown in the method declaration".
                           //Parameters can be defined like a local variable. First declare a data type, and then naming it.
                           //The order matters for passing arguments to parameters.
                           //In the calculateScore method below, it must be passed as Bool, int, int, int.
                           //You must pass arguments that match the type, order, and number of parameters declared.
                           //Arguments can be passed with a "Hard coded" value, like "true" or "800" as shown above.
                           //Arguments can also be passed using variables, like "levelCompleted" and "bonus", shown above.
                           //When creating parameters for a method, Java creates the variables for us (calculateScore).
    }

    //New method being created below. A method contains statements and code blocks that can be invoked elsewhere,
    //such as by other methods.

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

//**********************************************************************************************************
        // Because we are already passing arguments to the parameters in calculateScore,
        //we would get an error by trying to declare them again below.

//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//***********************************************************************************************************
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
