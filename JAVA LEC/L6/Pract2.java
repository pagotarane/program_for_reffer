//wap to read username and password from the user.

import java.io.*;

class Pract2
{
public static void main(String args[])throws IOException
{
String un,pw;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

System.out.println("Enter useranme");
un=br.readLine();
System.out.println("Enter Password");
pw=br.readLine();

if (( un.equals("Antman")) && (pw.equals("Batman"))
      System.out.println("Welcome");
else
	System.out.println("Try Again");

}
}