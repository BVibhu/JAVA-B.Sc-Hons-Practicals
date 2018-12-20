public class prog13{
 
    
    public int sum(int x, int y)
 {
        return (x + y);
    }
 
    
    public double sum(double x, double y, double z)
 { 
         return (x + y + z);
    }
 
    
    public double sum(double x, double y)
 { 
         return (x + y);
    }
     static void Display()
{
     
     System.out.println(" This static method is called without creating the object of its class .");
}

    public static void main(String args[])
 { 
        
        prog13 s = new prog13();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
        Display();
    }
}