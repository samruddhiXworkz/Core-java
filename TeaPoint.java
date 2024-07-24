class TeaPoint{
  static String teaNames[]={null,null,null,null,null,null};
  static int start;
  
   public static boolean addTeaName(String teaName){
   boolean isTeaNameadded=false;
   
   if(start<teaNames.length){
   if(teaName!=null){
   teaNames[start++]=teaName;
   } else
  System.out.println("Tea name is Invalid");
   }else
	   System.out.println("tea names are full");
   isTeaNameadded=true;

return isTeaNameadded;  
}
 public static void showTeaNames(){
   System.out.println("The tea names are");
   for(String teaName:teaNames){
   System.out.println(teaName);
   }
 

}

}