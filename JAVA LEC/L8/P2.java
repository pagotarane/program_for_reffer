//Palindrome

import java.io.*;
class P2
{
public static void main(String args[])
{
Console c=System.console();

String str=c.readLine("Enter a string of characters ");
StringBuffer sb=new StringBuffer(str);

sb.reverse();
if(str.equals(sb.toString()))
System.out.println("String is palindrome ");
else
System.out.println("String is not palindrome ");
}
}