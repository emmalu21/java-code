/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 12

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/18/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class RoachFun {
    public static void main (String [] args) {

        Scanner readroach = new Scanner(System.in);

         double Growth_Rate;
         System.out.print("What is the growth rate of the roach: ");
         Growth_Rate = readroach.nextDouble();

         double One_Bug_Volume;
         System.out.print("What is the size of the roach: ");
         One_Bug_Volume = readroach.nextDouble();

        double HouseVolume;
        System.out.print("Enter the total house volume (cubic feet): ");
        HouseVolume = readroach.nextDouble();

        double population;
        System.out.print("Enter the initial number of roaches: ");
        population = readroach.nextDouble();

        double totalBugVolume;
        

        System.out.println();
        System.out.println("House volume: " + HouseVolume + " cubic feet");
        System.out.println("Initial population: " + population);
        System.out.println();

        totalBugVolume = population * One_Bug_Volume;

        while (totalBugVolume < HouseVolume) 
        {
            total = population + (Growth_Rate * population);
            totalBugVolume = population * One_Bug_Volume;

        }

        while (totalBugVolume < HouseVolume) 
        {
            population = population + (Growth_Rate * population);
            totalBugVolume = population * One_Bug_Volume;
            CountWeeks = CountWeeks + 1;

            System.out.println("The current population after " + CountWeeks " weeks is " + population);
            System.out.println("The current bug volume is :" + totalBugVolume+ " and the current population is " + population);
            System.out.println("-------------------------------------------------------------------------------------------------");

        }

        System.out.println("There will be " + population + " roaches.");
        System.out.println("They will fill " + totalBugVolume + " cubic feet.");


        
    }
}