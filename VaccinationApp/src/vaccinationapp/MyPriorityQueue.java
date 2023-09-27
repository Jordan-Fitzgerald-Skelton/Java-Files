/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationapp;

import java.util.*;

/**
 *
 * @author Jordan
 */
// (implements PQInterface) allows for this class to use the methods contained in the class  
public class MyPriorityQueue implements PQInterface {

    //creates the priority queue. This arraylist will act as the Priority Queue 
    private ArrayList<PQElement> thePQueue;

    public MyPriorityQueue() {
        thePQueue = new ArrayList<PQElement>();
    }
    //used to check if the Priority Queue(thePQueue Arraylist) is empty
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }
    public int size() {
        //uses the .size() method to get the size of the Priority Queue(thePQueue Arraylist)
        return thePQueue.size();
    }
    //a new element with a given key and element information will be added 
    public void enqueue(int iPriorityKey, Object patient) {
        int iIndex;
        //adds a patient object with a priority key to the priority queue (ArrayList<PQElement>).
        PQElement newElement = new PQElement(iPriorityKey, (Patient) patient);
        //uses the findInsertPosition on the inputted iPriorityKey
        iIndex = findInsertPosition(iPriorityKey);
        //if the returned value is the same as the size of the Priority Queue 
        //it adds it to the first position of the Queue
        if (iIndex == size()) {
            thePQueue.add(newElement);
            //adds the Patient object that contains the patient data to the returned index
        } else {
            thePQueue.add(iIndex, newElement);
        }
    }
    //this method finds the position where the new element will be added
    //based on the key (priority) provided
    private int findInsertPosition(int iNewKey) {
        boolean bFound = false;
        int iPosition = 0;
        PQElement curElement;
        while (iPosition < thePQueue.size() && !bFound) {
            curElement = thePQueue.get(iPosition);
            if (curElement.getiKey() > iNewKey) {
                iPosition = iPosition + 1;
            } else {
                bFound = true;
            }
        }
        return iPosition;
    }
    //prints every patient in the queue
    public String printPQueue(){
        String printString = new String();
        PQElement curElement;
        for (int iCount = 0; iCount < thePQueue.size(); iCount++) {
            //gets the elements from position iCount from the priority queue
            curElement = thePQueue.get(iCount);
            //calls the printPatient method from the PQElement class and its priority key from the Priority Queue
            printString = printString.concat(curElement.printPatient() + " * Priority: " + curElement.getiKey() + "\n");
        }
        return printString;
    }
    //prints out the elements that have the same priority key and removes them from the list
    //similar to the printQueue methos below
    public Object dequeue() {
        String printString = new String();
        PQElement curElement;
        //gets the priority key of the first item in the priority queue
        int priorityKey = thePQueue.get(0).getiKey();
        boolean loop = true;
        while (loop == true) {
            //if the array is not empty and the current items key is the same as the priorityKey.
            if (!thePQueue.isEmpty() && thePQueue.get(0).getiKey() == priorityKey) {
                // get the first element of the queue
                curElement = thePQueue.get(0);
                printString = printString.concat(curElement.printPatient() + " " + "Priority: " + curElement.getiKey() + "\n");
                // removes the first element from the priority queue
                thePQueue.remove(0);
            } else {
                loop = false;
            }
        }
        return printString;
    }
}