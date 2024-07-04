class Fan{
 public static void main(String[] fan)  
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
 
   String  brand="atomberg";
   String color="Gloss White";
   String wattage="	35 Watt";
   String Model="Snapdragon";
   int price=25000;
   String Speed="2.4 GHz";
   String powerSource="Corded Electric";
   
   System.out.println("The brand name is "+brand);
   System.out.println("The color of fan is "+color);
   System.out.println("The wattage of fan is "+wattage);
   System.out.println("The Model of fan is  "+Model);
   System.out.println("The price of roller fan is "+price);
   System.out.println("The Speed For fan is "+Speed);
   System.out.println("The powerSource For fan is "+powerSource);

   System.out.println("GetFeature method ended");

  return;
 }


}