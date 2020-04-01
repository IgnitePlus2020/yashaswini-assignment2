// Program to find the sum of natural numbers from 1 to n  using while loop
package com.tgt.igniteplus;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        while (n != 0) {
            sum=sum+n;
            --n;
        }
        System.out.println("Sum = " + sum);
    }
}

/* Output
enter the value of n:
100
Sum = 5050
 */