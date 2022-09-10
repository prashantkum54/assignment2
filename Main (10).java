import java.util.Scanner;
public class Main 
{
   public static void main(String []args) 
   {
      char val = 'A';
      System.out.println("Entered Character is "+val);
      if (Character.isUpperCase(val))
      {
         System.out.println(val+ " Character is Uppercase.");
      }
      else 
      {
         System.out.println("Character is in Lowercase.");
      }
   }
}