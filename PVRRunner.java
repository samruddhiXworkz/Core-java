class PVRRunner{
 public static void main(String movie[]){
  System.out.println("The main Started");
  String name="Ramayana";
  double price=PVR.getMoviePricebyName(name);
  System.out.println("the price for "+name+" is "+price);
  System.out.println("The main Ended");

 
 }


}