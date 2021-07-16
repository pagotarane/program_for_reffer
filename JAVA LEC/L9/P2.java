import java.io.*;
import java.util.*;
class P2
{
public static void main(String args[])
{
Console c=System.console();

String str=c.readLine("Enter a String ");
String nstr="";
StringBuffer sb= new StringBuffer();
Scanner scan=new Scanner(str);
scan.useDelimiter(" ");
while(scan.hasNext())
{
String s1=scan.next();
nstr=s1+" "+nstr;
sb.insert(0,s1+ " ");
}
System.out.println(str + "==> " + nstr + "--->" +sb);
}
}
