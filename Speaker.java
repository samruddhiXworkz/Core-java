class Speaker{
   //on(),off(),increaseVolume(),decreaseVolume()
   static boolean isConnected= false;
   public static boolean onOrOff(){
   System.out.println("start of onOrOff");

   if(isConnected==false){
	   isConnected=true;
	   System.out.println("The Speaker is on...");
   }else if(isConnected==true){
	   isConnected=false;
	   System.out.println("The Speaker is off...");
   }
   System.out.println("end of onOrOff");
	return isConnected ;   
   }
}