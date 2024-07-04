class Detergent{
 public static void main(String[] paper)  
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
 
   String  brand="RIN";
   String item="Bar";
   String scent="Fresh";
   String netQuantity="25 ml";
   int price=60;
   String materialType="Dry";
   int numberOfItem=3;
   
   System.out.println("The brand name is "+brand);
   System.out.println("The item Form of Detergent is "+item);
   System.out.println("The scent of Detergent is "+scent);
   System.out.println("The net Quantity of Detergent  "+netQuantity);
   System.out.println("The price of Detergent is "+price);
   System.out.println("The material Type For Detergent is "+materialType);
   System.out.println("The number Of Item For Detergent is "+numberOfItem);

   System.out.println("GetFeature method ended");

  return;
 }


}