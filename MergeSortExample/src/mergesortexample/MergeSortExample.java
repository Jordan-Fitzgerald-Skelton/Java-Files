/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortexample;

/**
 *
 * @author jordan
 */
public class MergeSortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<Integer>();
        MyArrayList<Integer> myListback = new MyArrayList<Integer>();
        
        //for (int iCount = 0; iCount <40000; iCount++) {
            //myList.add((int)(Math.random()*500000));
            myList.add(1);
            myList.add(99);
            myList.add(6);
            myList.add(86);
            myList.add(15);
            myList.add(58);
            myList.add(35);
            myList.add(87);
            myList.add(0);
            myList.add(4);
            
        //}
        System.out.println("The elements in the initial list are: " + myList.toString());
        //starts a timer
        //long lStartTime = System.currentTimeMillis();
        //applies merge sort 
        myList.mergeSort(0, (myList.size() - 1));
        //records when the timr ends
        //long lEndTime = System.currentTimeMillis();
        //ouputs how long it takes
        //System.out.println("Sorting the " + myList.size() + " elements using mergesort took " + (lEndTime - lStartTime) + " milliseconds");

        for (int i = myList.size() - 1; i>= 0 ; i--) {
            myListback.add(myList.get(i));
        }
        System.out.println("The elements after Merge Sort in decending oredr are: " + myListback.toString());
    }
}
