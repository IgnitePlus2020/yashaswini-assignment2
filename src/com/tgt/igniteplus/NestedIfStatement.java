//To check if the number is within the range 50 to 100 using Nested if statement
package com.tgt.igniteplus;
import java.util.Scanner;
public class NestedIfStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        sc.close();
        if( number < 100 ){
            System.out.println("number is less than 100");
            if(number > 50){
                System.out.println("number is greater than 50");
            }
        }
    }
}

/* Output
enter the number
75
number is less than 100
number is greater than 50
 */
