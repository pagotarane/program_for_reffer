//WAJP to perform for 

import java.io.*;
class Calci
{
public static void main(String args[])
{
Console c=System.console();
String str=c.readLine("Enter the equation ");
String data[]=str.split(" ");

if(data.length<3)
{
throw new RuntimeException("wrong equation");
}
else
{
try
{
int n1=Integer.parseInt(data[0]);
int n2=Integer.parseInt(data[2]);
String op=data[1];
double res=0.0;
switch(op)
{
case "plus":	res=n1+n2;
		System.out.println("addition= "+res);
		break;
case "minus":	res=n1-n2;
		System.out.println("Substraction= "+res);
		break;
case "mul":	res=n1*n2;
		System.out.println("multiplication= "+res);
		break;
case "div":	if(n2==0)
		throw new RuntimeException("2nd no 0");
		else
		{
		res=(n1*1.0)/n2;
		System.out.println("Division= "+res);
		break;
default:throw new RuntimeException("invalid operation");
}
}
catch(NumberFormatException nfe)
{
System.out.println("integers only");
}
}
}
}

