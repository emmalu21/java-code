/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 11

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/13/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class Even {
    public static void main(String[] args){

        Scanner readnumber = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = readnumber.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Number " + num +" is even");
        }

        else 
        {
            System.out.println("Number " + num +" is odd");
        }
    }
}