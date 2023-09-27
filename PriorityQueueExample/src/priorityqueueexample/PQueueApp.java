/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexample;

/**
 *
 * @author Hamilton1
 */
public class PQueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        PQInterface pqInterface = new MyPriorityQueue();

        System.out.println("Size of PQ is " + pqInterface.size());
        System.out.println("*********************");
        
        System.out.println("Is the PQ empty ? " + pqInterface.isEmpty());
        System.out.println("*********************");

        pqInterface.enqueue(2,"Call my friend Sam");
        pqInterface.enqueue(10,"Have breakfast");
        pqInterface.enqueue(5,"Work on assignment");
        pqInterface.enqueue(7,"Go to College");
        System.out.println("4 elements were added to PQ");
        System.out.println("*********************");
        
        System.out.println("Size of PQ is " + pqInterface.size());
        System.out.println("*********************");
        
        System.out.println("Is the PQ empty ? " + pqInterface.isEmpty());
        System.out.println("*********************");
        
        System.out.println("Printing all elements from the PQ... ");
        System.out.println(pqInterface.printPQueue());
        System.out.println("*********************");
        
        PQElement removeElement = (PQElement)pqInterface.dequeue();
        System.out.println("This activity was removed: " + removeElement.getElement());
        System.out.println("*********************");
        
        System.out.println("Printing after I have removed one activity... ");
        System.out.println(pqInterface.printPQueue());
    }
}
