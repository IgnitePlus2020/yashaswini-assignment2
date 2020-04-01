// Program to find the sum of numbers using do while
package com.tgt.igniteplus;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;
        } while (number != 0.0);  // loop continues until the number is not equal to zero
        System.out.println("Sum = " + sum);
    }
}

/* Output
Enter a number: 9
Enter a number: 5
Enter a number: 4.8
Enter a number: 0
Sum = 18.8
 */