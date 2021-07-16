package myPackage;
public class Utility
{
public static String ssvToCsv(String str)
{
String [] data = str.split(" ");
String ndata = String.join(",",data);
return ndata;
}

public static String csvToSsv(String str)
{
String [] data = str.split(",");
String ndata = String.join(" ",data);
return ndata;
}
}