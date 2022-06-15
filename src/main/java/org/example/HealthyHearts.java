package org.example;
import java.util.Random;
import java.util.Scanner;

public class HealthyHearts {

    /*public double heartRate(double obtained) {
        //return obtained * userAge/100;
    }*/
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int userAge;
        System.out.println("What is Your Age? ");
        userAge = in.nextInt();
        int maxHeartRate = 220 - userAge;
        int rangeLow = (int) Math.round(maxHeartRate * 0.5);
        int rangeHigh = (int) Math.round(maxHeartRate * 0.85);
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " +rangeLow+ " - " +rangeHigh+ " beats per minute");
    }
}