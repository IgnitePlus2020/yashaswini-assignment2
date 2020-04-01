// To find the sum of first n natural numbers using for loop
package com.tgt.igniteplus;
import java.util.Scanner;
public class ForLoop {
        public static void main(String[] args) {
            int num, count, total = 0;
            System.out.println("Enter the value of n:");
            Scanner scan = new Scanner(System.in);
            num=scan.nextInt();
            scan.close();
            for(count = 1; count <= num; count++){
                total = total + count;
            }

            System.out.println("Sum of first "+num+" natural numbers is: "+total);
        }
    }
/* Output
Enter the value of n:
10
Sum of first 10 natural numbers is: 55
 */

