import java.util.Arrays;
class TouristCompany{
 static String tourustNames[]={null,null,null,null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addTouristName(String tourustName){
 boolean isTourestNameValid=false;
 if(index<tourustNames.length){
 if(tourustName!=null){
    tourustNames[index++]=tourustName;
 
 }else
 System.out.println("the tourustName is inValid");
 }else
	 System.out.println("the tourustName is fullName");
 isTourestNameValid=true;
 return isTourestNameValid;
 }
 public static void showDetails(){
 for(String tourustName:tourustNames){
 System.out.println(tourustName);
 
 }
 
 }
 public static boolean updateTourustName(String oldTourustName,String newTourustName){
	System.out.println("start of update TourustName");
    boolean isTourestNameUpdate=false;
    for(int position=0;position<tourustNames.length;position++){
		if(tourustNames[position]==oldTourustName){
			tourustNames[position]=newTourustName;
			isTourestNameUpdate=true;
		}
	}	
	if(isTourestNameUpdate==false) 
		System.out.println(oldTourustName+"not fond");
	    System.out.println("the update tourustNames");
	 return isTourestNameUpdate;
 }
 public static boolean deleteTourustName(String tourustName){
	boolean isTourestNameDelete=false;
	int position,newPosition;
	for(position=0 ,newPosition=0;position<tourustNames.length;position++){
		if(tourustNames[position]!=tourustName){
			tourustNames[newPosition]=tourustNames[position];
			 newPosition++;
			 System.out.println(newPosition);
		}else
			isTourestNameDelete=true;
	}
	int newLength=newPosition;
	System.out.println(newLength);
	tourustNames=Arrays.copyOf(tourustNames,newLength);
    if(isTourestNameDelete==false){
    System.out.println(tourustName+"tourustNames");	
}
   return isTourestNameDelete;
}

}