import java.util.*;
import java.io.*;

class P21
{
public static void main(String args[])
{
Console c=System.console();

ArrayList<String> al=new ArrayList<>();
String ans=c.readLine("Do u want to enter elements y/n ");
while(ans.equals("y"))
{
String a=c.readLine("Enter the elements ");
al.add(a);
ans=c.readLine("Do u want to add more elements y/n ");
}
System.out.println("Elements are "+al);




}
}
