class  Dumbbells{
 public static void main(String[]  dumbbells)  
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
 
   String  brand="Lifelong";
   String color="black";
   String specialFeature="No roll head";
   String netQuantity="1000kg";
   int price=200;
   int numberOfItem=1;
   
   System.out.println("The brand name is "+brand);
   System.out.println("The item color of Squeezer is "+color);
   System.out.println("The special Feature of Squeezer is"+specialFeature);
   System.out.println("The net Quantity of Squeezer is  "+netQuantity);
   System.out.println("The price of Squeezer is "+price);
   System.out.println("The number Of Item For Squeezer is "+numberOfItem);

   System.out.println("GetFeature method ended");

  return;
 }


}