//WAP to find the sum of user input numbers using command line argument.
class prog1
 {
public static void main( String args[] )
 {
int num=0;
for(int i=0; i<args.length; i++){
   num+= Integer.parseInt(args[i]);
}

  System.out.println("The sum is " + num);
   }
}