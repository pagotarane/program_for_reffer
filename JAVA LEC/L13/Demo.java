import myPackage.*;
class Demo
{
public static void main(String args[])
{
String s1=Utility.ssvToCsv("Kamal Classes Thane");
System.out.println(s1);

String s2=Utility.csvToSsv("shekhar,ketan,sanju");
System.out.println(s2);
}
}