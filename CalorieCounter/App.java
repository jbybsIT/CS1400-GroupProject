public class App
{  
   public static void main(String[] args)
   {
      Prompts dataInput = new Prompts();
      Calculate output = new Calculate();
      
      dataInput.userInput();
      output.calculateReturn();
   }  

}