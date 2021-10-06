package com.example.java_1_session;

import java.util.Random;
import java.util.Scanner;

public class HelloCEIT {
    public static void main(String[] args) {
        //System.out.println("Hello Student");
       // System.out.print("John Doe");
        //int Namba =4;
        //double deci = 1.5;
        //float floatNumber =(float)2.5;
       // System.out.println(Namba);
       // System.out.println(deci);
       // System.out.println(floatNumber);

        //String
       // String textme = "Hey there!";
       // System.out.println(textme);
        //int a = 9;
       int b = 2;
        Random randomNamba = new Random();
        int x = randomNamba.nextInt(20)+1;
        System.out.println("Random number generated is "+x);
        /*Scanner myscanner = new Scanner(System.in);
        int a = myscanner.nextInt();
        System.out.println("A is "+ a);
       boolean myBoolean=false;
       do {
           System.out.println("print this exception where myBoolean=False");
       } while(myBoolean);
            System.out.println(" set Condition where myBoolean=true");

       for (int i=0;i<a;i++){
           System.out.print(i+" ");
       }
       System.out.println("Continue...");
       switch (a){
           case (9):
               System.out.println("a is 9");
               break;
           case (6):
               System.out.println("a is 6");
               break;
           case (37):
               System.out.println("a is 37");
               break;
           default:
               System.out.println("a is neither 9,6 or 37");
               break;
       }*/
       //boolean namba2 = a == 5 && b ==9;
        //System.out.println(namba2);
       // if (a<0){
          //  System.out.println("a is negative!");
        //}
       // else if (a>0){
        //    System.out.println("a is postive");
       // }
       // else{
        //    System.out.println("a is zero");
       //}
        //double answer = (double)a /b ;
        //System.out.println(answer);
       // String FName = "Jane";
        //String LName = "Doe";
        //String FullName = FName + " " + LName;
        //System.out.println(FullName);

        /*
        switch (ans) {
                case (1):
                    ans = x;
                    System.out.println("Congratulations, you guessed right!");
                    System.out.println("Magic number is: "+x);
                    break;
                case (2):
                    boolean myBoolean = ans > x;
                    System.out.println("Guess smaller");
                    break;
                case (3):
                    boolean myBoolean2 = ans < x;
                    System.out.println("Guess higher");
                    break;
                default:
                    System.out.println("You have not entered a number");
                    break;

         */
    }
}
