 package Day1;

// import java.util.Scanner;

// public class FindFactors {
//     public static void findfactors(int n){

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         findfactors(n);
//         sc.close();
//     }
// }

import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        StringBuilder factors = new StringBuilder(); // StringBuilder to store factors
        
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.append(i).append(" "); // Append factor to StringBuilder
            }
        }
        
        // Display the factors
        System.out.println("Factors of " + number + " are: " + factors.toString().trim());
        
        // Close the scanner
        scanner.close();
    }
}