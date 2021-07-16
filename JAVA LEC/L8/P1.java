//wajp to read StringBuffer from user and count the number of uppercase and Lowercase letters

import java.io.*;
class P1
{
public static void main(String args[])
{
Console c=System.console();

String str=c.readLine("Enter a string of characters ");
StringBuffer sb=new StringBuffer(str);
int uc=0,lc=0;

for(int i=0;i<sb.length();i++)
{
char ch=sb.charAt(i);
if(Character.isUpperCase(ch)) uc++;
else if(Character.isLowerCase(ch)) lc++;
}
System.out.println("upper case" + uc +" lower case" +lc);

}
}