class Laptop{
 static boolean isConnected = false;
 
 public static void turnOn(){
 System.out.println("Start of turnOn");
 
 if(isConnected==false){
    isConnected=true;
	System.out.println("the Laptop is turnOn...");
 }
 System.out.println("End of turnOn");
 }
 public static void turnOff(){
 System.out.println("Start of turnOff");
 
 if(isConnected==true){
    isConnected=false;
	System.out.println("the Laptop is turnOff...");
 }
 System.out.println("End of turnOff");
 }
}