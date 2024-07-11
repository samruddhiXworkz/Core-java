class AlexaRunner{
  public static void main(String sonata[]){
  System.out.println("Main started");
  boolean connect=Alexa.onOrOff();
  System.out.println("is Alexa is connect :"+connect);
  
      Alexa.increaseVolume();
      Alexa.increaseVolume();
	  Alexa.increaseVolume();
      Alexa.increaseVolume();
      Alexa.increaseVolume();
      Alexa.increaseVolume();
      Alexa.increaseVolume();
      Alexa.increaseVolume();
      
	  
	  Alexa.decreaseVolume();
      Alexa.decreaseVolume();
      Alexa.decreaseVolume();

  
  
     connect=Alexa.onOrOff();
	 System.out.println("is Alexa is connect: "+connect);
     System.out.println("Main ended");

  }

}