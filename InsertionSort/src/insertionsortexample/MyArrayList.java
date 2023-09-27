/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortexample;

import java.util.*;

/**
 *
 * @author jordan
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {

    public void insertionSort() {
        int iCount;
        int iPosition;
        int comparisons = 0;
        ElementType keyElement;
        for (iCount = 1; iCount < size(); iCount++) {
            keyElement = get(iCount);
            iPosition = iCount -1;  //position of the key element
            
            while (iPosition >= 0 && ((Comparable) get(iPosition)).compareTo(keyElement) < 0) {
                set(iPosition + 1, get(iPosition));
                iPosition = iPosition - 1;
                //increments everytime a comparison happens
                comparisons++;
            }
            set(iPosition + 1, keyElement); //insert the key element in the correct position
        }
        //outputs the total number of comparisons
        System.out.println("Number of comparisons: " + comparisons);
    }
}
