class Telivision{
  static boolean isConnected = false;
  
  public static boolean onOrOff(){
  System.out.println("start onOrOff");
  
  if(isConnected == false){
  isConnected = true;
  System.out.println("Telivision is on..");
  }else if(isConnected ==true){
        isConnected =false;
        System.out.println("Telivision is off..");
  }
  System.out.println("end of onOrOff");
  return isConnected;
  }


}