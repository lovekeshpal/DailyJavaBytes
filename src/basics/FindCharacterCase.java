/*
 * Problem Statement
 * Write a program that takes a character as input
 * and prints 1, 0, or -1 according to these rules
 * 1, if the character is an uppercase alphabet (A - Z).
 * 0, if the character is a lowercase alphabet (a - z).
 * -1, if the character is not an alphabet.
 */

package basics;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String charInput = myObj.nextLine();
        int castAscii = (int) charInput.charAt(0);
        if(castAscii<=122 && castAscii>=97){
            System.out.println(0);
        }
        else if(castAscii<=90 && castAscii>=65){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }


    }
}
