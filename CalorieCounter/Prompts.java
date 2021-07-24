
//Import Scanner
import java.util.Scanner;

//Class Declaration
public class Prompts
{
   //Converts user entries into variables
   static Scanner input = new Scanner(System.in);
   static int selection;
   
   //Prompt Method
   public static void userInput()
   {
      //Convert inputs
      UserInput userData = new UserInput();
      Scanner input = new Scanner(System.in);
      
      //Prompt Series
      System.out.print("What is your name?: ");
      String name = input.nextLine();
      System.out.print("What is your gender? (M or F): ");
      char userGender = input.next().charAt(0);
      System.out.printf("What is your weight in lbs?: ");
      double userWeight = input.nextInt();
      System.out.printf("What is your height in inches?: ");
      int userHeight = input.nextInt();
      System.out.printf("What is your age?: ");
      int userAge = input.nextInt();
      System.out.printf("What is your activity level?: %n");
      activitySelection();
      
      //Sends input to userInput class to be calculated
      userData.setGender(userGender);
      userData.setWeight(userWeight);
      userData.setHeight(userHeight);
      userData.setAge(userAge);
      userData.setActivity(selection);
      
      
   }
   
   //Activity Selection
   private static void activitySelection()
   {
      menuPrompt(); //Call menuPrompt method
      selection = input.nextInt(); //User prompt saved as selection variable
   }
   
   //Creates menuPrompt method
   private static void menuPrompt() 
	{
	   System.out.println("1 .. sedentary"); //Output 1st line
		System.out.println("2 .. moderate"); //Output 2nd line
		System.out.println("3 .. intense"); //Output 3rd line
		System.out.print("Your choice: "); //User input line
	} 

}
