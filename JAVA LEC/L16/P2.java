//wajp to count occurances of each letter in the given String

import java.io.*;
import java.util.*;

class P2
{
public static void main(String args[])
{

Console c=System.console();
HashMap<Character,Integer> hm=new HashMap<>();

String str=c.readLine("Enter a String ");
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	Integer n=hm.get(ch);
	if(n==null)
		hm.put(ch,1);
	else
		hm.put(ch,n+1);
}
System.out.println(hm);
}
}