/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){

        Scanner math = new Scanner(System.in);

        System.out.print("Enter a number: ");

        String number1 = math.nextLine();

        var num1 = Integer.parseInt(number1, 10);

        System.out.print("Enter another number: ");

        String number2 = math.nextLine();

        var num2 = Integer.parseInt(number2, 10);

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n",num1, num2,  (num1 + num2), num1, num2, (num1 - num2), num1, num2, (num1 * num2), num1, num2, (num1 / num2));
    }
}
