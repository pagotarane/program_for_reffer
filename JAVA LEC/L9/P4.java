import java.io.*;
import java.util.*;
class P4
{
public static void main(String args[])
{
Console c=System.console();

String str=c.readLine("Enter a String ");
String nstr="";

Scanner scan=new Scanner(str);
scan.useDelimiter(" ");
while(scan.hasNext())
{
String s1=scan.next();
s1=new String(""+s1.charAt(0)).toUpperCase() + s1.substring(1)+"";
nstr=nstr+" "+s1;
}
System.out.println(str + "==> " + nstr);
}
}
