/*****************************************
* Author : Jackson Bybee, Javier Rodriguez, Lauren DeLand
* Course : CSIS 1400
* Date : 07/17/2021
* Assignment: Group Project
******************************************/
import java.util.Scanner;

public class App
{  
   public static void main(String[] args)
   {
      Prompts dataInput = new Prompts();
      Calculate output = new Calculate();
      Data arrays = new Data();
      Scanner input = new Scanner(System.in);
      
      int people = 0;
      
      System.out.print("How many people would like to calculate caloric needs for? (Up to 10): ");
      people = input.nextInt();
      
      for(int i = 0; i < people; i++)
      {
         System.out.printf("%nEntry for person #%d:%n", i + 1);
         dataInput.userInput();
         arrays.setArrayNames(i);
         System.out.println();   
      }
      
      output.output();
      
      
      System.out.printf("%-2s   %5s%n", "Name", "Caloric Needs");
      System.out.println("==================");
      for(int j = 0; j < people; j++)
      {
         arrays.getOutput(j);
         // output calorie
         //arrays.namesOutput();
      }
   }  

}