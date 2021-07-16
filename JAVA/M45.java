class M45
dcc{
public static void main(String args[])
{

int iVar=100;
float fVar=100.100f;
double dVar=123;

iVar=(int)fVar;
System.out.println(iVar);

fVar=iVar;
System.out.println(fVar);

dVar=fVar;
System.out.println(dVar);

fVar=(float)dVar;
System.out.println(fVar);

dVar=iVar;
System.out.println(dVar);

iVar=(int)dVar;
System.out.println(iVar);
}
}