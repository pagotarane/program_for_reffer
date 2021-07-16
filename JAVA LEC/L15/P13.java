import java.util.*;

class P13
{
public static void main(String args[])
{
LinkedList<String> al=new LinkedList<String>();

al.add("ketan");
al.add("harshu");
al.addFirst("sarvesh");
al.addLast("prasad");
al.remove(2);

System.out.println("LinkedList: "+al);
}
}
