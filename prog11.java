//Implementation of method overloading .
 class prog11 {
 
    
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
 
    
    public static void main(String args[])
 { 
       prog11 s = new prog11();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
        
    }
}