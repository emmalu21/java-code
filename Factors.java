/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 14

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/27/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class Factors {
    public static void main (String[] args) {

        Scanner readnum = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = readnum.nextInt();

        System.out.println("The factors of: " + num + " are: ");

        for (int i = 1; i <=num; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
