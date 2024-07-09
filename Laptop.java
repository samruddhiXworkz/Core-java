class Laptop{
 static boolean isConnected = false;
 
 public static boolean onOrOff(){
 System.out.println("Start of onOrOff");
 
 if(isConnected==false){
    isConnected=true;
	System.out.println("the Laptop is on...");
 }else if(isConnected==true){
       isConnected=false;
	   System.out.println("the Laptop is onOrOff...");
 }
 System.out.println("End of onOrOff");
 return isConnected ;
 }
}