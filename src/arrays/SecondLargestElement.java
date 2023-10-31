package arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {32, 66, 12, 33, 98, 19};

        int firstMax = Integer.MIN_VALUE; // Initialize first maximum as lowest possible value
        int secondMax = Integer.MIN_VALUE; // Initialize second maximum as lowest possible value

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstMax) {
                secondMax = firstMax;
                firstMax = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != firstMax) {
                secondMax = numbers[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest number in the array is: " + secondMax);
        }
    }
}

