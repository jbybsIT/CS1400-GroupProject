// Declare class
public class Calculate
{
   // Declare variables
   static UserInput dataInput = new UserInput();
   static double BMR;
   static double calorie = 1.0;
   // Calculates calories
   public static void calculateCalorie()
   {
      // test gender & calculate BMR
      if(dataInput.getGender() == 'M' || dataInput.getGender() == 'm')
      {
         BMR = (66 + (6.23 * dataInput.getWeight()) + (12.7 * dataInput.getHeight()) - (6.8 * dataInput.getAge()));
      }
      else if(dataInput.getGender() == 'F' || dataInput.getGender() == 'f')
      {
         BMR = (665 + (4.35 * dataInput.getWeight()) + (4.7 * dataInput.getHeight()) - (4.7 * dataInput.getAge()));
      }   
      // test activity level & calculate caloric needs
      if(dataInput.getActivity() == 1)
      {
         calorie = (BMR * 1.2);
      }
      else if(dataInput.getActivity() == 2)
      {
         calorie = (BMR * 1.5);
      }
      else if(dataInput.getActivity() == 3)
      {
         calorie = (BMR * 1.9);
      }
   }
   // Returns calories calulation 
   public double getCalorie()
   {
      return calorie;
   }
}