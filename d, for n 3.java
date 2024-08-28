public class Main {
    public static void main(String[] args) {
        int n = 3;

        
        for (int i = 0; i  <  n; i++) {
        
            for (int j = i; j  <  n; j++) {
                System.out.print("*");
            }
        
            for (int k = 0; k  <  2 * i; k++) {
                System.out.print(" ");
            }
    
            for (int j = i; j  <  n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    
        for (int i = 1; i  <  n; i++) {
            
            for (int j = 0; j  <= i; j++) {
                System.out.print("*");
            }
            
            for (int k = 2 * (n - i - 1); k  >  0; k--) {
                System.out.print(" ");
            }
            
            for (int j = 0; j  <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}