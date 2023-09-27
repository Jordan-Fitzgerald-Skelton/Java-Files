/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demorunningtime;
import java.util.*;

/**
 *
 * @author Jordan
 */
public class findSmallestNumber {
    
    public static void main (String args[]){
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int iCount = 0; iCount < 1000; iCount++){
            int iRandomNum = (int)(Math.random() * 1000);
            myList.add(iRandomNum);
        }

        //*--------------------------------------------
        // find out the time before starting the sort
        //*--------------------------------------------
        long lStartTime = System.currentTimeMillis();
        
        findSmallestElement(myList);
        
        //*--------------------------------------------
        // find out the time when the sort is complete
        //*--------------------------------------------
        long lEndTime = System.currentTimeMillis();
        
        System.out.println("Sorting the " + myList.size() + " elements took " + (lEndTime - lStartTime) + " milliseconds");
    }
    
    
    public static int findSmallestElement(ArrayList<Integer> iInNumber) {
        int iSmallestElement;
        iSmallestElement = iInNumber.get(0);
        for (int iCount = 0; iCount < iInNumber.size(); iCount++) {
            if (iInNumber.get(iCount) < iSmallestElement) {
                iSmallestElement = iInNumber.get(iCount);
            }
        }
        return iSmallestElement;
    }
    
}
