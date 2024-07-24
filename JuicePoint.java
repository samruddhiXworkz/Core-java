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
}