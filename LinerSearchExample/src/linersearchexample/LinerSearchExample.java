/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linersearchexample;

import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class LinerSearchExample{
    
    public static void main(String[] args) {
        
        MyArrayList<Integer> mylist1 = new MyArrayList();
        MyArrayList<Integer> mylist2 = new MyArrayList();
            mylist1.add(99);
            mylist1.add(6);
            mylist1.add(86);
            mylist1.add(15);
            mylist1.add(58);
            mylist1.add(35);
            mylist1.add(87);
            mylist1.add(0);
            mylist1.add(4);
            
            mylist2.add(1);
            mylist2.add(2);
            mylist2.add(3);
            mylist2.add(4);
            mylist2.add(5);
            mylist2.add(6);
            mylist2.add(7);
            mylist2.add(8);
            mylist2.add(9);
            
            System.out.println(mylist1.toString());
            System.out.println(mylist2.toString());
            
            
            //System.out.println(mylist1.unordered_sequentialSearch(58));
            System.out.println("Applying Unordered Linera Search");
            
            int position = mylist1.unordered_sequentialSearch(58); 
            if(position < 0){
                for(int i = 0; i <= position; i ++){
                    System.out.println("58 compared to " + mylist1.get(i));
                }
                System.out.println("Your number was not found in the list");
            }else{
                for(int i = 0; i <= position; i ++){
                    System.out.println("58 compared to " + mylist1.get(i));
                }
                System.out.println("Your number has been found");
            }
            
            System.out.println("Applying ordered Linera Search");
            
            int pos = mylist2.ordered_sequentialSearch(5); 
            if(position < 0){
                for(int i = 0; i <= position; i ++){
                    System.out.println("5 compared to " + mylist2.get(i));
                }
                System.out.println("Your number was not found in the list");
            }else{
                for(int i = 0; i <= position; i ++){
                    System.out.println("5 compared to " + mylist2.get(i));
                }
                System.out.println("Your number has been found");
            }

    }
}
