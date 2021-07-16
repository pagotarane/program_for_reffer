import java.io.*;
import java.util.*;

class P12
{
public static void main(String args[])
{
Console c=System.console();
ArrayList<Integer> data=new ArrayList();

data.add(1);
data.add(4);
data.add(3);
data.add(6);
data.add(5);

System.out.println("elements "+data);
Collections.sort(data);
System.out.println("elements "+data);

data.remove(new Integer (3));
System.out.println("elements "+data);
}
}
