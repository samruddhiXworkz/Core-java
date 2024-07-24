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
}