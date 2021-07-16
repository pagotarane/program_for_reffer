// wap to find the response for the given rating 
//5 --. Excellent  4,3 --> Ok   2,1   --> Poor

class Prt3a
{
public static void main(String args[])
{
int rating=Integer.parseInt(args[0]);
String response = "";
switch(rating)
{
      case 5:   response = "Excellent";
                break;   
      case 4:      
      case 3:   response = "Ok";
                break;   
      case 2:     
      case 1:   response = "Poor";
                break; 
      default : response = "Invalid response";
                break;
}
System.out.println("Response " + response);
}
}