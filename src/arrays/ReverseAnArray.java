/*
 * Problem Statement
 * Given an array, the task is to reverse the array.
 * Example:
 * Given array: [1, 2, 3]
 * Output: [3, 2, 1]
 */

package arrays;

public class ReverseAnArray {

    // Function to reverse the array
    static void reverseArr(int arr[], int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the array
    static void printArr(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.print("The original array: ");
        printArr(arr, 6);

        reverseArr(arr, 0, 5);
        System.out.print("The reversed array: ");
        printArr(arr, 6);
    }
}

//Output:
//The original array: 1 2 3 4 5 6
//The reversed array: 6 5 4 3 2 1
