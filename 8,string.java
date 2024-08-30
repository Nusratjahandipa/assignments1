import java.util.Scanner;

public class Ans_8 {
    public static void main(String arg[]) {
        Scanner ob = new Scanner(System.in);
        
        // Input strings from user
        System.out.println("Enter first string: ");
        String a = ob.nextLine();
        System.out.println("Enter second string: ");
        String b = ob.nextLine();
        
        // Display the length of the first string
        System.out.println("First string length is: " + a.length());
        
        // Compare the two strings
        System.out.println("Comparison result: " + a.compareTo(b));
        
        // Demonstrate string concatenation
        String s1 = "java string";   
        s1.concat(" is immutable");    // This will not change s1 because strings are immutable
        System.out.println(s1);    
        s1 = s1.concat(" is immutable so assign it explicitly");    
        System.out.println(s1); 

        // Split a string based on whitespace
        String s2 = "java string split method by javatpoint";  
        String[] words = s2.split("\\s"); // Splits the string based on whitespace
        
        // Using Java foreach loop to print elements of string array  
        for (String w : words) {  
            System.out.println(w);  
        }  

        // Additional string methods
        
        // Convert to uppercase
        System.out.println("First string in uppercase: " + a.toUpperCase());
        
        // Convert to lowercase
        System.out.println("Second string in lowercase: " + b.toLowerCase());
        
        // Check if strings are equal
        System.out.println("Are both strings equal? " + a.equals(b));
        
        // Replace characters in a string
        String s3 = a.replace('a', '@');
        System.out.println("First string with 'a' replaced by '@': " + s3);
        
        // Extract substring
        if (a.length() > 3) {
            System.out.println("Substring of first string (index 1 to 3): " + a.substring(1, 4));
        } else {
            System.out.println("First string is too short for substring extraction");
        }

        // Close the scanner
        ob.close();
    }
}