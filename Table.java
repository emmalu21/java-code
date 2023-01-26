/*
 * Author:  Emma Bahr, ebahr2022@fit.edu
 * Course:  CSE 2010, Section 02, Spring 2023
 * Project: Proj 03, Table
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public final class Table {
   public static void main (final String[] args) {

   final int n;
   if (args.length > 0){
   n = Integer.parseInt (args[0]);
   } else {
   n = 10;
   }

   System.out.printf("%9s", "i");
   System.out.printf("%9s", "hex");
   System.out.printf("%9s", "bits");
   System.out.printf("%9s", "log2(i*i)");
   System.out.printf("%9s", "i*i");
   System.out.printf("%9s", "i*i*i"); 
   System.out.printf("%9s%n", "pcnt");

   for(int x = 0; x <=69; x++){
   System.out.print("-");
   }
   System.out.println();
   for (int i = 1; i <=n; i++){
   final int temp; 
   final int bits;
   temp = (int) Math.ceil(Math.log(i) / Math.log(2));
   bits = temp;

   final double column3;
   column3 = Math.log(Math.pow(i, 2))/Math.log(2);

   final int percent;
   percent = (int) Math.round((i * 100.0/n));

   System.out.printf("%,9d  ", i);
   System.out.printf("0X%06X ", i);
   System.out.printf("%9d ", bits);
   System.out.printf("%9.3f ", column3);
   System.out.printf("%,9d ", i*i);
   System.out.printf("%,9d  ", i*i*i);
   System.out.printf("%8d%%%n", percent);
   }

   for(int x = 0; x <=69; x++){
   System.out.print("-");
   }

   System.out.println();
   LocalDate localDate = LocalDate.of(2023,01,17);
   Locale spanishLocale = new Locale("es", "ES");
   String dateInSpanish = localDate.format(DateTimeFormatter.ofPattern
   ("EEEE, d MMMM, yyyy",spanishLocale));
   System.out.printf("%46s %n", dateInSpanish);
   }
}
