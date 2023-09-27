/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linersearchexample;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {
    
    public int unordered_sequentialSearch (ElementType key){
        for (int iCount = 0; iCount < size(); iCount ++){
            if(((Comparable) get(iCount)).compareTo((Comparable) key) == 0){
                return iCount;
            }
        }
        return -1;
    }
    
    public int ordered_sequentialSearch(ElementType key){
        int iCount = 0;
        while(((Comparable) get(iCount)).compareTo((Comparable) key) < 0 && (iCount < size())){
            iCount = iCount + 1;
        }
            if(((Comparable) get(iCount)).compareTo((Comparable) key) == 0){
                return iCount;
            }else{
                return -1;
            }
        }
    
}
