import java.io.*;
class P1
{
public static void main(String args[])
{
Console c=System.console();

while(true)
{
try
{
int op=Integer.parseInt(c.readLine("1 check and 2 exit"));
if(op==1)
{
int num=Integer.parseInt(c.readLine("Enter an Integer"));
if(num%2==0)
System.out.println("Even");
else

System.out.println("Odd");
}
else if(op==2)
{
break;
}
else
{
System.out.println("Invalid Option");
}
}
catch(Exception e)
{
System.out.println("Invalid Input");
}
}
}//end of main()
}//end of class
