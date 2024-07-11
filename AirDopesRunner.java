class AirDopesRunner{

 public static void main(String boat[]){
 
 System.out.println("Main started");
  boolean Connect=AirDopes.onOrOff();
  System.out.println("in Speaker is Connected :" +Connect);
      AirDopes.increaseVolume();
	  AirDopes.increaseVolume();
      AirDopes.increaseVolume();
      AirDopes.increaseVolume();
      AirDopes.increaseVolume();
      AirDopes.increaseVolume();

	  AirDopes.decreaseVolume();
      AirDopes.decreaseVolume();
      AirDopes.decreaseVolume();
      AirDopes.decreaseVolume();

  
     Connect=AirDopes.onOrOff();
  System.out.println("in Speaker is Connected :" +Connect);

 System.out.println("Main ended");
 
 }


}