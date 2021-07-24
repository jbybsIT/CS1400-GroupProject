/*****************************************
* Author : Jackson Bybee, Javier Rodriguez, Lauren DeLand
* Course : CSIS 1400
* Date : 07/17/2021
* Assignment: Group Project
******************************************/
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