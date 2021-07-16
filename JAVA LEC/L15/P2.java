//WAP to read list of marks and find sum,avg,max and min

import java.util.*;
import java.io.*;
class P2
{
public static void main(String args[])
{
Console c=System.console();
ArrayList<Integer> data=new ArrayList();

String ans=c.readLine("do u want to add element yes/no ");
while(ans.equals("yes"))
{
int d=Integer.parseInt(c.readLine("enter the data "));
data.add(d);
ans=c.readLine("do u want to add more elements yes/no ");
}
System.out.println("elements = "+data);

int sum=0;
for(Integer i:data)
sum=sum+i;
double avg=(double)sum/data.size();
Collections.sort(data);
System.out.println("elements = "+data);

int min = data.get(0);
int max = data.get(data.size() - 1);
System.out.println("sum = "+ sum + " avg = " +avg);
System.out.println("min = "+ min + " avg = " +avg);

//System.out.println("elements = "+data);

}
}