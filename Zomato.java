class Zomato{
	public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Dal Fry") return foodPrice=180.00;
 if(foodName=="Green peas masala") return foodPrice=190.00;
 if(foodName=="Palak") return foodPrice=280.00;
 if(foodName=="Vegitable Makkanvala") return foodPrice=330.00;
 if(foodName=="Mashroom masala") return foodPrice=480.00;
 if(foodName=="tamoto masala") return foodPrice=140.00;
 if(foodName=="Green peas masala") return foodPrice=100.00;
 if(foodName=="Gobii chilli") return foodPrice=280.00;
 if(foodName=="Gobii Paper Dry") return foodPrice=180.00;
 if(foodName=="Baby corn chilli")return foodPrice=300.00;
 if(foodName=="salad") return foodPrice=80.00;
 if(foodName=="Green peas paper Dry") return foodPrice=190.00;
 if(foodName=="Mashroom paper Dry") return foodPrice=280.00;
 if(foodName=="Fish sardien")return foodPrice=480.00;
 if(foodName=="Fish bangada")return foodPrice=340.00;
 if(foodName=="Fish chilly")return foodPrice=480.00;
 if(foodName=="Fish kabab")return foodPrice=230.00;
 if(foodName=="crab Fry")return foodPrice=110.00;
 if(foodName=="Fish Fry")return foodPrice=450.00;
 if(foodName=="crab chilli") return foodPrice=390.00;
 else{
 System.out.println(foodName+"not found");
 }
 System.out.println("End of getFoodPricebyName");
 return foodPrice;
}
public static double getFoodPricebyQuantity(String foodName,int qnty){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyQuantity");
 
 if(foodName=="Dal Fry") return foodPrice=180.00*qnty;
 if(foodName=="Green peas masala") return foodPrice=190.00*qnty;
 if(foodName=="Palak") return foodPrice=280.00*qnty;
 if(foodName=="Vegitable Makkanvala") return foodPrice=330.00*qnty;
 if(foodName=="Mashroom masala") return foodPrice=480.00*qnty;
 if(foodName=="tamoto masala") return foodPrice=140.00*qnty;
 if(foodName=="Green peas masala") return foodPrice=100.00*qnty;
 if(foodName=="Gobii chilli") return foodPrice=280.00*qnty;
 if(foodName=="Gobii Paper Dry") return foodPrice=180.00*qnty;
 if(foodName=="Baby corn chilli")return foodPrice=300.00*qnty;
 if(foodName=="salad") return foodPrice=80.00*qnty;
 if(foodName=="Green peas paper Dry") return foodPrice=190.00*qnty;
 if(foodName=="Mashroom paper Dry") return foodPrice=280.00*qnty;
 if(foodName=="Fish sardien")return foodPrice=480.00*qnty;
 if(foodName=="Fish bangada")return foodPrice=340.00*qnty;
 if(foodName=="Fish chilly")return foodPrice=480.00*qnty;
 if(foodName=="Fish kabab")return foodPrice=230.00*qnty;
 if(foodName=="crab Fry")return foodPrice=110.00*qnty;
 if(foodName=="Fish Fry")return foodPrice=450.00*qnty;
 if(foodName=="crab chilli") return foodPrice=390.00*qnty;
 else{
 System.out.println(foodName+"not found");
 }
 System.out.println("End of getFoodPricebyName");
 return foodPrice;
}
}