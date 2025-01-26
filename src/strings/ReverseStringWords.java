/**
 * Problem Statement:
 * Write a Java program to reverse the order of words in a given string.
 *
 * For example, if the input string is "This is just a simple string",
 * the output should be "string simple a just is This".
 */

package strings;

public class ReverseStringWords {

    /**
     * Returns a string with the words reversed from the original sentence.
     *
     * @param sentence The input sentence to process.
     * @return A string with the words reversed.
     */
    public static String getReversedStringWords(String sentence) {
        // Create a StringBuilder to store the reversed words
        StringBuilder reversedString = new StringBuilder();

        // Split the input sentence into individual words
        String[] words = sentence.split("\\s+");

        // Iterate over each word in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append the current word to the StringBuilder
            reversedString.append(words[i] + " ");
        }

        // Return the string representation of the reversed words
        return reversedString.toString().trim(); // Trim to remove trailing space
    }

    public static void main(String[] args) {
        // Test the program with a sample sentence
        String str = "This is just a simple string";

        System.out.println(getReversedStringWords(str));
    }
}

//Output: string simple a just is This
