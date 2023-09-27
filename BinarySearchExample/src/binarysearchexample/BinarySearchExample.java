/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchexample;

/**
 *
 * @author jordan
 */
public class BinarySearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(12);
        myList.add(24);
        myList.add(36);
        myList.add(42);
        myList.add(57);
        myList.add(68);
        myList.add(73);
        myList.add(89);
        myList.add(93);
        myList.add(99);

        System.out.println("The elements in list 1 are: " + myList.toString());
        System.out.println("Binary Search Non Recursive");
        Integer iKey = 12;
        System.out.println("Searching for number " + iKey);
        int position1 = myList.binarySearch_nonRecursive(iKey, 0, myList.size()-1);
        if(position1 == -1){
            System.out.println("The number "+ iKey +" was not found in the list");
        }else{
            System.out.println("The number " +iKey +" was found in the list at position " + position1);
        }
        
        System.out.println("*********************");
        System.out.println("Binary Search Recursive");
        System.out.println("Searching for number " + iKey);
        
        int position2 = myList.binarySearch_recursive(iKey, 0, myList.size()-1);
        
        if(position2 == -1){
            System.out.println("The number "+ iKey+" was not found in the list");
        }else{
            System.out.println("The number "+ iKey +" was found in the list at poistion " + position2);
        }

    }
    
}
