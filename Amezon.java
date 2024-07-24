class Amezon{

static String productNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addProductName(String productName){
   boolean isAddProductNameValid=false;
   if(index<productNames.length){
   if(productName!=null){
   productNames[index++]=productName;
   }else
   System.out.println("the product name Invalid");
}else
	System.out.println("the product name is full");

  isAddProductNameValid=true;
  return isAddProductNameValid;

}
 public static void readDetails(){
	 System.out.println("the product are:");
   for(String productName:productNames){
   System.out.println(productName);
   }
 
 
 }



}