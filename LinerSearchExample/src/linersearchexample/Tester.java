/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linersearchexample;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class Tester {
 
     public static void main(String[] args) {
        MyArrayList<Integer> myList;
        myList = new MyArrayList();
        
        for (int iCount = 0; iCount <10; iCount++) {
            myList.add((int)(Math.random()*11));
        }
        
        myList.unordered_sequentialSearch(myList, 2);
        
        system.out
     }
}
