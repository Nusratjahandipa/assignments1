import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        // Upper Part
        // i loop : iterating for n times.
        for (int i = n; i >= 1; i--)
        {
            // Triangle 1
            for (int j = n; j >= i; j--)
                System.out.print(j + " ");
            // Triangle 2
            for (int j = 1; j <= (i - 1) * 2; j++)
                System.out.print(i + " ");
            // Triangle 3
            if (i != 0)
                for (int j = i + 1; j <= n; j++)
                    System.out.print(j + " ");
            System.out.println();
        }
        // Lower Part        
        // i loop : iterating for n times.
        for (int i = 1; i < n; i++)
        {
            // Triangle 4
            for (int j = n; j > i; j--)
                System.out.print(j + " ");
            // Triangle 5
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print(i + 1 + " ");
            // Triangle 6
            for (int j = i + 1; j <= n; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
