// Class declaration
public class UserInput
{
   // variable initalization
   static char gender;
   static int weight;
   static int height;
   static int age;
   static int activity;
   static String name;
   // setters
   public void setName(String userName)
   {
      name = userName;
   }
   public void setGender(char userGender)
   {
   // Input must be M, m, F, or f. Sets gender
   if(userGender == 'M' || userGender == 'm' || userGender == 'F' || userGender == 'f')
      gender = userGender;
   }
   public void setWeight(int userWeight)
   {
   // if the users weight is more than 0 the program will continue
      if(userWeight >= 0)
      weight = userWeight;
   } 
   public void setHeight(int userHeight)
   {
   // if the users height is more than 0 the program will continue
      if(userHeight >= 0)
      height = userHeight;
   }
   public void setAge(int userAge)
   {
   // if the users age is more than 0 the program will continue
      if(userAge >= 0)
      age = userAge;
   }
   public void setActivity(int userActivity)
   {
   // if the users weight is between 1 and 3 the program will continue
      if(userActivity > 0 && userActivity <= 3)
      activity = userActivity;
   }
   // getters
   public String getName()
   {
      return name;
   }
   public char getGender()
   {
      return gender;
   }
   public int getWeight()
   {
      return weight;
   }
   
   public int getHeight()
   {
      return height;
   }
   public int getAge()
   {
      return age;
   }
   public int getActivity()
   {
      return activity;
   }
}