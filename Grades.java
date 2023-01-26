/*
 * Author:  Emma Bahr, ebahr2022@fit.edu
 * Course:  CSE 2010, Section 02, Spring 2023
 * Project: Proj 04, Scanner
 */

import java.util.Scanner;
public final class Grades {
   public static void main (final String[] args) {
      final Scanner scanner = new Scanner (System.in, "US-ASCII");

      int x = 0;
      int y = 0;
      double average = 0;
      int sum = 0;

      x = scanner.nextInt();

      final int [] score = new int[x];
      double standard = 0;
      final double [] zScore = new double[x];
      final String [] firstName = new String[x];
      final String [] lastName = new String[x];
      final String [] letterGrade = new String[x];

      while (y < x) {
         firstName[y] = scanner.next();
         lastName[y] = scanner.next();
         score[y] = scanner.nextInt();
         sum = sum + score[y];
         y++;
      }

      average = sum / x;
      standard = (Math.sqrt(Math.pow(sum - average, 2)/x));
      y = 0;

      while (y < x) {
         zScore[y] = ((score[y] - average)/standard);

         if (zScore[y] >= 1.0) {

            letterGrade[y] = "A"; }

         else if (zScore[y] >= 0.0) {

            letterGrade[y] = "B"; }

         else if (zScore[y] >= -1.0) {

            letterGrade[y] = "C"; }

         else if (zScore[y] >= -2.0) {

            letterGrade[y] = "D"; }

         else {
         letterGrade[y] = "F"; }

      y++ ; 
      }
      y = 0;
      System.out.println(" ");
      System.out.printf("%1s %1s %23s %5n %1s\n" ,"Name", "Name", "Score", "Z", "Grade");

      while (y < x) {
         System.out.printf("%11s %-15s %5d %5.2f %5s\n", firstName[y], lastName[y], score[y], 
         zScore[y], letterGrade[y]);
         y++;
      }
      
      System.out.print("Average: " + average);
    }
}
