class SpeakerRunner{
   //invoke the method
   public static void main(String sony[]){
   System.out.println("the main started");
    boolean Connect=  Speaker.onOrOff();
	System.out.println("in Speaker is Connected :" +Connect);
	  
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  
	  Speaker.decreaseVolume();
	  Speaker.decreaseVolume();
	  Speaker.decreaseVolume();
	  Speaker.decreaseVolume();
	 


      Connect= Speaker.onOrOff();
	System.out.println("is Speaker is connected: " +Connect);
   System.out.println("the main ended");
   
   
   }
}