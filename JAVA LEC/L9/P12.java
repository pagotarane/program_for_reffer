//wap to count the no of words in given string
import java.io.*;
import java.util.*;
class P12
{
public static void main(String args[])
{
Console c=System.console();

String str=c.readLine("Enter a String ");
Scanner scan=new Scanner(str);
scan.useDelimiter(" ");
int now=0;
while(scan.hasNext())
{
now++;
scan.next();
}
System.out.println("No of words " +now);
}
}