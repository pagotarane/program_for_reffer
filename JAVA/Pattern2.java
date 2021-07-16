import java.io.*;
class Pattern2
{
public static void main(String args[])
{
Console c=System.console();
int n=1;
System.out.println("Enter no");
n=Integer.parseInt(c.readLine());
for(int i=n;i>=1;i-=1)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}