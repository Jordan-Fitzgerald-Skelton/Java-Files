/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Hamilton1
 */
public class Fibonacci {

    private static int fibonacci(int iNumber) {
        int iFibonacci;
        if ((iNumber == 1) || (iNumber == 2)) {
            iFibonacci = 1;
        } else {
            iFibonacci = fibonacci(iNumber - 1) + fibonacci(iNumber - 2);
        }
        return iFibonacci;
    }

    public static void Series(int iElements) {
        for (int iCount = 1; iCount <= iElements; iCount++) {
            System.out.println("The number on position " + iCount + " in the series is " + fibonacci(iCount));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Series(12);
    }
}