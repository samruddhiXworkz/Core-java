class Internet{
  static boolean isConnected= false;
  
  public static void turnOn(){
  System.out.println("start of turnOn");
  
  if(isConnected==false){
      isConnected=true;
	  System.out.println("The Internet is turnOn...");
  }
  System.out.println("end of turnOn");
  }
  public static void turnOff(){
  System.out.println("start of turnOff");
  
  if(isConnected==true){
      isConnected=false;
	  System.out.println("The Internet is turnOff....");
  }
  System.out.println("end of turnOff");
  }

}