/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demorunningtime;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class SortArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //*--------------------------------------------
        // put lots of data into the collection
        // this adds all the fruits 1000 times
        //*--------------------------------------------

        ArrayList<String> myList = new ArrayList<String>();
        for (int iCount = 0; iCount < 1000; iCount++) {
            myList.add("Papaya     ");
            myList.add("Orange    ");
            myList.add("Grape     ");
            myList.add("Pineapple ");
            myList.add("Lemon     ");
            myList.add("Strawberry");
            myList.add("Kiwi      ");
            myList.add("Melon     ");
            myList.add("Raspberry ");
            myList.add("Apple     ");
        }

        //*--------------------------------------------
        // Shuffle the collection  before sorting it
        //*--------------------------------------------
        Collections.shuffle(myList);

        //*--------------------------------------------
        // find out the time before starting the sort
        //*--------------------------------------------
        long lStartTime = System.currentTimeMillis();

        //*--------------------------------------------
        // execute the sort by calling the sort method
        //*--------------------------------------------
        Collections.sort(myList);

        //*--------------------------------------------
        // find out the time when the sort is complete
        //*--------------------------------------------
        long lEndTime = System.currentTimeMillis();

        //*--------------------------------------------
        // calculate the elapsed time and print a message
        //*--------------------------------------------
        System.out.println("Sorting the " + myList.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
    }
}
