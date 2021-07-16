class P4
{
public static void main(String args[])
{
String input="a,2,b,4,c,3";
String data[]=input.split(",");

for(int i=0;i<data.length;i=i+2)
{
String what= data[i] ;
int how=Integer.parseInt(data[i+1]);
int c=1;
while(c<=how)
{
System.out.print(what +"\t");
c++;
}
System.out.println();

}
}
}