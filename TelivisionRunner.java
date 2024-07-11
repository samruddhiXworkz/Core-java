class TelivisionRunner{
  
  public static void main(String cv[]){
  System.out.println("main started");
  boolean connect=Telivision.onOrOff();
  System.out.println("the Telivision is connect :"+connect);
       Telivision.increaseVolume();
	   Telivision.increaseVolume();
       Telivision.increaseVolume();
       Telivision.increaseVolume();
       Telivision.increaseVolume();
       Telivision.increaseVolume();

       Telivision.decreaseVolume();
	    Telivision.decreaseVolume();
       Telivision.decreaseVolume();
       Telivision.decreaseVolume();


  
  connect=Telivision.onOrOff();
  System.out.println("the Telivision is connect: "+connect);
  System.out.println("main ended");
  
  }
}