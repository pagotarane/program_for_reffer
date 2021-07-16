//wajp 

//wajp to create a file whose name is supplied by the user

import java.io.*;

class P3
{
public static void main(String args[])
{
Console c=System.console();
String fileName=c.readLine("enter file name to create ");
File f=new File(fileName);
FileWriter fw=new FileWriter(f,true);
String data=c.readLine("enter data to write...press q for quite ");
while(! data.equals("q"))
{
fw.write(data+"\n");
data=c.readLine();
}
fw.close();
}
}