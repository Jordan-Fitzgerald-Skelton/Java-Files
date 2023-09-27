/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class TestArrayList {

    public static void main(String[] args) {
        // declare an ArrayList object
        ArrayList<Person> list = new ArrayList<>();

        //Task 1: Create and add three Person type objects to the ArrayList object. 
        //Each element will be added at the end of the list
        //add your code below
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jack", 30);
        Person person3 = new Person("Jill", 22);
        
        list.add(person1);
        list.add(person2);
        list.add(person3);

        //Task 2: Print the elements of the ArrayList using a For loop combined with printPerson() method part of the Person class
        //add your code below
        for(int i =0; i<list.size();i++) {
            System.out.println(list.get(i).printPerson());
        }
        //Task 3: Add a Person object (a new person) on the second position of the ArrayList object
        //add your code below
        Person newperson2 = new Person("Jim", 25);
        list.add(1, newperson2);

        //Task 4: Print the elements of the ArrayList using an ITERATOR object to check if the new person was added
        //add your code below
        Iterator i;
        i = list.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        } 
        //Task 5: Remove the element (person) found on first position
        //add your code below
        list.remove(0);

        //Task7: Check if a person with a given name exists in the ArrayList. If so, print person’s position in the list
        //add your code below
        if(list.contains(newperson2)) {
            System.out.println("The index of jim = index "+ list.indexOf(newperson2));
        }
        
    }
}