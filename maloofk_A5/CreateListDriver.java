/**
 * Karen Maloof
 * CSC 6301 Week 5
 * 
 *  CreateListDriver.java
 */
package maloofk_A5;

public class CreateListDriver {
    public static void main(String[] args) {
        //Construct new CreateList
        CreateList sortedList = new CreateList();

        //add integers to CreateList and sort
        sortedList.readInts ();
        //Display list on screen
        System.out.println ("Your integers are: ");
        sortedList.printList();
    }
}
