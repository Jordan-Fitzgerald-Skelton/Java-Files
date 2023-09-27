/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchexample;

import java.util.*;

/**
 *
 * @author jordan
 */

public class MyArrayList<ElementType> extends ArrayList<ElementType> {
    
    public int binarySearch_nonRecursive(ElementType key, int start, int end) {
        boolean found = false;
        int middle = 0;
        while ((start <= end) && (!found)){
            middle = (start + end) / 2;
            //array_ElemAt (middle) == key
            if(((Comparable) get(middle)).compareTo((Comparable) key) == 0){
                found = true;
            //array_ElemAt (middle) < key
            }else if(((Comparable) get(middle)).compareTo((Comparable) key) < 0){
                start = middle +1;
            }else{
                end = middle-1;
            }
        }
        
        if (found == true){
            return middle;
        }else{
            return -1;
        }
    }
    
     public int binarySearch_recursive(ElementType key, int start, int end) {
         int middle = (start + end) / 2;
         int result;
         if(((Comparable) get(middle)).compareTo((Comparable) key) == 0){ //base case
            result = middle;
         }else if (start == end){ //base case
             result = -1;
         }else{ //recursive case
             if (((Comparable) get(middle)).compareTo((Comparable) key) > 0){
                 result = binarySearch_recursive(key, start, middle-1);
             }else
                 result = binarySearch_recursive(key, middle+1, end);
             }
         return result;
         }
} 
