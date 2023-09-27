/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perfanalysisbubblesort;

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
        MyArrayList<String> mylist1;
        MyArrayList<String> mylist2;
        MyArrayList<String> mylist3;

        mylist1 = new MyArrayList<String>();
        mylist2 = new MyArrayList<String>();
        mylist3 = new MyArrayList<String>();

        //pupulate the collection with a large number of elements
        for (int iCount = 0; iCount < 500; iCount++) {
            mylist1.add("Xerox     ");
            mylist1.add("Orange    ");
            mylist1.add("Grape     ");
            mylist1.add("Pineapple ");
            mylist1.add("Lemon     ");
            mylist1.add("Strawberry");
            mylist1.add("Kiwi      ");
            mylist1.add("Nectarine ");
            mylist1.add("Melon     ");
            mylist1.add("Raspberry ");
        }

        // it is important that the algorithms to be compared are applied on exactly the same colection sets.
        // Elements in the List 1 are duplicated into two additional lists
        for (int iCount = 0; iCount < mylist1.size(); iCount++) {
            mylist2.add(iCount, mylist1.get(iCount));
        }

        for (int iCount = 0; iCount < mylist1.size(); iCount++) {
            mylist3.add(iCount, mylist1.get(iCount));
        }

        
        //TASK 1
        // apply BubbleSort() and simpleBubbleSort() on the two collections
        // measure the execution time of the two methods
        // print out the execution time of each method for the given array size.  
        //TASK 5
        // add code that allows you to measure the execution time of the Collections.sort() method 
        // when  applied on the same dataset / collection as bubble sort
        
        //mylist1.bubbleSort();
        //mylist2.simpleBubbleSort();
        
        long lStartTime = System.currentTimeMillis();
        mylist1.bubbleSort();
        long lEndTime = System.currentTimeMillis();
        System.out.println("Sorting the " + mylist1.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
        
        lStartTime = System.currentTimeMillis();
        mylist2.simpleBubbleSort();
        lEndTime = System.currentTimeMillis();
        System.out.println("Sorting the " + mylist2.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
        
        lStartTime = System.currentTimeMillis();
        Collections.sort(mylist3);
        lEndTime = System.currentTimeMillis();
        System.out.println("Sorting the " + mylist3.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
        
    }
}
