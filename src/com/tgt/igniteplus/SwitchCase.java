// program to construct a simple calculator using switch case
package com.tgt.igniteplus;
import java.util.Scanner;
public class SwitchCase {
        public static void main(String[] args) {
            double num1, num2;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number:");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number:");
            num2 = scanner.nextDouble();
            System.out.print("Enter an operator (+, -, *, /,%): ");
            char operator = scanner.next().charAt(0);
            scanner.close();
            double output = 0;
            switch (operator) {
                case '+':
                    output = num1 + num2;
                    break;
                case '-':
                    output = num1 - num2;
                    break;
                case '*':
                    output = num1 * num2;
                    break;
                case '/':
                    output = num1 / num2;
                    break;
                case '%':
                    output = num1 % num2;
                    break;
                default:
                    System.out.print("You have entered wrong operator");
                    break;
            }
            System.out.println(num1 + " " + operator + " " + num2 + ": " +output);
        }
}

/* Output
Enter first number:3
Enter second number:5
Enter an operator (+, -, *, /,%): /
3.0 / 5.0: 0.6
 */
