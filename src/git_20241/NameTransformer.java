/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git_20241;
import java.util.Scanner;
/**
 *
 * @author endri
 */
public class NameTransformer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Endrius Alberto Noronha
        // 2024241

        // A scanner to read user input
        Scanner myKb = new Scanner(System.in);
        String name;

        // do-while loop to ensure valid input
        do {
            // Asking the user to enter their name
            System.out.print("Tell me your name(letters only): ");
            name = myKb.nextLine();

            // Checking if the input contains only letters
            if (!name.matches("[a-zA-Z]+")) { // If the input is invalid
                System.out.println("Error: The name must contain letters only. Please try again.");
            }
        } while (!name.matches("[a-zA-Z]+")); // Repeating the loop while the input is invalid

        // Action 1: Reversing the name
        String reversedName = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed name: " + reversedName);

        // Action 2: Duplicating names' vowels 
        String intenseName = duplicateVowels(name);
        System.out.println("Intensified name: " + intenseName);

        // Action 3: Adding symbols around the name
        String styledName = addSymbols(name);
        System.out.println("Styled name: " + styledName);
        
        // Action 4: Changing to uppercase
        String upperName = name.toUpperCase();
        System.out.println("Uppercase name: " + upperName);
        
        // Action 5: Changing to lowercase
        String lowerName = name.toLowerCase();
        System.out.println("Lowercase name: " + lowerName);
        
         // Action 6: Creating a patterned name
        String patternedName = createPattern(name);
        System.out.println("Patterned name: " + patternedName);
        
         //Closing the scanner
        myKb.close(); 
        }
    
         // Method to duplicate vowels in the word
        public static String duplicateVowels(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c); // Adding the original letter
            // Duplicating if the letter is a vowel
            if ("AEIOUaeiou".indexOf(c) != -1) { 
                result.append(c);
            }
        }
        return result.toString();
    }

       // Method to add symbols around the word
       public static String addSymbols(String input) {
       return "✨" + input + "✨"; // Adding symbols to give the name a "sparkling" effect
    }
       public static String createPattern(String input) {
        return String.join("-", input.split(""));
    }
}