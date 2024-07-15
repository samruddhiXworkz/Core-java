class FoodPanda{
public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Fish Suka")return foodPrice=390.00;
 if(foodName=="prawns suka")return foodPrice=450.00;
 if(foodName=="Prawns Chilli")return foodPrice=280.00;
 if(foodName=="Silver Rawa Fry")return foodPrice=230.00;
 if(foodName=="Chiken 65")return foodPrice=480.00;
 if(foodName=="Chiken suka") return foodPrice=460.00;
 if(foodName=="Chiken kabab")return foodPrice=100.00;
 if(foodName=="Chiken chilli")return foodPrice=680.00;
 if(foodName=="Motton Curry")return foodPrice=990.00;
 if(foodName=="Motton Suka") return foodPrice=360.00;
 if(foodName=="Mutton kabab")return foodPrice=560.00;
 if(foodName=="Chiken manchorori")return foodPrice=890.00;
 if(foodName=="Chiken lolipop")return foodPrice=280.00;
 if(foodName=="pudina Chiken")return foodPrice=680.00;
 if(foodName=="lemon chiken")return foodPrice=340.00;
 if(foodName=="Chiken DrumStic")return foodPrice=480.00;
 if(foodName=="Chiken Dry Paper")return foodPrice=230.00;
 if(foodName=="Egg Masala")return foodPrice=110.00;
 if(foodName=="Egg Curry")return foodPrice=50.00;
 if(foodName=="Egg Omlet")return foodPrice=370.00;
 else{
 System.out.println(foodName+"not found");
 }
 System.out.println("End of getFoodPricebyName");
 return foodPrice;
}
public static double getFoodPricebyQuantity(String foodName,int qnty){
	double foodPrice=0.0;
 
 if(foodName=="Fish Suka")return foodPrice=390.00*qnty;
 if(foodName=="prawns suka")return foodPrice=450.00*qnty;
 if(foodName=="Prawns Chilli")return foodPrice=280.00*qnty;
 if(foodName=="Silver Rawa Fry")return foodPrice=230.00*qnty;
 if(foodName=="Chiken 65")return foodPrice=480.00*qnty;
 if(foodName=="Chiken suka") return foodPrice=460.00*qnty;
 if(foodName=="Chiken kabab")return foodPrice=100.00*qnty;
 if(foodName=="Chiken chilli")return foodPrice=680.00*qnty;
 if(foodName=="Motton Curry")return foodPrice=990.00*qnty;
 if(foodName=="Motton Suka") return foodPrice=360.00*qnty;
 if(foodName=="Mutton kabab")return foodPrice=560.00*qnty;
 if(foodName=="Chiken manchorori")return foodPrice=890.00*qnty;
 if(foodName=="Chiken lolipop")return foodPrice=280.00*qnty;
 if(foodName=="pudina Chiken")return foodPrice=680.00*qnty;
 if(foodName=="lemon chiken")return foodPrice=340.00*qnty;
 if(foodName=="Chiken DrumStic")return foodPrice=480.00*qnty;
 if(foodName=="Chiken Dry Paper")return foodPrice=230.00*qnty;
 if(foodName=="Egg Masala")return foodPrice=110.00*qnty;
 if(foodName=="Egg Curry")return foodPrice=50.00*qnty;
 if(foodName=="Egg Omlet")return foodPrice=370.00*qnty;
 else{
 System.out.println(foodName+"not found");
 }
 return foodPrice;
}
	
}	
