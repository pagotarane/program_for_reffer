import static myPackage.Utility.*;
class Demo1
{
public static void main(String args[])
{
String s1=ssvToCsv("Kamal Classes Thane");
System.out.println(s1);

String s2=csvToSsv("shekhar,ketan,sanju");
System.out.println(s2);
}
}