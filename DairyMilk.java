class  DairyMilk{
 public static void main(String[]  chocalate)  
 {
 System.out.println("The Main Started");
 //invoke method 
 //call method
 getFeatures();
 System.out.println("The Main Ended");
 }
 public static void getFeatures(){
 
 System.out.println("getFeatures method started");
 //local variable diclaration
 
   String  brand="Bublly";
   int packOf=2;
   String shelfLife="2Months";
   String quantity="240.0 gram";
   String flavour="Chocalate";
   int price=150;
   int numberOfItem=1;
   
   System.out.println("The brand name is "+brand);
   System.out.println("The item packOf of DairyMilk is "+packOf);
   System.out.println("The shelfLife of DairyMilk is"+shelfLife);
   System.out.println("The quantity of DairyMilk is  "+quantity);
   System.out.println("The  flavour of DairyMilk is  "+flavour);
   System.out.println("The price of DairyMilk is "+price);
   System.out.println("The number Of Item For DairyMilk is "+numberOfItem);

   System.out.println("GetFeature method ended");

  return;
 }


}