import java.util.Scanner;

public class Prompts
{
   static Scanner input = new Scanner(System.in);
   static int selection;
   
   public static void userInput()
   {
      UserInput userData = new UserInput();
      Scanner input = new Scanner(System.in);
      
      System.out.print("What is your name?: ");
      String userName = input.nextLine();
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
      
      // sends input to userInput class to be calculated
      userData.setName(userName);
      userData.setGender(userGender);
      userData.setWeight(userWeight);
      userData.setHeight(userHeight);
      userData.setAge(userAge);
      userData.setActivity(selection);
      
      // output 
     // System.out.println(
      
   }
   
   private static void activitySelection()
   {
      menuPrompt(); // call menuPrompt method
      selection = input.nextInt(); // user prompt saved as selection variable
   }
   
   private static void menuPrompt() // creates menuPrompt method
	{
	   System.out.println("1 .. sedentary"); // output 1st line
		System.out.println("2 .. moderate"); // output 2nd line
		System.out.println("3 .. intense"); // output 3rd line
		System.out.print("Your choice: "); // user input line
	} 

}