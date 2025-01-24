/*
 * Problem Statement
 * You are given an array of integers and a target sum. Your task is to find two distinct indices
 * in the array such that the numbers at those indices add up to the target sum.
 *
 * Example:
 * Given array: [2, 7, 11, 15]
 * Target sum: 9
 * Output: [0, 1] (Since 2 + 7 = 9)
 *
 * Constraints:
 * - Each input has exactly one solution.
 * - You may not use the same element twice.
 */


package popularProblems;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1};
        int target = 7;

        for(int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Indices: " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("No pairs found with the given sum.");
    }
}

// Output: Indices: 0 and 2

/*
 * Time Complexity: O(n^2)
 * Explanation: The outer loop runs `n` times, and for each iteration, the inner loop runs
 * approximately `n - 1` times. This results in O(n^2) time complexity.
 *
 * Space Complexity: O(1)
 * Explanation: The algorithm uses a constant amount of extra space, as no additional data
 * structures are used apart from the input array and a few variables.
 *
 */