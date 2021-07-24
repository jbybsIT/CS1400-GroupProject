public class Calculate
{
   static UserInput dataInput = new UserInput();
   static double BMR;
   static double calorie = 0.0;
   
   public void calculateReturn()
   {
      output();
   }
   
   public void calculate()
   {
      if (dataInput.getGender() == 'M' || dataInput.getGender() == 'm')
      {
         maleBMR();
      }
      else if (dataInput.getGender() == 'F' || dataInput.getGender() == 'f')
      {
         femaleBMR();
      }
   activity();
   }
   public static void maleBMR()
   {
      BMR = (66 + (6.23 * dataInput.getWeight()) + (12.7 * dataInput.getHeight()) - (6.8 * dataInput.getAge()));
      // comment out for BMR 
      // System.out.printf("Your BMR: %.0f%n", BMR);
   }      
    
   public static void femaleBMR()
   {
         BMR = (665 + (4.35 * dataInput.getWeight()) + (4.7 * dataInput.getHeight()) - (4.7 * dataInput.getAge()));
         // comment out for BMR 
         // System.out.printf("Your BMR: %.0f%n", BMR);
   }
   public void activity()
   {      
      if (dataInput.getActivity() == 1)
         {
            calorie = (BMR * 1.2);
         }
      else if (dataInput.getActivity() == 2)
         {
            calorie = (BMR * 1.5);
         }
      else if (dataInput.getActivity() == 3)
         {
            calorie = (BMR * 1.9);
         }
   }
   
   public void output()
   {
     calculate();  
     System.out.printf("%n%nYour daily caloric needs are: %.0f%n", calorie);
   }
   
   public double getCalorie()
   {
      return calorie;
   }
}