class DroneRunner{
 public static void main(String candel[]){
 System.out.println("Main started");
  boolean connect=Drone.onOrOff();
  System.out.println("the Drone is connect: "+connect);
   connect=Drone.onOrOff();
   System.out.println("the Drone is connect: "+connect);
 System.out.println("Main ended");
 
 }

}