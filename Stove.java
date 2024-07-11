class Stove{
static boolean isConnected=false;
static int currentSpeed;
static int maxSpeed=4;
static int minSpeed;

 public static boolean onOrOff(){
 System.out.println("start of onOrOff");
 
 if(!isConnected)isConnected=true;
 else if(isConnected) isConnected=false;
 System.out.println("end of onOrOff");
	   return isConnected;
 }
 public static void increaseSpeed(){
	 System.out.println("start increase Speed");
	 if(isConnected=true){
		 if(currentSpeed<maxSpeed){
			 currentSpeed=currentSpeed+1;
			 System.out.println("the current speed is "+currentSpeed);
		 }else{
			 System.out.println("The current speed reached");
		 } 
	 }else{
		 System.out.println("le Stove connect madu");
		 System.out.println("end of increase Speed");
		 return ;
	 }
 }
 public static void decreaseSpeed(){
	 System.out.println("start of decrease Speed");
	 if(isConnected=true){
		 if(currentSpeed>minSpeed){
			 currentSpeed=currentSpeed-1;
			 System.out.println("the currentSpeed is "+currentSpeed);
		 }else{
			 System.out.println("the minSpeed reached");
		 }
	 }else{
		 System.out.println("le Stove connect madu");
		 System.out.println("end  of decrease Speed");
		 return;
	 }
 }
}