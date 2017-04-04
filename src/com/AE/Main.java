package com.AE;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //writing functions
        int highScore = calculateScore(true, 10000, 8, 200);
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScore("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScore("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScore("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScore("Gilbert", highScorePosition);

        System.out.println("Your final score was " + highScore);

      


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            System.out.println("Your final score was " + -1);

        }

        return -1;
    }

    public static void displayHighScore(String name, int position){

        System.out.println(name + " managed to get into position " + position + " on the high score table" );


    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if (score >= 500 && score < 1000){
            return 2;
        }else if (score >= 100 && score < 500){
            return 3;
        }else{
            return 4;
        }

    }

}
