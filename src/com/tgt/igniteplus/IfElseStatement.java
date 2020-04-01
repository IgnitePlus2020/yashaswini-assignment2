// To check if the number is positive or negative using if else statement
package com.tgt.igniteplus;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        sc.close();
        if (number >= 0) {
            System.out.print("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}

/* Output
enter the number
-9
Number is negative

 */