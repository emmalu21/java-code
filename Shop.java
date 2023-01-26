/*
 * Author:  Emma Bahr, ebahr2022@fit.edu
 * Course:  CSE 2010, Section 02, Spring 2023
 * Project: Proj 06, Shopaholic
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Shop {
   public static void main (final String[] args) {

      final Scanner scanner = new Scanner (System.in, "US-ASCII");

      final int numOfItems = scanner.nextInt();
      final Integer [] priceOfItems = new Integer[numOfItems];
      
      //reversing array order 
      for(int i = 0; i <numOfItems; i++) {

         priceOfItems[i] = scanner.nextInt();
      }

      Arrays.sort(priceOfItems, Collections.reverseOrder());

      // getting total discount

      int totalDiscount = 0;
      for(int i = 0; i < numOfItems; i++) {

         if(priceOfItems[i+2] < priceOfItems.length - 1) {
            i++;
            i++;
            totalDiscount = totalDiscount + priceOfItems[i];
         }
      }

      System.out.print(totalDiscount);
   }
}