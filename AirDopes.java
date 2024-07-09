class AirDopes{
  
  static boolean isConnected = false;
  public static boolean onOrOff(){
  System.out.println("start of onOrOff");
  
  if(isConnected==false){
    isConnected=true;
  System.out.println("AirDopes is on...");
  }else if(isConnected==true){
    isConnected=false;
	System.out.println("AirDopes is off....");
  }
  System.out.println("end of turnOn");
  return isConnected;
  }
}