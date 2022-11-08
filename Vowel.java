/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 13

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/25/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {

        Scanner readVowel = new Scanner(System.in);

        String line;
        System.out.print("Enter a line of text: ");
        line = readVowel.nextLine();

        for(int i = 0; i<line.length(); i++)
        {
            char x = line.charAt(i);

            if (x >= 'a' && x <= 'z')
            {
                if (x == 'a' || x == 'e' || 
                x == 'i' || x == 'o' || 
                x == 'u')
                {
                    System.out.println(x + " is a vowel.");
                }

                else
                {
                    System.out.println (x + " is a consonant.");
                }  
            }   
            else
            {
                System.out.println(x + "is some other character");
            }

        }
    }
}