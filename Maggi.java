class Maggi{

 static String name="Maggi";
 static double price =55.00;
 static int qntyInGm=125;
 static String ingridiants[]={"Dehydrate Vegitables","green French beens","Wheat flour","Tasted onion flakes","Dried garlic"};


public static void main(String tasty[]){

  System.out.println("the Details of "+ name +" are : " );
  System.out.println("the price of "+ name +" is : "+price );
  System.out.println("the qntyInGm of "+qntyInGm );
  for(int ref=0;ref<ingridiants.length;ref++){
	 String value =ingridiants[ref];
	 System.out.println(value);
	}


}



}