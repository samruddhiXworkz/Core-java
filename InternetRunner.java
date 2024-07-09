class InternetRunner{
 public static void main(String wifi[]){
 System.out.println("main started");
   boolean connect=Internet.onOrOff();
   System.out.println("the internet is connect "+connect);
   connect=Internet.onOrOff();
   System.out.println("the internet is connect "+connect);
 System.out.println("main ended");
 
 }

}