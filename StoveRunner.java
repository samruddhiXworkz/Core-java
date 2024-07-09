class StoveRunner{
  public static void main(String hp[]){
  
  System.out.println("main started");
   boolean connect=Stove.onOrOff();
   System.out.println("The stove is connect:"+connect);
   connect=Stove.onOrOff();
   System.out.println("The stove is connect:"+connect);
  System.out.println("main ended");
  
  }

}