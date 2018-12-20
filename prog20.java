// this is a user define exception class etend by Exception class
class MyException extends Exception
     {
      public MyException(int i)
        {
        System.out.println("you entered " +i +" It exceeds  the limit");
        }

      }

public class prog20
    {
    public void show(int i) throws MyException
          {
       if(i>100)
         throw new MyException(i);
       else
         System.out.println(+i+" is less then 100 it is ok");
          }

   public static void main(String []args)
        {
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        prog20 t=new prog20();
            try{
                t.show(i);
                t.show(j);
                }
                catch(Throwable e)
                        {
                System.out.println("catched exception is"+e);
                        } 
        } 
}