import java.util.Arrays;

class TeaPoint{
  static String teaNames[]={null,null,null,null,null,null};
  static int start;
  
   public static boolean addTeaName(String teaName){
	   //local ref
   boolean isTeaNameadded=false;
   
   if(start<teaNames.length){
	   //validation
   if(teaName!=null){
	   //intilization
   teaNames[start++]=teaName;
   } else
  System.out.println("Tea name is Invalid");
   }else
	   System.out.println("tea names are full");
   isTeaNameadded=true;
return isTeaNameadded;  
}
 public static void showTeaNames(){
	 //readdata
   System.out.println("The tea names are");
   for(String teaName:teaNames){
   System.out.println(teaName);
   }
 }
 public static boolean updateTeaName(String newTeaName,String oldTeaName){
	 System.out.println("update opration on tea TeaName");
	 boolean isTeaNameUpdate=false;
	 for(int position=0;position<teaNames.length ;position++){
		  if(teaNames[position]==oldTeaName){
			  teaNames[position]=newTeaName;
			 isTeaNameUpdate=true;
		 } 
 }
 
  if(isTeaNameUpdate==false)
		 System.out.println(oldTeaName + " not found");
	 
	  System.out.println("update is ended");
	  
 return isTeaNameUpdate;

}
  public static boolean deleteTeaName(String teaName){
	  boolean isTeaNameDeleted=false;
	  int position,newPosition;
	  for(position=0 ,newPosition=0;position<teaNames.length;position++){
		  if(teaNames[position]!=teaName){
		  teaNames[newPosition]=teaNames[position];
		  newPosition++;
	  
	  System.out.println(newPosition);
		  }else
			  isTeaNameDeleted=true;
	  }
	 
	  int newLength=newPosition;
	  System.out.println(newLength);
	  teaNames=Arrays.copyOf(teaNames,newLength);
	  
	 
	  if(isTeaNameDeleted==false){
		  System.out.println(teaName +"not found");
	  }
	  return isTeaNameDeleted;
	  
	  
  }
}