/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 16

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 11/08/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class ArrayEquals {
    public static void main (String [] args){

        int listnum = 0;
        int count = 0;

        Scanner num =  new Scanner(System.in);
        System.out.print("Enter the list length: ");
        listnum = num.nextInt();


        int[] array1 = new int[listnum];
        System.out.print("Enter the first list: ");

        for (int i = 0; i<= listnum; i++)
        {
            array1[i] = num.nextInt();

        }

        int[] array2 = new int[listnum];
        System.out.print("Enter the second list: ");

        for(int i = 0; i <= listnum; i++)
        {
            array2[i] = num.nextInt();

        }

        for (int i = 0; i <= listnum; i++)
        {
            if(array1[i] == array2[i])
            {
                count ++;
            }
        }

        if (count == listnum)
        {
            System.out.println("The lists are the same.");
        }

        else 
        {
            System.out.println("The lists are not the same.");
        }



    }
}
