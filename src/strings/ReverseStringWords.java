package strings;

public class ReverseStringWords {
        static void reverse(char str[], int start, int end)
        {
            // Temporary variable
            // to store character
            char temp;

            while (start <= end) {
                // Swapping the first
                // and last character
                temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        // Function to reverse words
        static char[] reverseWords(char[] s)
        {
            // Reversing individual words as
            // explained in the first step

            int start = 0;
            for (int end = 0; end < s.length; end++) {
                // If we see a space, we
                // reverse the previous
                // word (word between
                // the indexes start and end-1
                // i.e., s[start..end-1]
                if (s[end] == ' ') {
                    reverse(s, start, end);
                    start = end + 1;
                }
            }

            // Reverse the last word
            reverse(s, start, s.length - 1);

            // Reverse the entire String
            reverse(s, 0, s.length - 1);
            return s;
        }

        // Driver Code
        public static void main(String[] args)
        {
            String s = "i like this program very much ";

            // Function call
            char[] p = reverseWords(s.toCharArray());
            System.out.print(p);
        }
    }



