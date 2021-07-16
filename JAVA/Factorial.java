import java.io.*;
class Factorial
{
public static void main(String args[])
{
int fact=1;
Console c=System.console();
int n=Integer.parseInt(c.readLine("Enter the Number : "));
for(int i=1;i<=n;i++)

fact=fact*i;
{
System.out.println("Factorial= "+fact);
}
}
}