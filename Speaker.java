class Speaker{
   //on(),off(),increaseVolume(),decreaseVolume()
   static boolean isConnected= false;
   static int  maxVolume=7;
   static int currentVolume;
   static int minVolume;
  
   
   public static boolean onOrOff(){
   System.out.println("start of onOrOff");
   /*ref=condition ? value1:value2;
   isConnected=(isConnected==false) ? true :false ;*/
   
   if(!isConnected) isConnected=true;	   
  else if(isConnected)isConnected=false;
   System.out.println("end of onOrOff");
	return isConnected ;  
   }
   
 //increaseVolume
 public static void increaseVolume(){
   System.out.println("start increase Volume ");
   if(isConnected=true){
	   if(currentVolume<maxVolume){
	   currentVolume=currentVolume+1;
	   System.out.println("the current Volume is :"+currentVolume);
	   }else{
		   System.out.println("maxVolume is reached");
		   
	   }
   } else{
	   System.out.println("gube Speaker connect madu:");
      System.out.println("end increase Volume ");
    return ;
   }
 }  
 public static void decreaseVolume(){
	 System.out.println("start decrease Volume");
	 if(isConnected=true){
	 if(currentVolume>minVolume){
		 currentVolume=currentVolume-1;
		 System.out.println("the current Volume is :"+currentVolume);
	 }else{	 
		 System.out.println("min Volume reached");
		 
	 } 
	 }else{
		 System.out.println("gube Speaker connect madu:");
		 System.out.println("end decrease Volume");
		 return;
	 }
   }
}