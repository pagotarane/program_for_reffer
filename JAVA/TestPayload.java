class Payload
{
private int weight;
public Payload(int w)
{
weight=w;
}
public void setWeight(int w)
{
weight=w;
}
public int getWeight()
{
return weight;
}
public class TestPayload
{
static void changePayload(Payload p);
//p.setWeight(420);
//p.changePayload(420);
//p=new Payload(420);
//Payload.setWeight(420);
p=Payload.setWeight(420);


public static void main(String args[])
{
Payload p=new Payload(200);
p.setWeight(1024);
changePayload(p);
System.out.println("p is"+p.getWeight());
}
}
}

