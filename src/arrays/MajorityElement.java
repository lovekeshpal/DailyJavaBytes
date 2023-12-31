//Problem statement
//You are given an array 'a' of 'n' integers.
//A majority element in the array ‘a’ is an element that appears more than 'n' / 2 times.
//Find the majority element of the array.
//It is guaranteed that the array 'a' always has a majority element.

package arrays;
import java.util.*;
public class MajorityElement {

    public static void main(String[] args) {
        int[] numbers = {1,4,2,2,6,1,1,2,3,2,2};
        System.out.println(majorityElement(numbers));
    }


    public static int majorityElement(int[] v) {
        Arrays.sort(v);
        int elem = v[0];
        int count = 1;

        HashMap<Integer, Integer> elemCount = new HashMap<>();

        for (int i = 1; i < v.length; i++) {
            if (elem == v[i]) {
                count++;
            } else {
                elemCount.put(elem, count);
                elem = v[i];
                count = 1;
            }
        }

        elemCount.put(elem, count);

        int maxCount = 0;
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : elemCount.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value > maxCount) {
                maxCount = value;
                result = key;
            }
        }

        return result;
    }
}

//Sample Input 1:
//9
//2 2 1 3 1 1 3 1 1
//Sample Output 1:
//1
//Explanation Of Sample Input 1:
//Input: ‘n’ = 9, ‘a’ = [2, 2, 1, 3, 1, 1, 3, 1, 1]
//Output: 1
//Explanation: The frequency of ‘1’ is 5, which is greater than 9 / 2.
//Hence ‘1’ is the majority element.
