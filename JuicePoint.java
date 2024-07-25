import java.util.Arrays;
class JuicePoint{
static String juiceNames[]={null,null,null,null,null,null};
static int start;
public static boolean addJuiceName(String juiceName){
 boolean isJuiceNameValid=false;
 if(start<juiceNames.length){
 if(juiceName!=null){
    juiceNames[start++]=juiceName;
	}else
	System.out.println("Tea name is Invalid");
}else
	System.out.println("the juice name full");
   isJuiceNameValid=true;
return isJuiceNameValid;
}
public static void showDetails(){
  System.out.println("the juice name are ");
  for(String juiceName:juiceNames){
  System.out.println(juiceName);
  }
 }
  public static boolean updateJuiceName(String oldJuiceName,String newJuiceName){
	System.out.println("update opration juice name");
    boolean isJuiceNameUpdate=false;
    for(int position=0;position<juiceNames.length;position++){
		if(juiceNames[position]==oldJuiceName){
         juiceNames[position]=newJuiceName;
          isJuiceNameUpdate=true;	 
	}
    
  }
   if(isJuiceNameUpdate==false)
	  System.out.println(oldJuiceName +"not found");
      
	  System.out.println("the Juice name updated");   
   return isJuiceNameUpdate;  
  }
public static boolean deleteJuiceName(String juiceName){
	boolean isJuiceNameDelete=false;
	int position,newPosition;
	for(position=0 ,newPosition=0;position<juiceNames.length;position++){
		if(juiceNames[position]!=juiceName){
			juiceNames[newPosition]=juiceNames[position];
			newPosition++;
			System.out.println(newPosition);
		}else
			isJuiceNameDelete=true;
	}
	int newlength=newPosition;
	System.out.println(newlength);
    juiceNames=Arrays.copyOf(juiceNames,newlength);
	if(isJuiceNameDelete==false){
		System.out.println(juiceName+"juiceNames");
	}
	return isJuiceNameDelete;
}

}