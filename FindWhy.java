/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 8

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 09/22/2022

 * @Description: The output of the last line is negtative one because the word like is not actually in the string.

 *********************************************************************/

public class FindWhy {
    public static void main(String[] args) {

        String state = "I'm still confused! Do I enjoy programming or no?";
        System.out.println("The string is: " + state);

        int x = state.length();
        System.out.println("The legnth of the string is: " + x);

        System.out.println("The index of \'like\' in your string \'I'm still confused! Do I enjoy programming or no?\' is: " + state.indexOf("like"));



    }
}