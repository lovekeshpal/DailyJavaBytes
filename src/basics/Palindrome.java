package basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int a, n, rev = 0, c;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;
        while (n > 0) {
            a = n % 10;
            rev = (rev * 10) + a;
            n = n / 10;
        }
        // Use the equality operator (==) instead of the assignment operator (=)
        if (c == rev) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
