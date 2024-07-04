class Comfort{
 public static void main(String[] comfort)  
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
 
   String  brand="Comfort";
   String color="pink";
   String materialFeature="with fragrance pearls";
   int price=80;
   String itemForm="Solid";
   int numberOfItem=1;
   String scent="Fresh";
   System.out.println("The brand name is "+brand);
   System.out.println("The color of comport is "+color);
   System.out.println("The material Feature of comport is "+materialFeature);
   System.out.println("The price of comport is "+price);
   System.out.println("The itemForm of comport is "+itemForm);
   System.out.println("The number Of Item of comport is "+numberOfItem);
   System.out.println("The Scent of comport is "+scent);
  
   System.out.println("GetFeature method ended");

  return;
 }


}