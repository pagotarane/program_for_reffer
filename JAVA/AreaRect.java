class Rectangle
{
private int lenght;
private int width;
public void setData(int l,int w)
{
lenght=l; 
width=w;
}

public int areaRect()
{
int area;
area=lenght*width;
return area;
}
}
class AreaRect
{
public static void main(String args[])
{
int a1;
Rectangle r=new Rectangle();
r.setData(2,2);
a1=r.areaRect();
System.out.println(a1);
}
}
