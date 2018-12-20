import java.util.Scanner;
class prog5
{
   public static void main(String args[])
{
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number:");
      
      int num = scanner.nextInt();
      
      System.out.println("Binary representation of " +num +" =");
    	System.out.println(Integer.toBinaryString(num));
}
}