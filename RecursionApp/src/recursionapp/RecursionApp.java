/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursionapp;

/**
 *
 * @author Jordan
 */
public class RecursionApp {
    
    public static int twoToThePowerOf(int iNumber) {
        if(iNumber == 0){
            return 1;
        } else{ //recursive case
         return 2 * twoToThePowerOf(iNumber - 1);   
        }
    }
    
    public static int power(int iBase, int iExponent) {
        if(iExponent == 0){
            return 1;
        } else{
            return iBase * power(iBase, iExponent - 1);
        }
    }
    
    public static boolean palindrome(String word) {
        if (word.length() <= 1) {
            return true;
        } else {
            if (word.charAt(0) != word.charAt(word.length() - 1)) {
                return false;
            } else {
                return palindrome(word.substring(1, word.length() - 1));
            }
        }
    }
    
     public static void reverse(String word) {
        if (word.length() == 1) {
            System.out.print(word);
        } else{
            System.out.print(word.substring(word.length() - 1));
            reverse(word.substring(0, word.length() - 1));
            //https://www.javatpoint.com/substring
        }
    }
    

    public static void main(String args[]){
        //two the power of 2
        //int iNumber = 4;
        //System.out.println( "2 to the power of 9 = " + twoToThePowerOf(iNumber));
        
        //power
        //int iBase = 3;
        //int iExponent = 4;
        //System.out.println(iBase + " to the power of " + iExponent + " = " + power(3, 4));
        
        //Palindrone
        //System.out.println("Is LEVEL palindrome? " + palindrome("LEVEL"));
        //System.out.println("Is ABCDEFG palindrome? " + palindrome("ABCDEFG"));
        //System.out.println("is a palindrome " + palindrome("A"));
        
        System.out.println("reverse Apple");
        reverse("apple");
        System.out.println("\n");
    }
    
}