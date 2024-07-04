class Dishwash{
 public static void main(String[] dishwash)  
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
 
   String  brand="Exo";
   String itemForm="Bar";
   String scent="Unscented";
   String itemValoume="300gm";
   String materialType="AlcoholFree";
   int price=45;
   String pattern="Solid";
   
   System.out.println("The brand name is "+brand);
   System.out.println("The itemForm of Dishwash is "+itemForm);
   System.out.println("The scent of Dishwash is "+scent);
   System.out.println("The item Valoume of Dishwash is "+itemValoume);
   System.out.println("The price of Dishwash is "+price);
   System.out.println("The material Type of Dishwash is "+materialType);
   System.out.println("The pattern of Dishwash is "+pattern);
   System.out.println("GetFeature method ended");

  return;
 }


}