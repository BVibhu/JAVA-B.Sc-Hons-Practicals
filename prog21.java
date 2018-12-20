import java.io.*;
import java.util.*;
import java.lang.*;
class Thread1 extends Thread
{
public void run()
{

}}
class Thread2 extends Thread
{
public void run()
{
}}
class Thread3 extends Thread
{
public void run()
{
//for(int I=0;I<10;I++)
}}
class prog21
{
public static void main (String []ar)
{
Thread1 Th1=new Thread1();
Thread2 Th2=new Thread2();
Thread3 Th3=new Thread3();
Th1.setPriority(1);
Th2.setPriority(2);
Th3.setPriority(4);
System.out.println(Th1.getPriority());
System.out.println(Th2.getPriority());
System.out.println(Th3.getPriority());
System.out.println(Th1.getId());
System.out.println(Th2.getId());
System.out.println(Th3.getId());
Th1.start();
Th2.start();
Th3.start();
}
}