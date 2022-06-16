package org.example;
// Summative Sums code
public class SummativeSums {
    public static void main(String[] args) {
        // The three arrays
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        int result;
        result = SumArray(array1);
        System.out.println("#1 Array Sum: " + result);
        result = SumArray(array2);
        System.out.println("#2 Array Sum: " + result);
        result = SumArray(array3);
        System.out.println("#3 Array Sum: " + result);
    }
    // public static to calculate what is in the array
    public static int SumArray(int[] inArray){
        int result = 0;
        for (int i : inArray) {
            result = result + i;
        }
        return result;

    }
}