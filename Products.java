/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 14

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/27/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class Product {
    public static void main (String[] args) {

        Scanner readnum = new Scanner(System.in);

        int num1;
        System.out.print("Enter the first number: ");
        num1 = readnum.nextInt();

        int num2;
        System.out.print("Enter the second number: ");
        num2 = readnum.nextInt();

        int total = num1 * num2;
        System.out.println(num1 + " x " + num2 " = " + total );
    }
}