/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 11/01/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {

        Scanner readnum = new Scanner(System.in);

        int x;
        System.out.print("Enter the number of values: ");
        x = readnum.nextInt();

        System.out.print("Enter numbers: ");

        int[] array = new int[x];

        for (int i = 0; i < x; i++)
        {
            array[i]=readnum.nextInt();
        }

        System.out.println("Values input were: ");

        System.out.println();

        for (int i = 0; i < x; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int sum = 0;
        for(int i = 0; i < x; i++)
        {
            sum = sum + array[i];
        }

        System.out.println("Sum is: " + sum);

        System.out.println();

        int product = 1;
        for (int i = 0; i < x; i++)
        {
            product = product * array[i];
        }

        System.out.println("Product is: " + product);

        System.out.println();

        double average;
        average = sum / x;
        System.out.println("Average is: " + average);

        System.out.println();

        double avgDistance = 0;
        for(int i = 0; i < x; i++)
        {
            avgDistance = avgDistance + Math.abs(array[i]-average);
        }

        System.out.println("Average distance from the mean is: " + avgDistance);

    }
}

