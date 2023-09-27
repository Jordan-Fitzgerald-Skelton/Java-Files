/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sllexample;

/**
 *
 * @author Hamilton1
 */
public class SLLExample {

    public static void main(String[] args) {
        //add your code below
        SLList mylist = new SLList();
        
        mylist.add(1, "element1");
        mylist.add(2, "element2");
        mylist.add(3, "element3");
        mylist.add(4, "element4");
        
        System.out.println(mylist.isEmpty());
        
        System.out.println("The size of the list is " + mylist.size());
        
        mylist.printList();
        
        mylist.add("element5");
        System.out.println("Another element was added");
        
        mylist.printList();
        
        mylist.remove(5);
        System.out.println("The last element was removed ");
        
        System.out.println("The content of the third Node is " + mylist.get(3));
        
        
    }
}
