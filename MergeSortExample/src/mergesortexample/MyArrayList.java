/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortexample;

import java.util.*;

/**
 *
 * @author Hamilton1
 */

public class MyArrayList<ElementType> extends ArrayList<ElementType> {

    //Merge Sort Algorithm
    public void mergeSort(int iStart, int iEnd) {
        int iMiddle = 0;
        if (iStart < iEnd) {
            // middle in the middle between start and end is determined
            iMiddle = (iStart + iEnd) / 2;

            // first part of the array (from start to mid) sorted by recursive calls
            mergeSort(iStart, iMiddle);

            // second part of the array (from mid+1 to end) sorted by recursive calls of	merge(array, start, mid, end)
            mergeSort(iMiddle + 1, iEnd);

            // merges array [start .. mid] with array[mid+1.. end]
            merge(iStart, iMiddle, iEnd);
        } else {
            // do nothing, the array has one element, so it is sorted
            return;
        }
    }

    //Merge Sort Algorithm - Merging process
    public void merge(int iLeft, int iMiddle, int iRight) {
        int iCount = iLeft;
        int jCount = iMiddle + 1;
        int kCount = 0;
        ArrayList<Object> tempArray = new ArrayList<Object>();

        while (iCount <= iMiddle && jCount <= iRight) {
            if (((Comparable) get(iCount)).compareTo((Comparable) get(jCount)) < 0) {
                tempArray.add(kCount, get(iCount));
                iCount = iCount + 1;
            } else {
                tempArray.add(kCount, get(jCount));
                jCount = jCount + 1;
            }
            kCount = kCount + 1;
        }

        // there are elements left in 1st half to be copied
        while (iCount <= iMiddle) {
            tempArray.add(kCount, get(iCount));
            kCount = kCount + 1;
            iCount = iCount + 1;
        }

        // there are elements left in 2nd half to be copied
        while (jCount <= iRight) {
            tempArray.add(kCount, get(jCount));
            kCount = kCount + 1;
            jCount = jCount + 1;
        }

        // copy the sorted tempArray into the original array
        for (iCount = iLeft, kCount = 0; iCount <= iRight; iCount++, kCount++) {
            set(iCount, (ElementType) tempArray.get(kCount));
        }
    }
}
