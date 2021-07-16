import java.io.*;
import java.time.*;
import java.time.format.*;

class AgeCalculator
{
public static void main(String args[])
{
Console c=System.console();

try
{
String d=c.readLine("enter date of birth dd/MM/yyyy ");
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate dob=LocalDate.parse(d, dtf);
LocalDate today=LocalDate.now();
Period p=Period.between(dob,today);
System.out.println(p);
System.out.println(p.getYears()+ " " p.getMonths()+ " " + p.getDays() );
}
catch(DateTimeParseException e)
{
System.out.println("Incorrect Date " +e);
}
}
}