//WAP to find factorial of user input number.
import java.util.Scanner;
class prog2
{
   public static void main(String args[])
{
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number:");
      
      int num = scanner.nextInt();
      
      long fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
}
}