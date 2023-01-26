/*
 * Author:  Emma Bahr, ebahr2022@fit.edu
 * Course:  CSE 2010, Section 02, Spring 2023
 * Project: Proj 05, Tram
 */

import java.util.Scanner;
public class Tram {
   public static void main (final String[] args) {

      int pOff = 0;
      int pOn = 0;
      int pStay = 0;
      int x = 0;
      int currentPeopleOn = 0;

      final Scanner scanner = new Scanner (System.in, "US-ASCII");

      final int c = scanner.nextInt();
      final int n = scanner.nextInt();

      for (int i = 0; i < n; i++) {
         currentPeopleOn = currentPeopleOn + pOn - pOff;
         pOff = scanner.nextInt();
         pOn = scanner.nextInt();
         pStay = scanner.nextInt();

         if (pOff > currentPeopleOn) {
            x++;
         }
         if (pOff > c) {
            x++;
         }
         if (pStay > 0 && pOn < c) {
            x++;
         }

      }

      if (x > 0) {
         System.out.printf("Impossible");
      }

      else {
         System.out.printf("Possible");
      }

   }
}

