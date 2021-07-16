//wajp to create a file whose name is supplied by the user

import java.io.*;

class P1
{
public static void main(String args[])
{
Console c=System.console();
String fileName=c.readLine("enter file name to create ");
File f=new File(fileName);

if (f.exists()) {
	System.out.println(fileName + "already exist ");
}
else{
	try{
	f.createNewFile();
	System.out.println(fileName + "created ");
	}catch(IOException e) {
		System.out.println("issue " + e);
}
}
}
}