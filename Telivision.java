class Telivision{
  static boolean isConnected = false;
  static int maxVolume=6;
  static int currentVolume;
  static int minVolume;
  
  public static boolean onOrOff(){
  System.out.println("start onOrOff");
  
  if(!isConnected )isConnected = true;
  else if(isConnected){
        isConnected =false;
        System.out.println("Telivision is off..");
  }
  System.out.println("end of onOrOff");
  return isConnected;
  }
 public static void increaseVolume(){
	System.out.println("Start increace Volume");
	 if(isConnected=true){
	   if(currentVolume<maxVolume){
	   currentVolume=currentVolume+1;
	   System.out.println("the current Volume is :"+currentVolume);
	   }else{
		   System.out.println("maxVolume is reached");
		  }
	}else{
		System.out.println("Le Telivision connect madu");
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
		System.out.println("le Telivision connect madu");
	   System.out.println("end of dicrease volume");

		return ;
}
 }
}
   


