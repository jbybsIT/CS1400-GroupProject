public class UserInput
{
   // variable initalization
   String gender;
   double weight;
   int height;
   int age;
   int activity;
   // setters
   public void setGender(String userGender)
   {
      gender = userGender;
   }
   public void setWeight(double userWeight)
   {
      if(userWeight >= 0)
      weight = userWeight;
   } 
   public void setHeight(int userHeight)
   {
      if(userHeight >= 0)
      height = userHeight;
   }
   public void setAge(int userAge)
   {
      if(userAge >= 0)
      age = userAge;
   }
   public void setActivity(int userActivity)
   {
      if(userActivity > 0 || userActivity <= 3)
      activity = userActivity;
   }
   // getters
   public String getGender()
   {
      return gender;
   }
   public double getWeight()
   {
      return weight;
   }
   
   public double getHeight()
   {
      return height;
   }
   public double getAge()
   {
      return age;
   }
   public double getActivity()
   {
      return activity;
   }
}