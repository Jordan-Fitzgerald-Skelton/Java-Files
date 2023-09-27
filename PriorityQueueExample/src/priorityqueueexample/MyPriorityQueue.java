/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexample;

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

    // new element with a given key and object info will be added in the right position
    // according to priority, so we are basically sorting the list as we insert new elements into it
    public void enqueue(int iInPriorityKey, Object inElement) {
        int iIndex;
        PQElement newElement = new PQElement(iInPriorityKey, inElement);

        iIndex = findInsertPosition(iInPriorityKey);

        if (iIndex > size()) {
            thePQueue.add(newElement);
        } else {
            thePQueue.add(iIndex, newElement);
        }
    }

    private int findInsertPosition(int iNewKey) {
        PQElement curElement;
        
        //using a FOR loop
        int iIndex = 0;

        for (iIndex = 0; iIndex < thePQueue.size(); iIndex++) {
            curElement = thePQueue.get(iIndex);
            if (curElement.getiKey() < iNewKey) {
                break;
            }
        }

        /* alternative way by using a WHILE loop
          boolean bFound = false;
        
          int iIndex = 0;
          
          while (iIndex < thePQueue.size() && !bFound)
          {
            curElement = thePQueue.get(iIndex);
            if(curElement.getiKey() > iNewKey){
                iIndex = iIndex +1;
            } else {
                bFound = true;
            }
          }
         */
        
        return iIndex;
    }

    //the first element has the highest priority
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    public String printPQueue() {
        PQElement curElement;
        String sMessage = new String();
        for (int iCount = 0; iCount < thePQueue.size(); iCount++) {
            curElement = thePQueue.get(iCount);
            sMessage = sMessage.concat("Priority = " + curElement.getiKey() + " * Element = " + curElement.getElement() + "\n");
        }
        return sMessage;
    }
}
