import java.util.*;

class P123
{
public static void main(String args[])
{
HashSet<String> android=new HashSet<>();
android.add("ketan");
android.add("prasad");
android.add("sarvesh");
android.add("mansi");
System.out.println(android);

HashSet<String> python=new HashSet<>();
python.add("gauravi");
python.add("ketan");
python.add("harshu");
python.add("mansi");
System.out.println(python);

HashSet<String> total=new HashSet<>();
for(String s:android)
	total.add(s);
for(String s:python)
	total.add(s);
for(String s:total)
System.out.println(s);
System.out.println();

HashSet<String> comm=new HashSet<>();
for(String s:android)
if(python.contains(s))
	comm.add(s);
for(String s:comm)
System.out.println(s+" ");
System.out.println();

HashSet<String> diff=new HashSet<>();
for(String s:android)
if(!python.contains(s))
	diff.add(s);
for(String s:diff)
System.out.println(s+" ");
System.out.println();
}
}
