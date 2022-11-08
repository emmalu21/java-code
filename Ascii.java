/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 12

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/18/2022

 * @Description: 

 *********************************************************************/
import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {

        Scanner readletter = new Scanner(System.in);

        char start;
        System.out.print("Enter a starting character: ");
        start = readletter.next().charAt(0);


        char end;
        System.out.print("Enter an ending character: ");
        end = readletter.next().charAt(0);

        int start1 = start;
        int end1 = end;

        for(int i = start1; i <= end1; i++)
        {
            System.out.println(Character.toChars(i));
        }


    }
}