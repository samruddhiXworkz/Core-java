class PVRRunner{
 public static void main(String movie[]){
  System.out.println("The main Started");
  String name="Ramayana";
  int noOfTicket=5;
  double price=PVR.getMoviePricebyName(name);
  System.out.println("the price for "+name+" is "+price);
  System.out.println("number of moVie ticket is"+noOfTicket);
  System.out.println("total of movie ticket is"+price*noOfTicket);
  System.out.println("The main Ended");

 
 }


}