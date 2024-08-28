import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int rows = 3;
        int spaces = rows - 1;
    
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        spaces = 1;

        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
