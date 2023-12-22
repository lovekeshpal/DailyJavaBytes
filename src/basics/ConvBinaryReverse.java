package basics;

import java.util.Scanner;

public class ConvBinaryReverse {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int padding = 0;

        int temp = n;
        String bin = "";
        String rem = "";


        int decimalNumber = 0;
        while(temp>0){
            rem = String.valueOf((char) temp%2);
            bin = bin+rem;
            temp = temp/2;
        }

        padding = 32 - bin.length();

        for(int i = 1; i<=padding; i++){
            bin = bin+'0';
        }


         decimalNumber = Integer.parseInt(bin, 2);
        System.out.println(decimalNumber);
    }
}


//Input: 12
//Output: 805306368

