/*
 * Problem Statement
 * You are given an array of N elements. Rotate the elements of the array to the right by K places.
 * Example:
 * Given array: [1, 2, 3, 4, 5, 6, 7]
 * Rotate by 3 places to the right.
 * Output: [5, 6, 7, 1, 2, 3, 4]
 *
 */

package arrays;

import java.util.Arrays;

public class RotateByKElements {

    public static void main(String[] args) {
        int[] arr = {32, 65, 41, 85, 93, 44};
        int l = arr.length; // to get the length of the array

        int rotateByElements = 2; // rotate the array by numbers
        int[] rotated = new int[l]; // empty array

        for(int i = 0; i< arr.length; i++){
            rotated[(i+rotateByElements)%l] = arr[i]; // logic to store the elements in the array
        }

        System.out.println("Here is the Array rotated by " + rotateByElements +" elements "+Arrays.toString(rotated));

    }
}

//Output: [93, 44, 32, 65, 41, 85]