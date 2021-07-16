//wap to count the no of words in given string
import java.io.*;
class P1
{
public static void main(String args[])
{
Console c=System.console();
String s=c.readLine("Enter String ");
String[] values=s.split(" ");
System.out.println(values.length);
}
}