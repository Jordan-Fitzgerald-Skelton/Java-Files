/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AEMaterHospital;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class MyPriorityQueue implements PQInterface {

    private ArrayList<PQElement> thePQueue;

    public MyPriorityQueue() {
        thePQueue = new ArrayList<PQElement>();
    }

    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    public int size() {
        return thePQueue.size();
    }

    //a new element with a given key and element information will be added 
    public void enqueue(int iPriorityKey, Object patient) {
        int iIndex;
        PQElement newElement = new PQElement(iPriorityKey, (Patient) patient);

        iIndex = findInsertPosition(iPriorityKey);

        if (iIndex == size()) {
            thePQueue.add(newElement);
        } else {
            thePQueue.add(iIndex, newElement);
        }
    }

    //find the position where the new element will be added to the list in descending order
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

    //remove the first element on the list, which has the highest key (priority)
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    public String printPQueue() {
        String printString = new String();
        PQElement curElement;
        for (int iCount = 0; iCount < thePQueue.size(); iCount++) {
            curElement = thePQueue.get(iCount);
            printString = printString.concat(curElement.printPatient() + " * Priority = " + curElement.getiKey() + "\n");
        }
        return printString;
    }
}
