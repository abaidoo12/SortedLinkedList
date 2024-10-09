import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class reads ONLY a list of integers from user input,Prompt user to indicate when numbers are entered. 
 * This stores them in a LinkedList and also sorts the list in ascending order via java collection Framework.
 * then prints the sorted list as the output.
 * @author Aaron Baidoo
 * @version 1.0.0
 * @since Week 4 of CSC6301
 */
public class SortedLinkedList { 

    /**
     * Constructor with no arguments 
     * 
     * Main method that drives the program execution.
     *
     * @param args command line arguments (none in this program)
     */
    public static void main(String[] args) {

        // Initialize a LinkedList to store the input integers as new LinkedList. Variable numbers as LinkedList array.  
        
        LinkedList<Integer> numbers = new LinkedList<>();

        // Creating a scanner to read the user inputs.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values, and Read user inputs until 'done' is entered. 
        
        System.out.println("Enter a list of integers separated by spaces. Type 'done' when finished:");

        // while loop will iterator through each next digit from the user input. if digit is next to another digit, add the integer to the LinkedList named number else exit the loop when 'done' is entered.
        
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {

                numbers.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;  
            } else {
                
                //Prompting user to enter the correct value. 
                System.out.println("Please enter valid integers or type 'done' to finish.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Sort the LinkedList in ascending order using Collections.sort() function. 
        Collections.sort(numbers);

        // Print the sorted LinkedList
        System.out.println("Sorted LinkedList: " + numbers);
    }
}

//code reuse are used throughout this code. java collections framework LinkedList<interger> numbers = new Linkedlist<>() and collections.sort(numbers). Also using Scanners to read the user inputs is a reuse code in the java packaging. Instead of using Scanner to read from the console, we could use a bufferedReader to read from a CVS file. 

