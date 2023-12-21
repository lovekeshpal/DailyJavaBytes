package basics;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.next();
        switch (dataType) {
            case "Integer":
                System.out.println(Integer.BYTES);
                break;
            case "Long":
                System.out.println(Long.BYTES);
                break;
            case "Float":
                System.out.println(Float.BYTES);
                break;
            case "Double":
                System.out.println(Double.BYTES);
                break;
            case "Character":
                System.out.println(Character.BYTES);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}