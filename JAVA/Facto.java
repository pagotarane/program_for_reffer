import java.io.*;	
class Facto
{
public static void main(String args[]) throws IOException
{
//Console c=System.console();
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i,n,fact=1;
System.out.println("Enter the no");
n=(int)br.read();
for(i=1;i<=n;i++)
fact=fact*i;
System.out.println(fact);
}
}


