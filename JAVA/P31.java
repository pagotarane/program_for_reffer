import java.io.*;
import java.util.*;

class P31
{
public static void main(String args[])
{
Console c=System.console();
ArrayList<Integer> al=new ArrayList<>();

String ans=c.readLine("y/n ");
while(ans.equals("y"))
{
int d=Integer.parseInt(c.readLine("Enter Elements "));
al.add(d);
ans=c.readLine("y/n");
}
System.out.println("Elements are "+al);

}
}