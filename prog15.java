import java.io.*;
import java.util.*;
class prog15
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
String s;
System.out.println("enter the string");
s=sc.nextLine();
int n=s.length();
char arr[]=new char[n];
for(int i=0;i<n;i++)
{
char ch=s.charAt(i);
arr[i]=ch;
}
FileOutputStream fout=new FileOutputStream("b.txt");
FileInputStream fin=new FileInputStream("b1.txt");
for(int i=0;i<n;i++)
fout.write(arr[i]);
int f;
while((f=fin.read())!=-1)
{
System.out.print((char)f);
}
fout.close();
fin.close();
}
}