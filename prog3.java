//WAP to print an user input array .
import java.util.*;
  class prog3
 {

    public static void main(String[] args)
 {

        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++)
{            arr[i]=s.nextInt();

        }
 System.out.println("Your array :");

        for(int i: arr)
{ 

            System.out.println(i);

        }


    }
}