/*
 * Karen Maloof
 * CSC6301 Fall 2025
 * Week 4 Code Reuse
 *  "Implement a program that reads a list of Integer numbers from the scanned input and 
 * saves them into a Linked List sorted from the smallest to the largest. Be sure to use
 * the Collections Framework and follow code guidelines and document your code accordingly;"
 * 
 * References - 
 * https://www.geeksforgeeks.org/java/java-collection-tutorial/
 * Entered assignment into Google AI to create code
 *   - I refactored it to have separate methods for collecting/sorting data,  and
 *     printing data. 
 *   - I rewrote the documentation to my own standards as needed. 
 * 
 */

package maloofk_A4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Reads integer input, stores it as a linked list, and returns that linked list.
 */
public class IntLinkedList {
    // Lnked list to store scanned Ints
    /**
     * Linked List to hold integers entered by user
     */
    private LinkedList<Integer> intsList;

    public IntLinkedList (){
        this.intsList = new LinkedList<>();
    }

    //Overload to allow construction by passing in integers directly?
    
    /**
     * Method reads integers as input and puts them into a linked list, sorted smallest to largest. 
     */
    public void readInts () {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println (" Please enter an integer. If all are entered, type 'Done'");
        while (scanner.hasNext()) {

            String input = scanner.next();
            // Check if the user wants to terminate input
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Parse the input string to an integer
                int number = Integer.parseInt(input);

                // Add the number to the list
                this.intsList.add(number);

            } catch (NumberFormatException e) {
                // Handle cases where the input is not a valid integer
                System.out.println("Invalid input: '" + input + "' is not an integer. Please enter an integer or 'done'.");
            }
            System.out.println (" Please enter the next integer. If all are entered, type 'Done'");
        }
        scanner.close();
        // Sort the list after each addition to maintain ascending order
        Collections.sort(this.intsList);
    }

    /**
     * Prints the sorted linked list values
     */
    public void printList (){
        System.out.println(this.intsList);
    }
}
