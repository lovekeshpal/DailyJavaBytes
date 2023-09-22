// Write a Java program to get the character at the given index within the string.

package strings;

public class CharAtIndex {
    public static void main(String[] args)
    {
        String str = "Learn Java";
        System.out.println("The original string = " + str);
        // To get the character at positions 0 and 9.
        int index1 = str.charAt(0);
        int index2 = str.charAt(9);

        // Printing the results.
        System.out.println("The character at position 0 is " +
                (char)index1);
        System.out.println("The character at position 10 is " +
                (char)index2);
    }
}
