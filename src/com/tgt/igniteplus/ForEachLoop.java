// To find the sum of all elements in an integer array using For-each loop
package com.tgt.igniteplus;
public class ForEachLoop {
    public static void main(String[] args){
        int[] arr = {3, 4, 5, -5, 0, 12};
        int sum = 0;
        for (int number: arr) {
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}

/* Output
Sum = 19
 */
