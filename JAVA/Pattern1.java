import java.io.*;
class Pattern1
{
public static void main(String args[])
{
Console c=System.console();
int n=0;
System.out.println("Enter Number of * ");
n=Integer.parseInt(c.readLine());
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
	{
		System.out.print("*\t");
	}
	System.out.println();
}
}
}
