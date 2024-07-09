class Alexa{
 static boolean isConnected=false;
 
 public static boolean onOrOff(){
 System.out.println("start of onOrOff");
 
 if(isConnected==false){
    isConnected=true;
	System.out.println("The Alexa is on...");
 }else if(isConnected==true){
      isConnected=false;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
	  System.out.println("The Alexa is off...");
	  }
 System.out.println("end of onOrOff");
 }
 
 return isConnected ;
 }

}