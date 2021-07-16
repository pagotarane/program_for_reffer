import java.time.*;
import java.util.*;
import java.io.*;

class R1
{
public static void main(String args[])
{
Console c=System.console();

String lang=c.readLine("Specify ur language : en/fr/ru/de ");
Locale loc=new Locale(lang);
ResourceBundle rb=ResourceBundle.getBundle("w1",loc);
LocalTime t=LocalTime.now();
int h=t.getHour();

String msg="";
if(h>=6 && h<12)
	msg=rb.getString("gm");
else if(h>=12 && h<17)
	msg=rb.getString("ga");
else
	msg=rb.getString("ge");
System.out.println(msg);
}
}