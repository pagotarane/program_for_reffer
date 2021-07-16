import java.io.*;
class Fact
{
public static void main(String args[])
{
Console c=System.console();

int i,n,fact=1;
System.out.println("Enter the no ");
n=Integer.parseInt(c.readLine());

for(i=1;i<=n;i++)
fact=fact*i;
System.out.println(fact);
}
}