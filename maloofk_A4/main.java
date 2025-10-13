
package maloofk_A4;
/**
 * Main runs IntLinkedList.java
 */
public class main {
    public static void main(String[] args) {
        //Construct new IntLinkedList
        IntLinkedList sortedLL = new IntLinkedList();

        //add integers to IntLinkedList and sort
        sortedLL.readInts ();
        //Display list on screen
        System.out.println ("Your integers are: ");
        sortedLL.printList();
    }
}
