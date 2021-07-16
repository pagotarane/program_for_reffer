//wajp to count occurances of each letter in the given String

import java.io.*;
import java.util.*;

class P3
{
public static void main(String args[])
{

Console c=System.console();

String str=c.readLine("Enter a String ");
String[] data=str.split(" ");
HashMap<String,Integer> hm=new HashMap<>();

for(int i=0;i<data.length;i++)
{
	String st=data[i];
	Integer n=hm.get(st);
	if(n==null)
		hm.put(st,1);
	else
		hm.put(st,n+1);
}
System.out.println(hm);
}
}