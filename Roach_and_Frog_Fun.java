/**********************************************************************

 * @By: Emma Bahr

 * @Lab: 12

 * @CSE 1001 Fund Software, Fall 2022

 * @Date: 10/18/2022

 * @Description: 

 *********************************************************************/

import java.util.Scanner;
public class Roach_and_Frog_Fun {
    public static void main (String[] args) {

        Scanner readroach = new Scanner(System.in);

        double HouseVolume;
        System.out.print("Enter the total house volume (cubic feet): ");
        HouseVolume = readroach.nextDouble();

        double One_Bug_Volume;
        System.out.print("What is the size of the roach: ");
        One_Bug_Volume = readroach.nextDouble();

        double One_Frog_Volume;
        System.out.print("What is the size of the frog: ");
        One_Frog_Volume = readroach.nextDouble();

        double population;
        System.out.print("Enter the initial number of roaches: ");
        population = readroach.nextDouble();

        double frog_population;
        System.out.print("Enter the initial number of frogs: ");
        frog_population = readroach.nextDouble();

        double Growth_Rate;
        System.out.print("What is the growth rate of the roach: ");
        Growth_Rate = readroach.nextDouble();

        double reproduction;
        System.out.print("What is the growth rate of the frog: ");
        reproduction = readroach.nextDouble();

        double totalBugVolume;
        double totalFrogVolume;
        double totalRoachVolume = 0;

        double food;
        System.out.print("How many roaches can an individual frog eat per week: ");
        food = readroach.nextDouble();
        

        System.out.println();
        System.out.println("House volume: " + HouseVolume + " cubic feet");
        System.out.println("The size of the roaches are: " + One_Bug_Volume);
        System.out.println("The size of the frogs are: " + One_Frog_Volume);
        System.out.println("The roaches growth rate is: " + Growth_Rate);
        System.out.println("The frogs growth rate is: " + reproduction);
        System.out.println("The initial population of the roaches is: " + population);
        System.out.println("The initial population of the frogs is: " + frog_population);
        System.out.println();


        int countWeeks = 0;
        totalBugVolume = population * One_Bug_Volume;

        while (totalBugVolume < HouseVolume)
        {
            population = (Growth_Rate * population) + population;
            totalRoachVolume = population * One_Bug_Volume;
            population = population - (food * frog_population);

            if (population <= 0)
            {
                population = 0;
                totalRoachVolume = 0;
            }

            frog_population = (reproduction * frog_population) + frog_population;
            totalFrogVolume = frog_population * One_Frog_Volume;
            totalBugVolume = totalFrogVolume + totalRoachVolume;

            System.out.println("After " + countWeeks + " weeks there are: " +(int)population + " roaches, and " + (int)frog_population + " frogs.");
            System.out.println();
            System.out.println("After " + countWeeks + " weeks roaches take up " + totalRoachVolume + " cubic feet, and frogs take up " + totalFrogVolume + " cubic feet.");
            System.out.println();
            System.out.println("Together they take up " + totalBugVolume + " cubic feet.");
            countWeeks= countWeeks + 1;
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

        }


        System.out.println();
        System.out.println();
        System.out.println("The house will be filled in " + countWeeks + " weeks.");
        System.out.println("There will be " + (int)population + " roaches.");
        System.out.println("There will be " + (int)frog_population + " frogs.");
        System.out.println("They will fill " + totalBugVolume + " cubic feet.");






        
    }
}