class LaptopRunner{
 public static void main(String hp[]){
 System.out.println("Main started");
 boolean connect=Laptop.onOrOff();
 System.out.println("the Laptop is connect: "+connect);
 
     Laptop.increaseVolume();
      Laptop.increaseVolume();
	  Laptop.increaseVolume();
      Laptop.increaseVolume();
      Laptop.increaseVolume();
      Laptop.increaseVolume();
   
	  
	  Laptop.decreaseVolume();
      Laptop.decreaseVolume();
 
 
 
 connect=Laptop.onOrOff();
 System.out.println("the Laptop is connect:"+connect);
 System.out.println("Main ended");
 
 }

}