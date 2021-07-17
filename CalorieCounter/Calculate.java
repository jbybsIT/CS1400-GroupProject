public class Calculate
{
   static UserInput dataInput = new UserInput();
   static double BMR;
   static double calorie;
   public void calculateReturn()
   {
      output();
   }
   
   private void output()
   {
      System.out.println("Your daily caloric needs are: " + calorie);
      calculate();  
   }
   
   private void calculate()
   {
      UserInput dataInput = new UserInput();
   if (dataInput.getGender() == 'M')
   {
      maleBMR();
   }
   else
   {
      femaleBMR();
   }
   activity();
   }
   private void maleBMR()
   {
      double BMR = (66 + (6.23 * dataInput.getWeight()) + (12.7 * dataInput.getHeight()) - (6.8 * dataInput.getAge()));
      System.out.println("BMR: " + BMR);
   }      
    
   private void femaleBMR()
   {
         double BMR = (665 + (4.35 * dataInput.getWeight()) + (4.7 * dataInput.getHeight()) - (4.7 * dataInput.getAge()));
         System.out.println("BMR: " + BMR);
   }
   private void activity()
   {
   double calorie;
   if (dataInput.getActivity() == 1)
   {
      calorie = (BMR * 1.2);
   }
   else if (dataInput.getActivity() == 2)
   {
      calorie = (BMR * 1.5);
   }
   else 
   {
      calorie = (BMR * 1.9);
   }

   }
}