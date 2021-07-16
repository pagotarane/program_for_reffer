class WaterBottle
{
private String brand;
public boolean empty;
}
class Q25
{
public static void main(String args[])
{
WaterBottle wb=new WaterBottle();
if(wb.empty)
{
System.out.println("Brand="+wb.brand);
}
}
}