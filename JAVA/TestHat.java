class Hat {
public String name="hat";
public int ID=0;
public String size="one size fit all";
public String color="";
public String getName()
{ 
return name;
}
public void setName(String name)
{
this.name=name;
}

}
class TestHat{
public static void main(String args[])
{
Hat blackCowboyHat=new Hat();
blackCowboyHat.setName("CowBoy");
System.out.println(blackCowboyHat);

}}