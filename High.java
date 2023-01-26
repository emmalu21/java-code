/*
 * Author:  Emma Bahr, ebahr2022@fit.edu
 * Course:  CSE 2010, Section 02, Spring 2023
 * Project: Proj 04, Scanner
 */
import java.util.Scanner;
public final class High {
   public static void main (final String[] args) {
      final Scanner scanner = new Scanner (System.in, "US-ASCII");
      int highGrade = 0;
      String highName = "";

      while (scanner.hasNext()) {

         final String firstName = scanner.next();
         final String lastName = scanner.next();
         final int grade = scanner.nextInt();

         if (grade > highGrade) {
            highGrade = grade;
            highName = firstName + " " + lastName;
         }
      }
      System.out.println(highName + " " + highGrade);
   }
}
