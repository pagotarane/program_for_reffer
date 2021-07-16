import java.io.*;
import java.util.*;
class Rev
{
public static void main(String args[])
{
Console c=System.console();

String str=c.readLine("Enter a String ");
String nstr="";
//StringBuffer sb= new StringBuffer();
Scanner scan=new Scanner(str);
scan.useDelimiter(" ");
while(scan.hasNext())
{
String s1=scan.next();
s1=new StringBuffer(s1).reverse().toString();
nstr=nstr+" "+s1;
//sb.insert(0,s1+ " ");
}
System.out.println(str + "==> " + nstr);
}
}
