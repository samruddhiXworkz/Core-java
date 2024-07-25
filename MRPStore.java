import java.util.Arrays;
class MRPStore{
static String alcholNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addAlcholName(String alcholName){
boolean isaddAlcholValid=false;
if(index<alcholNames.length){
if(alcholName!=null){
 alcholNames[index++]=alcholName;
}else
System.out.println("the alcholName is Invalid");
}else
	System.out.println("the alcholName is full");
isaddAlcholValid=true;
return isaddAlcholValid;
}
public static void showDetails(){
  for(String alcholName:alcholNames){
  System.out.println(alcholName);
  }
}
public static boolean updateAlcholName(String oldAlcholName,String newAlcholName){
	System.out.println("the update alcholName started");
	boolean isaddAlcholupdate=false;
	for(int postion=0;postion<alcholNames.length;postion++){
		if(alcholNames[postion]==oldAlcholName){
			alcholNames[postion]=newAlcholName;
			isaddAlcholupdate=true;
		}	
	}
	if(isaddAlcholupdate==false)
		System.out.println(oldAlcholName+"not found");
	    System.out.println("update alcholName is ended");
	return isaddAlcholupdate;
}
public static boolean deleteAlcholName(String alcholName){
	boolean isaddAlcholdelete=false;
	int position,newPosition;
	for(position=0 ,newPosition=0;position<alcholNames.length;position++){
		if(alcholNames[position]!=alcholName){
			alcholNames[newPosition]=alcholNames[position];
			 newPosition++;
			 System.out.println(newPosition);
		}else
			isaddAlcholdelete=true;
	}
	int newLength=newPosition;
	System.out.println(newLength);
	alcholNames=Arrays.copyOf(alcholNames,newLength);
    if(isaddAlcholdelete==false){
    System.out.println(alcholName+"alcholNames");	
}
   return isaddAlcholdelete;


	
}
}