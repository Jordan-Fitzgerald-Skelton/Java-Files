/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchexample;

import java.util.*;

/**
 *
 * @author jordan
 */

public class MyArrayList<ElementType> extends ArrayList<ElementType> {

    public int unordered_sequentialSearch(ElementType key) {
        int iCount;
        for (iCount = 0; iCount < size(); iCount++) {
            System.out.println(key + " was compared to " + get(iCount));
            if (((Comparable) get(iCount)).compareTo((Comparable) key) == 0) {
                return iCount;
            }
        }
        return -1;
    }

    public int ordered_sequentialSearch(ElementType key) {
        int iCount;
        iCount = 0;
        while (((Comparable) get(iCount)).compareTo((Comparable) key) < 0 && iCount < size()) {
            System.out.println(key + " was compared to " + get(iCount));
            iCount = iCount + 1;
        }
        if (((Comparable) get(iCount)).compareTo((Comparable) key) == 0) {
            return iCount;
        } else {
            return -1;
        }
    }
}
