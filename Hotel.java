class Hotel{

//Arrays Declaration
static String foodMenu[]={"Idli","Rice","Chapati","Roti","Dal","Kajukari","Paneer","Payasa","Dosa","Puri","Idlivada","Curdrice","carothalwa","gulabjamun","chiken","muttorpaneer","southIndian","Northindian","Talipit","Bisibelhebaat","keemcurry","kabab","eggRice","fishcurry","mottonsoup","Chikencurry"};
 public static void main(String hotel[]){
	 System.out.println("Main Started");
	 System.out.println("Welcome to Hotel ");
	 System.out.println("------------");
	 
	  for (String foodName : foodMenu){
		  System.out.println(foodName);
	  }

	 System.out.println("Main Ended");

 }
}