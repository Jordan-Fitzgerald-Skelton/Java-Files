/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortexample;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {

    public void insertionSort() {
        // insert your code here
        ElementType keyElement;
        for (int iCount = 1; iCount< size(); iCount++){
            keyElement = get(iCount);
            int iPosition = iCount; //position of the key element
            //used to compare 
            while (iPosition > 0 && ((Comparable) get(iPosition - 1)).compareTo(keyElement) > 0){
                ElementType elementAtiPosition;
                elementAtiPosition = get(iPosition - 1);
                set(iPosition, elementAtiPosition);
                iPosition = iPosition - 1;
            }
            set(iPosition, keyElement);
        }
    }
    
    public void bubbleSort() {
        int iCount, jCount;
        Comparable elementAtjCount, elementAtjCountPlus;
        for (iCount = 0; iCount < size(); iCount++) {

            for (jCount = 0; jCount < size() - 1 - iCount; jCount++) {
                elementAtjCount = (Comparable) get(jCount);
                elementAtjCountPlus = (Comparable) get(jCount + 1);

                if (elementAtjCount.compareTo(elementAtjCountPlus) > 0) {
                    //swap element on postion jCount with element on position jCount + 1
                    swap(jCount, jCount + 1);
                }
            }
        }
    }

    public void swap(int inPos1, int inPos2) {
        //Create two objects that will store the info from the two positions
        ElementType objPos1 = get(inPos1);
        ElementType objPos2 = get(inPos2);
        //Remove element from position 1
        remove(inPos1);
        //Insert objPos2 into position 1
        add(inPos1, objPos2);
        //Remove element from position 2
        remove(inPos2);
        // Insert objPos1 into position 2
        add(inPos2, objPos1);
    }
}
