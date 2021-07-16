import java.io.*;
import java.util.*;

class Hs
{
public static void main(String args[])
{
Console c=System.console();
LinkedHashSet<Integer> hs=new LinkedHashSet<>();

String ans=c.readLine("y/n ");
while(ans.equals("y"))
{
int d=Integer.parseInt(c.readLine("Enter Elements "));
hs.add(d);
ans=c.readLine("y/n");
}
System.out.println("Elements are "+hs);

int sum=0;
for(Integer i:hs)
sum=sum+i;
System.out.println("SUM "+sum);

//Collections.sort(hs);
//int min=hs.get(0);
//int max=hs.get(hs.size() -1);

//System.out.println("MIN "+min);
}
}