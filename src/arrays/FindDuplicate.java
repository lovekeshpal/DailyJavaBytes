/*
 * Problem Statement
 * Find the duplicate values of an array of integer values
 * Example:
 * Given array: {1, 2, 3, 2};
 * Output: Duplicate Element : 2
 */

package arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + arr[j]);
                }
            }
        }
    }
}


//  Output:
//  Duplicate Element : 2
//  Duplicate Element : 5
//  Duplicate Element : 5
//  Duplicate Element : 6
//  Duplicate Element : 6
//  Duplicate Element : 2