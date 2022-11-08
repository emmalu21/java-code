/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 11

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/13/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class Odd {
    public static void main(String[] args){

        Scanner readnum = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = readnum.nextInt();

        while (num != -1) 
        {
             if (num % 2 == 0)
            {
                System.out.println("Number " + num +" is even");
            }

            else 
            {
                System.out.println("Number " + num +" is odd");
            } 

            break;
        }      
    }
}