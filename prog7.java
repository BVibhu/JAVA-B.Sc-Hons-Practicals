import java.util.*;
class prog7
 {
public static void main( String args[] )
 {
	int x=0,sum=0;
	for(int i=0;i<args.length;i++)
	{
    		  x=Integer.parseInt(args[i]);
	 	 

	}

	System.out.println("Your array :");

        for(int i=0;i<args.length;i++)
	{ 

            System.out.println(args[i]);
 	}
	System.out.println(" Your sum :");
	for(int i=0 ;i<args.length;i++)
	{
 		sum = sum + (Integer.parseInt(args[i]));
	}
	System.out.println(sum);

    

}
}