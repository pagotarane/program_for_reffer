import java.io.*;

class Add
{
public static void main(String args[])
{
Console c=System.console();

int x=Integer.parseInt(c.readLine("Enter 1st No. "));
int y=Integer.parseInt(c.readLine("Enter 2nd No. "));

while(y!=0)
{
int carry=x & y;
x=x^y;
y=carry<<1;
}
System.out.println("Sum "+x);
System.out.print("\n");
}
}