import java.util.*;

class P1234
{
public static void main(String args[])
{
HashSet<String> android=new HashSet<>();
android.add("Ketan");
android.add("Harshu");
android.add("Prasad");

HashSet<String> python=new HashSet<>();
python.add("Ketan");
python.add("Sarvesh");
python.add("Mansi");


HashSet<String> total=new HashSet<>();
for(String s:android)
	total.add(s);
for(String s:python)
	total.add(s);
for(String s:total)
System.out.print(s+" ");
System.out.println();

HashSet<String> comm=new HashSet<>();
for(String s:android)
if(python.contains(s))
	comm.add(s);
System.out.println(comm);
System.out.println();

}
}