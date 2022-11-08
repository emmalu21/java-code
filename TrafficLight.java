/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 10

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/06/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args){

        Scanner readcolor = new Scanner(System.in);

        String color;
        System.out.print("Enter the color of the light: ");
        color = readcolor.next();

        switch (color)
        {
        case "red":
            System.out.println("Stop");
            break;

        case "yellow":
            System.out.println("Slow");
            break;

        case "green":
            System.out.println("go");
            break;

        default:
            System.out.println("Unknown");
        }

    }
}