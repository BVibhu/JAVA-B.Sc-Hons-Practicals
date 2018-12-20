class ABC
{  
   public double num = 100;
   public  int square(int a)
   {
	return a*a;
   }
}
class ABC2
{  
   public final double num = 100;
}  
public class prog12
{
   public static void main(String args[])
   {  
	ABC obj = new ABC();  
	System.out.println(obj.num); 
	System.out.println(obj.square(10));
        ABC2 obj2 = new ABC2();  
        //obj2.num=100;
   }  
}
