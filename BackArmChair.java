class BackArmChair{
 public static void main(String[] chair)  
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
 
   String  brand="CROWN FURNITURE ART";
   String color="Gray";
   String material="Teak";
   String dimenssion="71D x 76W x 78H Centimeters";
   int price=45500;
   String pattern="Solid";
   
   System.out.println("The brand name is "+brand);
   System.out.println("The color of chair is "+color);
   System.out.println("The material of chair is "+material);
   System.out.println("The dimenssion of chair is "+dimenssion);
   System.out.println("The price of chair is "+price);
   System.out.println("The color of pattern is "+pattern);
   System.out.println("GetFeature method ended");

  return;
 }


}