package patterns;

public class AlphabetUppercaseTriangleCase1 {
    static void getTriangle(int n) {
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                char asciiToChar = (char) (64 + j);
                System.out.print(asciiToChar);
            }
            for(int j=i-1; j>=1; j--){
                char asciiToChar = (char) (64 + j);
                System.out.print(asciiToChar);
            }
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
    getTriangle(3);
    }
}

/*
Output:
  A
 ABA
ABCBA
*/
