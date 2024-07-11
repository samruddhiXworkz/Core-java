class PainBlam{

 static String name="Amrutanjan";
 static double price =45.00;
 static int qntyInGm=125;
 static String ingridiants[]={"Fudina","GandPatra Tail","paraffin"};


public static void main(String painblam[]){

  System.out.println("the Details of "+ name +" are : " );
  System.out.println("the price of "+ name +" is : "+price );
  System.out.println("the qntyInGm of "+qntyInGm );
  for(int ref=0;ref<ingridiants.length;ref++){
	 String value =ingridiants[ref];
	 System.out.println(value);
	}


}



}