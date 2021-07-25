import java.util.*;

public class Equations

{
   if (gender == 'M')
   {
      public static double maleBMR(double getWeight, int getHeight, int getAge)
      {
         double BMR = (66 + (6.23 * getWeight) + (12.7 * getHeight) - (6.8 * getAge));
         return BMR;
      }
   }       
     
   else 
   {
      public static double femaleBMR(double getWeight, int getHeight, int getAge)
      {
         double BMR = (665 + (4.35 * getWeight) + (4.7 * getHeight) - (4.7 * getAge));
         return BMR;
      }
   }
   if (getActivity == 1)
   {
      calorie = (BMR * 1.2)
   }
   else if (getActivity == 2)
   {
      calorie = (BMR * 1.5)
   }
   else 
   {
      calorie = (BMR * 1.9);
   }
}