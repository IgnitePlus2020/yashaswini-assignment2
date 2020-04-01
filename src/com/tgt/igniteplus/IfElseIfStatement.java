// to check if the entered character is vowel or consonant using if else if statement
package com.tgt.igniteplus;
import java.util.Scanner;
public class IfElseIfStatement {
    public static void main(String[ ] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        sc.close();
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Entered character "+ch+" is a Vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is a Consonant");
        else
            System.out.println("Not an alphabet");
    }
}

/* Output
Enter a character :
h
Entered character h is a Consonant

 */
