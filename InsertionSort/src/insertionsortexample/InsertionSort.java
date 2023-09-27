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
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList<Integer> myList = myList = new MyArrayList<Integer>();
        
        //uses a for loop to add a set amount of numbers to the array list 
        for (int iCount = 0; iCount <10; iCount++) {
            //used to add a random number between 0 and 100
            myList.add((int)(Math.random()*100));
        }
        //prints the list befor it is sorted 
        System.out.println("The elements before sorting: " + myList.toString());
        
        //calls insertion sort to sort myList
        myList.insertionSort();
        //returns the list after it has been orderded 
        System.out.println("The elements after Insertion sort: " + myList.toString());
    }
}
