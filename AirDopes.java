class AirDopes{
  
  static boolean isConnected = false;
  static int currentVolume;
  static int maxVolume=5;
  static int minVolume=0;
  public static boolean onOrOff(){
  System.out.println("start of onOrOff");
  
  if(isConnected) isConnected=true;
  else if(isConnected==true) isConnected=false;
  System.out.println("end of turnOn");
  return isConnected;
  }
  public static void increaseVolume(){
	System.out.println("start of increase Volume");
	if(isConnected=true){
		if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("the current Volume is "+currentVolume);
		}else{
			System.out.println("maxVolume reached");
		}
		}else{
			System.out.println("AirDopes connect madu");
			System.out.println("end of increase Volume");
			return ;
		} 
  }
		public static void decreaseVolume(){
	System.out.println("start decrease Volume");
	if(isConnected=true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("the currentVolume is "+currentVolume);
		}else{
			System.out.println("the min valume reached");
		}			
	}else{
		System.out.println("le AirDopes on madu");
	   System.out.println("end of dicrease volume");

		return ;
 }
  }  
  
}