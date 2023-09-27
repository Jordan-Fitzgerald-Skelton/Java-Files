/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksortexample;

/**
 *
 * @author Hamilton1
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList<Integer> myList1 = new MyArrayList();
        MyArrayList<Integer> myList2 = new MyArrayList();
        MyArrayList<Integer> myList3 = new MyArrayList();
        MyArrayList<Integer> myList4 = new MyArrayList();


        for (int iCount = 0; iCount < 5000; iCount++) {
            myList1.add((int)(Math.random()* 500000));
            /*
            myList.add(99);
            myList.add(6);
            myList.add(86);
            myList.add(15);
            myList.add(58);
            myList.add(79);
            myList.add(35);
            myList.add(87);
            myList.add(0);
            myList.add(4);
            */
        }
        
        for (int iCount = 0; iCount < myList1.size(); iCount++) {
            myList2.add(iCount, myList1.get(iCount));
        }

        for (int iCount = 0; iCount < myList1.size(); iCount++) {
            myList3.add(iCount, myList1.get(iCount));
        }
        for (int iCount = 0; iCount < myList1.size(); iCount++) {
            myList4.add(iCount, myList1.get(iCount));
        }

        //System.out.println("The elements in the initial list are: " + myList.toString());
        
        //starts a timer
        long lStartTime1 = System.currentTimeMillis();
        //applies merge sort 
        myList1.quickSort(0, myList1.size() - 1);
        //records when the timr ends
        long lEndTime1 = System.currentTimeMillis();
        //ouputs how long it takes
        System.out.println("Sorting the " + myList1.size() + " elements using quick sort took " + (lEndTime1 - lStartTime1) + " milliseconds");
        
        //starts a timer
        long lStartTime2 = System.currentTimeMillis();
        //applies merge sort 
        myList2.mergeSort(0, (myList2.size() - 1));
        //records when the timr ends
        long lEndTime2 = System.currentTimeMillis();
        //ouputs how long it takes
        System.out.println("Sorting the " + myList2.size() + " elements using merge sort took " + (lEndTime2 - lStartTime2) + " milliseconds");
        
        //starts a timer
        long lStartTime3 = System.currentTimeMillis();
        //applies insertion sort 
        myList3.insertionSort();
        //records when the timr ends
        long lEndTime3 = System.currentTimeMillis();
        //ouputs how long it takes
        System.out.println("Sorting the " + myList3.size() + " elements using insertion sort took " + (lEndTime3 - lStartTime3) + " milliseconds");
        
        //starts a timer
        long lStartTime4 = System.currentTimeMillis();
        //applies bubble sort 
        myList4.bubbleSort();
        //records when the timr ends
        long lEndTime4 = System.currentTimeMillis();
        //ouputs how long it takes
        System.out.println("Sorting the " + myList4.size() + " elements using bubble sort took " + (lEndTime4 - lStartTime4) + " milliseconds");
        
    }
}
