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


}