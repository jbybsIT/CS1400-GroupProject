// Import java arrays
import java.util.Arrays;
// Class declaration
public class Data
{
   // Initialize constructors
   UserInput dataInput = new UserInput();
   Calculate getCalorie = new Calculate();
   // build arrays
   static String[] names = new String[5];
   static double[] calories = new double[5];
   // Set name array based on names passed in userInput
   public void setArrayNames(int i)
   {     
      names[i] = dataInput.getName();   
   }
   // set caloric array based on calculated in calculate
   public void setArrayCalories(int i)
   {
     getCalorie.calculateCalorie(); // ensures calorie is calculated
     calories[i] = getCalorie.getCalorie();
   
   }
   // Output getter
   public void getOutput(int i)
   {
      // format decimal
      String str = String.format("%.0f", calories[i]);
      System.out.printf("%-12s %15s", names[i], str);
      System.out.println();
   }
}