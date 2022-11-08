/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 8

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 09/22/2022

 * @Description: 

 *********************************************************************/

public class IntroString {
    public static void main(String [] args) {

        String intro = "Hello CSE1001 into to Strings" ;
        int x = intro.length();
        System.out.println("The legnth of the string is: " + x);

        System.out.println("The index of \'into\' in your string is: " + intro.indexOf("into"));

        System.out.println("Upper Case String: " + intro.toUpperCase());

        System.out.println("Lower Case String: " + intro.toLowerCase());


    }
}