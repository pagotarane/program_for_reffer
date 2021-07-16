import java.util.*;

class P1
{
public static void main(String args[])
{
HashSet <String> android=new HashSet<>();
android.add("amit");
android.add("sumit");
android.add("anil");
android.add("ramesh");

HashSet <String> python=new HashSet<>();
python.add("amit");
python.add("ajit");
python.add("ravi");

HashSet <String> total=new HashSet<>();
for(String s:android)
	total.add(s);
for(String s:python)
	total.add(s);
for(String s:total)
System.out.print(s+" ");
System.out.println();

//for common
HashSet <String> common=new HashSet<>();
for(String s:android)
if(python.contains(s))
common.add(s);
for(String s:common)
System.out.print(s+" ");
System.out.println();

//for Difference
HashSet <String> diff=new HashSet<>();
for(String s:android)
if(! python.contains(s))
diff.add(s);
for(String s:diff)
System.out.print(s+" ");
System.out.println();
}
}