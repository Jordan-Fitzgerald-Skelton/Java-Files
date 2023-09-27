/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialapp;

/**
 *
 * @author Hamilton1
 */
public class FactorialApp {

    /**
     * @param args the command line arguments
     */
    public static long factorial(long lNumber) {
        if (lNumber == 0) {
            return 1;
        } else {
            return lNumber * factorial(lNumber - 1);
        }
    }

    public static void main(String[] args) {
        int lNumber = 45;
        System.out.println("The factorial of " + lNumber + " is: " + factorial(lNumber));
    }
}
