/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 9a

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/03/2022

 * @Description: 

 *********************************************************************/

public class Addition {
    public static void main(String[] args){

        int a;
        int b;
        int c;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if (a + b == c)
        {
            System.out.println("Yes");
        }
        else if (b + c == a)
        {
            System.out.println("Yes");
        }
        else if (c + a == b)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}