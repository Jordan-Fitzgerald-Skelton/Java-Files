/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

/**
 *
 * @author Hamilton1
 */
public class QueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueInterface queueInterface = new MyQueue();
        
        // enqueue 3 items (String type) into the queue   
        queueInterface.enqueue("Element 1");
        queueInterface.enqueue("Element 2");
        queueInterface.enqueue("Element 3");
        System.out.println("Added three elements");
        System.out.println("******************");

        // check the size of queue
        System.out.println("Queue size is " + queueInterface.size());
        System.out.println("******************");

        // enqueue 7 extra items (String type)into the queue   
        queueInterface.enqueue("Element 4");
        queueInterface.enqueue("Element 5");
        queueInterface.enqueue("Element 6");
        queueInterface.enqueue("Element 7");
        queueInterface.enqueue("Element 8");
        queueInterface.enqueue("Element 9");
        queueInterface.enqueue("Element 10");
        System.out.println("Added seven more elements");
        System.out.println("******************");

        // check the size of queue again
        System.out.println("Queue size is " + queueInterface.size());
        System.out.println("******************");

        //print the item at the front of  the queue
        System.out.println(queueInterface.frontElement() + " is at the front of the Queue");
        System.out.println("******************");

        //remove/dequeue all items from the queue
        while (queueInterface.size() > 0) {
            System.out.println("Element dequeued: " + queueInterface.dequeue());
            System.out.println("Queue size is: " + queueInterface.size());
        }
        System.out.println("******************");
        
        // Try to dequeue/remove from an empty queue
        System.out.println("Element dequeued: " + queueInterface.dequeue());
        System.out.println("******************");
    }
}
