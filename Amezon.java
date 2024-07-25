import java.util.Arrays;
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
public static boolean updateProductName(String oldProductName,String newProductName){
	System.out.println("update productName is started");
	boolean isProductNameUpdate=false;
	for(int position=0;position<productNames.length;position++){
		if(productNames[position]==oldProductName){
			productNames[position]=newProductName;
			isProductNameUpdate=true;
		}
		
	}
	if(isProductNameUpdate==false)
		System.out.println(oldProductName+"not found");
	    System.out.println("update ProductName ended");
	return isProductNameUpdate;
}
public static boolean deleteProductName(String productName){
	boolean isProductNameDelete=false;
	int position,newPosition;
	for(position=0 ,newPosition=0;position<productNames.length;position++){
		if(productNames[position]!=productName){
			productNames[newPosition]=productNames[position];
			 newPosition++;
			 System.out.println(newPosition);
		}else
			isProductNameDelete=true;
	}
	int newLength=newPosition;
	System.out.println(newLength);
	productNames=Arrays.copyOf(productNames,newLength);
    if(isProductNameDelete==false){
    System.out.println(productName+"productNames");	
}
   return isProductNameDelete;
}
}
