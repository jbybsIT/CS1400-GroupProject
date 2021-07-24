import java.util.Arrays;

public class Data
{
   App build = new App();
   UserInput dataInput = new UserInput();
   Calculate getCalorie = new Calculate();
  // double[] calories = double[10];
  // String[] names = String[10];
   
  /* public void arrayNames()
   {
      
   }*/
   static String[] names = new String[10];
   static double[] calories = new double[10];
   
  /* public void main(String[] args)
   {
      arrayNames(3);
      
   }*/
   public void setArrayNames(int i)
   {     
        names[i] = dataInput.getName();   
   }
   public void getArrayCalories(int i)
   {
     for(int j = 0; j < i; j++)
     {     
        calories[j] = getCalorie.getCalorie();
     }
   
   }
   public void getOutput(int i)
   {
      System.out.printf("%-2s %5s", names[i], calories[i]);
      System.out.println();
      //System.out.println(names[i]);
   }
}