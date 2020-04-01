//To check if number is less than 100 using if statement
package com.tgt.igniteplus;
import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number");
        int number = sc.nextInt();
        sc.close();
        if (number < 100) {
            System.out.println("number is less than 100");
        }
    }
}

/* Output
enter the  number
50
number is less than 100
 */


