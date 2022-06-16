package org.example;
import java.util.Scanner;
//Healthy Hearts code
public class HealthyHearts {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int userAge;
        System.out.println("What is Your Age? ");
        userAge = in.nextInt();
        int maxHeartRate = 220 - userAge; // max heart rate is 220 minus the user age
        int rangeLow = (int) Math.round(maxHeartRate * 0.5);
        int rangeHigh = (int) Math.round(maxHeartRate * 0.85);
		// displays the maxHeartRate and the targeted HR zone
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " +rangeLow+ " - " +rangeHigh+ " beats per minute");
    }
}