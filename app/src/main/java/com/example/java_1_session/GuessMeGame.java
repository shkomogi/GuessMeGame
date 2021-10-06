package com.example.java_1_session;

import java.util.Random;
import java.util.Scanner;

public class GuessMeGame {
    //Step 1: Add a Main Method psvm
    public static void main(String[] args) {
        /*
       	Receive the User’s name ,Say some greeting to the user, Ask the user to start the game
         */
        Scanner NameScanner = new Scanner(System.in);
        System.out.print("Enter name:");
        String userName = NameScanner.nextLine();
        System.out.println("Hello "+ userName);


        Scanner quitOrNot = new Scanner(System.in);
        System.out.println("Type 1 to continue this game... or 0 to quit");
        int quit = quitOrNot.nextInt();
        if (quit==1){
            System.out.println("You will have 5 chances to guess the magic number...Ready!?");
        }
        else            {
            System.exit(0);
        }

        /*
        Make a random number and save it in an integer called x
	If input is greater than x, tell the user to guess smaller
	If the input is less than x, tell the user to guess higher
	If  input is equal to x, say Congratulations to the user for his/her win
             */

        Random myrandom = new Random();
        int x = myrandom.nextInt(20)+1;

        //introduce a counter
        int counter=0;
        //do while loop,

        while (counter<5){
            Scanner userNumber = new Scanner(System.in);
            System.out.println(userName + ", Type in your magic number");
            int ans = userNumber.nextInt();
            if (ans==x){
                System.out.println("Congratulations, you guessed right!");
                System.out.println("Magic number is: "+x);
                System.exit(0);
            }
            else if(ans>x){
                System.out.println("Guess smaller");
                counter++;

            }
            else{
                System.out.println("Guess higher");
                counter++;
            }
        }System.out.println("TIME'S UP!! Magic number is "+x);
        System.out.println("Good try...");

    }
}
