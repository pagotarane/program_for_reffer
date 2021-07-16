import java.io.*;
import java.util.*;

class P4
{
public static void main(String args[])
{
Console c=System.console();
ArrayDeque<Integer> stack=new ArrayDeque<>();
int dec=Integer.parseInt(c.readLine("enter decimal number "));

while(dec>1)
{
int rem=dec%2;
stack.push(rem);
dec=dec/2;
}
String bin="1";
while(!stack.isEmpty())
{
bin=bin+stack.pop();
}
System.out.println(bin);
}
}
