/*
Problem #1 - Find the Second largest element in the array

Input: Given a sequence of five numbers 2, 4, 5, 6, 8.

Output:  6

Explanation:
In the given sequence of numbers, number 8 is the largest element, followed by number 6 which is the second-largest element.
Hence we return number 6 which is the second-largest element in the sequence.
*/


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

// Output: The second largest number in the array is: 66