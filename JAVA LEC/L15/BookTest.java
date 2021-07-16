//wap for class Book: bid and bprice

import java.util.*;
import java.io.*;

class Book implements Comparable<Book>
{
int bid;
String bname;

Book(int bid,String bname)		//for initialization
{
this.bid=bid;
this.bname=bname;
}
public String toString()		//meaningfull representaion
{
return bid + " " +bname;
}

public int compareTo(Book b1)
{
return b1.bid-bid;
}
}

class BookTest
{
public static void main(String args[])
{
Console c=System.console();
ArrayList<Book> b=new ArrayList();

while(true)
{
int op=Integer.parseInt(c.readLine("1 add, 2 View,3 sort and 4 exit "));
if(op==1)
{
int bid=Integer.parseInt(c.readLine("enter book id "));
String bname=c.readLine("eneter book name ");
Book book=new Book(bid,bname);
b.add(book);
}else if(op==2)
{
for(Book n:b)
System.out.println(n);
}
else if(op==3)
{
Collections.sort(b);
for(Book n:b)
System.out.println(n);
}
else if(op==4)
{
break;
}
else
{
System.out.println("invalid option");
}
}
}
}