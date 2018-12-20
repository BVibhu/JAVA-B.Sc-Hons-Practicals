import java.lang.*;
class conversion
{
double inch;
double foot;
conversion (int a)
{
inch=a;
}
public int convert()
{
return ((int )(12*inch));
}
}
class prog10
{
public static void main ( String []ar)
{
conversion con=new conversion (56);
int conve=con.convert();
System.out.print("feet"+conve);
}}

