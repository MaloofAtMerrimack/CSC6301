/*
 * Karen Maloof
 * CSC6301 Fall 2025
 * Week 5 Code Maintenence
 *  "Implement a program that reads a list of Integer numbers from the scan input 
 * and saves them into a Stack sorted from the smallest to the largest:
 * Please make sure this is a maintenance task and you are not re-writing 
 * the program from scratch! Use Collections Framework"
 * 
 * See Readme for notes on the assignment.
 */

package maloofk_A5;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;  //Changed from Linked List

/**
 * Reads integer input, stores it as a stack, and returns that stack.
 */
public class CreateList {

    /**
     * Stack to hold integers entered by user
     */
    private Stack<Integer> intsList; //Changed from Linked List, changed variable name. 

    public CreateList (){ // Changed class name because previous name contained the word Linked List.
        this.intsList = new Stack<>(); //Changed from Linked List
    }
    
    /**
     * Method reads integers as input and puts them into a stack, sorted smallest to largest. 
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
