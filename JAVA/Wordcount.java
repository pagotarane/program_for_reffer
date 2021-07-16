import java.io.*;
class Wordcount
{
public static void main(String args[])
{
Console c=System.console();
String s=c.readLine("Enter String ");
String[] values=s.split(" ");
System.out.println(values.length);
}
}