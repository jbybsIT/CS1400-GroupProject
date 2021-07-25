/*****************************************
* Author : Jackson Bybee, Javier Rodriguez, Lauren DeLand
* Course : CSIS 1400
* Date : 07/17/2021
* Assignment: Group Project
******************************************/

// Import scanner for user input
import java.util.Scanner;
// Class declaration 
public class App
{  
   // Main method
   public static void main(String[] args)
   {
      // creating constructors to call other classes
      Prompts dataInput = new Prompts();
      Calculate output = new Calculate();
      Data arrays = new Data();
      Scanner input = new Scanner(System.in);
      // initalize variable
      int people;
      // prompt user for how many calculations
      System.out.print("How many people would like to calculate caloric needs for? (Up to 5): ");
      people = input.nextInt();
      // input validation
      if(people >= 1 && people < 11)
      {
      for(int i = 0; i < people; i++)
         {
            // runs for each person passed as people
            System.out.printf("%nEntry for person #%d:%n", i + 1);
            // prompts user with all of the questions and saves them into the program
            dataInput.userInput();
            // sets user name into array
            arrays.setArrayNames(i);
            // sets calculation into array
            arrays.setArrayCalories(i);
            // line break
            System.out.println();   
         }
      // builds table header   
      System.out.printf("%-12s %18s%n", "Name", "Caloric Needs");
      System.out.println("===============================");
      for(int j = 0; j < people; j++)
         { 
            // calls array output tables
            arrays.getOutput(j);
         }
      } 
      else
      {
         // output if user doesn't select in range
         System.out.println("Invalid input.");
      }  
   }  
}