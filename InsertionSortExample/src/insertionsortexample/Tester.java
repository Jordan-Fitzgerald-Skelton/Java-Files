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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert your code here
        MyArrayList<Integer> myList1; 
        myList1 = new MyArrayList();
        MyArrayList<Integer> myList2; 
        myList2 = new MyArrayList();
        for (int iCount = 0; iCount < 4000; iCount++) {
            myList1.add((int)(Math.random() * 10000));
            myList2.add((int)(Math.random()*10000));
        }
        
        //Collections.shuffle(myList1);
        
        
        //starts a timer
        long StartTime1 = System.currentTimeMillis();
        
        myList1.insertionSort();
        
        // find out the time when the sort is complete
        long EndTime1 = System.currentTimeMillis();
        //System.out.println("Sorting the " + myList.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
        System.out.println("Sorting list 1 using insertion sort took " + (EndTime1 - StartTime1) + " milliseconds");
        
        long StartTime2 = System.currentTimeMillis();
        
        myList2.bubbleSort();
        
        // find out the time when the sort is complete
        long EndTime2 = System.currentTimeMillis();
        //System.out.println("Sorting the " + myList.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
        System.out.println("Sorting list 2 using bubble sort took " + (EndTime2 - StartTime2) + " milliseconds");

    }
}
