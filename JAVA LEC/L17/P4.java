//wajp 

//wajp to read data from file...

import java.io.*;

class P4
{
public static void main(String args[]) throws IOException
{
Console c=System.console();
String fileName=c.readLine("enter file name to create ");
File f=new File(fileName);
FileReader fw=new FileReader(f);
BufferedReader br=new BufferedReader(fw);

String line=br.readLine();
while(line !=null)
{
System.out.println(line);
line=br.readLine();
}
br.close();
}
}