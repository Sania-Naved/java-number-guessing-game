import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
                System.out.println("===================================");
                System.out.println("  WELCOME TO NUMBER GUESSING GAME  ");
                System.out.println("===================================");
                Scanner sc =new Scanner(System.in);
                Random rd =new Random();
                //DIFFICULTY SELECTION
                System.out.println("1.EASY");
                System.out.println("2.MEDIUM");
                System.out.println("3.DIFFICULT");
                System.out.println("choice no.= ");
        int choice = sc.nextInt();
        int maxNumber=0;
        int maxAttempts=0;

        if(choice==1){
            System.out.println("LEVEL:EASY");
            System.out.println("Number range=1-10 ,Attempts=unlimited");
            maxNumber=10;
            maxAttempts=Integer.MAX_VALUE;
        }
        else if(choice==2){
            System.out.println("LEVEL:MEDIUM");
            System.out.println("Number range=1-20 ,Attempts=10");
             maxNumber=20;
             maxAttempts=10;

        }
        else if(choice==3){
            System.out.println("LEVEL:DIFFICULT");
            System.out.println("Number range=1-30 ,Attempts=5");
             maxNumber=30;
             maxAttempts=5;
        }
        else{
            System.out.println("Invalid choice!");
            return;
        }
        //GAME SETUP
        int number=rd.nextInt(maxNumber)+1;
        int noOfTries= 0;
        int guess;
        boolean hasWon=false;
        System.out.println("Game begins!Guess the number:");

        while(!hasWon && noOfTries<maxAttempts ) {
            noOfTries++;
            System.out.println("Enter a guess: ");
            guess= sc.nextInt();

            if (guess==number && noOfTries <= maxAttempts) {
                hasWon = true;
                System.out.println("YOU WON!");
            } else if (noOfTries < maxAttempts && !hasWon) {
                System.out.println("Incorrect!Try Again!");
                System.out.println("remaining lives: " + (maxAttempts - noOfTries));
            } else if (!hasWon || noOfTries > maxAttempts) {
                System.out.println("YOU LOST!");
                System.out.println("The number was " + number);
            }
            if(guess>number) {
                System.out.println("TOO HIGH!");
            }
                else if(guess<number){
                System.out.println("TOO LOW!");
            }
        }
        }
    }

