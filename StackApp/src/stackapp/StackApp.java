/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

/**
 *
 * @author Hamilton1
 */
public class StackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackInterface myStackInterface;
        myStackInterface = new MyStack();

        System.out.println("Is the Stack  empty? " + myStackInterface.isEmpty());
        System.out.println("******************");

        // push 3 items (String type) into the stack 
        myStackInterface.push("String one");
        myStackInterface.push("String two");
        myStackInterface.push("String three");
        System.out.println("Three items were added to the stack!");
        System.out.println("******************");

        // check if the stack is empty now
        System.out.println("Is the Stack empty? " + myStackInterface.isEmpty());
        System.out.println("******************");

        // check the size of the stack
        System.out.println("Stack size is " + myStackInterface.size());
        System.out.println("******************");

        // Pop/remove 2 items and print them out
        String itemOut;
        itemOut = (String) myStackInterface.pop();
        System.out.println("Popped item: " + itemOut);
        itemOut = (String) myStackInterface.pop();
        System.out.println("Popped item: " + itemOut);
        System.out.println("******************");

        // check if the stack is empty now, after popping out some items
        System.out.println("Is the Stack empty? " + myStackInterface.isEmpty());
        System.out.println("******************");

        // Empty the stack  (pop/remove the last item)
        itemOut = (String) myStackInterface.pop();
        System.out.println("Popped item: " + itemOut);
        System.out.println("******************");

        // check if the stack is empty now, after popping out all items
        System.out.println("Is the Stack empty? " + myStackInterface.isEmpty());
        System.out.println("******************");        
        
        // Try to Pop/remove from an empty stack to see what happens
        itemOut = (String) myStackInterface.pop();
        System.out.println("Popped item " + itemOut);
        System.out.println("******************");
    }
}
