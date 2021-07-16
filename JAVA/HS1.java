import java.util.*;

class HS1
{
public static void main(String args[])
{
HashSet<String> android=new HashSet<>();
android.add("Ketan");
android.add("Pranit");
android.add("Sagar");
android.add("Saurabh");

HashSet<String> python=new HashSet<>();
python.add("Ketan");
python.add("Omakr");
python.add("Sumeet");

HashSet<String> total=new HashSet<>();
for(String s:android)
	total.add(s);
for(String s:python)
	total.add(s);
//for(String s:total)
System.out.println("TOTAL "+total);

HashSet<String> comm=new HashSet<>();

for(String s:android)
if(python.contains(s))
	comm.add(s);
System.out.println("Comm "+comm);

HashSet<String> diff=new HashSet<>();
for(String s:android)
if(!python.contains(s))
	diff.add(s);
System.out.println("DIFF "+diff);











}
}