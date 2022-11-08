/*******************************************************************

 * @By: Emma Bahr

 * @Lab: 7

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 09/20/22

 * @Description: 

 ******************************************************************/
import java.util.Scanner;
 public class Prefix {
    public static void main(String [] args){

        Scanner readword = new Scanner(System.in);
        String word;
        System.out.print("Enter a word with a prefix: ");
        word = readword.next();

        String word2;
        System.out.print("Enter the base: ");
        word2 = readword.next();

        int x = word.indexOf(word2);

        String y = word.substring(0,x);

        System.out.println("The prefix is: " +  y);
 }
}



