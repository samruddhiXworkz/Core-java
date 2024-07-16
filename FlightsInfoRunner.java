class FlightsInfoRunner{
 public static void main(String flight[]){
 System.out.println("The main Started");
 String name="Jaipur";
 int noOfticket=7;
 double price=FlightsInfo.getFlightsPriceByDest(name);
  System.out.println("the price for "+name+" is "+price);
  System.out.println("number of no Of ticket is"+noOfticket);
  System.out.println("number of total ticket is"+price*noOfticket);

 System.out.println("The main Started");

 }
 
 
 }