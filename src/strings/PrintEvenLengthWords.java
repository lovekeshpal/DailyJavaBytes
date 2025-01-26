/**
 * Problem Statement:
 * Write a Java program to print all the words from a given sentence that have even length.
 */

package strings;

public class PrintEvenLengthWords {

    /**
     * Returns a string containing even-length words from a given sentence.
     *
     * @param sentence The input sentence to process.
     * @return A string containing even-length words.
     */
    public static String getEvenLengthWords(String sentence) {
        // Split the input sentence into individual words
        String[] words = sentence.split("\\s+");

        // Create a StringBuilder to store even-length words
        StringBuilder evenLengthWords = new StringBuilder();

        // Iterate over each word in the sentence
        for (int i = 0; i < words.length; i++) {
            // Check if the current word has an even length
            if (words[i].length() % 2 == 0) {
                // Append the even-length word to the StringBuilder
                evenLengthWords.append(words[i] + " ");
            }
        }

        // Return the string representation of even-length words
        return evenLengthWords.toString();
    }

    public static void main(String[] args) {
        // Test the program with a sample sentence
        String sentence = "This is a string with some words";

        // Print the even-length words
        System.out.println(getEvenLengthWords(sentence));
    }
}

// Output: This is string with some
