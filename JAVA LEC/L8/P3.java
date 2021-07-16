//Palindrome

import java.io.*;
import java.util.*;
class P3
{
public static String mysort(String r)
{
char ch[]=r.toCharArray();
Arrays.sort(ch);
String s=new String(ch);
return s;
}
public static void main(String args[])
{
Console c=System.console();

String s1=c.readLine("Enter 1st string: ");
String s2=c.readLine("Enter 2nd String: ");
System.out.println(s1+ " " +s2);
s1=mysort(s1);
s2=mysort(s2);

if(s1.equals(s2.toString()))
System.out.println("String is Anagram") ;
else
System.out.println("String is not Anagram ");
}
}