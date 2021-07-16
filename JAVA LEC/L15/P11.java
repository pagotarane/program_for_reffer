import java.util.*;
import java.io.*;

class P11
{
public static void main(String args[])
{
Console c=System.console();
ArrayList<String> s=new ArrayList();

String ans=c.readLine("do u want to add element y/n: ");
while(ans.equals("y"))
{
String d=c.readLine("enter data: ");
s.add(d);
ans=c.readLine("do u want to add more elements y/n ");
}
System.out.println("elements = "+s);
Collections.sort(s);

System.out.println("elements = "+s);
}
}
