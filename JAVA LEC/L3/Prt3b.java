// wap to find the response for the given rating 
//5 --. Excellent  4,3 --> Ok   2,1   --> Poor

class Prt3b
{
public static void main(String args[])
{
int rating=Integer.parseInt(args[0]);
String response = "";
switch(rating)
{
      case 5 ->   response = "Excellent";
      case 4,3 ->   response = "Ok";
      case 2,1 ->   response = "Poor";
               
      default -> response = "Invalid response";
                
}
System.out.println("Response " + response);
}
}