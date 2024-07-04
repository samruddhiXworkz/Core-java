class  Charger{
 public static void main(String[]  charger)  
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
 
   String  brand="Ambrane";
   String color="white";
   String specialFeature="30W GaN Wall Charger, Multi-layered Chipset Protection, Dual Ports: Type-C & USB-A, Compact Design";
   String connector="USB";
   String compatibleDevices="SmartPhone";
   int price=500;
   int numberOfItem=1;
   
   System.out.println("The brand name is "+brand);
   System.out.println("The item color of charger is "+color);
   System.out.println("The special Feature of charger is"+specialFeature);
   System.out.println("The connector of charger is  "+connector);
   System.out.println("The compatible Devices of charger is  "+compatibleDevices);
   System.out.println("The price of charger is "+price);
   System.out.println("The number Of Item For charger is "+numberOfItem);

   System.out.println("GetFeature method ended");

  return;
 }


}