//Implementation of string functions .
class prog8
{
public static void main(String args[])
{ 
System.out.println(" Implementation of StringBufferClass functions ");

System.out.println(" APPEND FUNCTION ");
 
StringBuffer sb=new StringBuffer("Hello");  
sb.append("Java");  
System.out.println(sb);

System.out.println(" INSERT FUNCTION ");

StringBuffer sb1=new StringBuffer("Hello ");  
sb1.insert(1,"Java"); 
System.out.println(sb1);

System.out.println(" SET LENGTH FUNCTION ");

StringBuffer sb2 = new StringBuffer("StringBuffer setLength method example");
sb2.setLength(12);
System.out.println(sb2); 

System.out.println(" EQUAL FUNCTION ");

String s1 = "GFG";
String s2 = "GFG"; 
System.out.println(s1.equals(s2));

System.out.println(" CHAR AT & SET CHAR AT FUNCTION ");

StringBuffer sb3 = new StringBuffer("AMIT");
System.out.println(sb3);      
System.out.println("character at index 3 = " + sb3.charAt(3));      
sb3.setCharAt(3, 'L');
System.out.println("After Set, buffer = " + sb3); 
}  
}