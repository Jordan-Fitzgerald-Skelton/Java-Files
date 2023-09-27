/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortexample;

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
        MyArrayList<String> myList;
        myList = new MyArrayList<String>();

        // add at least 5 elements of type String in your collection
        myList.add("element1");
        myList.add("element3");
        myList.add("element4");
        myList.add("element5");
        myList.add("element2");
        // print the elements from the collection
        for (int iCount = 0; iCount < myList.size(); iCount++){
            System.out.println(myList.get(iCount));
        }
        // call the bubbleSort() method
        myList.bubbleSort();
        // print the elements again. Now your colection should be sorted
        System.out.println(myList.toString());
        // shuffle the colection, call the simpleBubbleSort() method and check if it works correctly
        Collections.shuffle(myList);
        for (int iCount = 0; iCount < myList.size(); iCount++){
            System.out.println(myList.get(iCount));
        }
        System.out.println("***************************************");
        myList.simpleBubbleSort();
        System.out.println(myList.toString());
    }
}