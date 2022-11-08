/*******************************************************************

 * @By: Emma Bahr

 * @Lab: 9

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 09/27/22

 * @Description: 

 ******************************************************************/

import java.util.Scanner;
public class LeapYear {
    public static void main(String [] args){

        Scanner readyear = new Scanner(System.in);
        int year;
        System.out.print("Enter a year to check if it is a leap year: ");
        year = readyear.nextInt();

        if (year % 100 == 0)
        {
            if (year % 400 == 0) 
            {
                System.out.println(year + " is a leap year.");
            }

            else 
            {
                System.out.println(year + " is not a leap year.");
            }
        } 

        else if (year % 4 == 0)
        {
            System.out.println(year + " is a leap year.");
        }
         else 
         { 
            System.out.println(year + " is not a leap year.");
        }
    }
}
