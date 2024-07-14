class Zomato{
public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Dal Fry"){
 foodPrice=180.00;
 return foodPrice;
 }
 if(foodName=="Green peas masala"){
 foodPrice=190.00;
 return foodPrice;
 }
 if(foodName=="Palak"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="Vegitable Makkanvala"){
 foodPrice=330.00;
 return foodPrice;
 }
 if(foodName=="Mashroom masala"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="tamoto masala"){
 foodPrice=140.00;
 return foodPrice;
 }
 if(foodName=="Green peas masala"){
 foodPrice=100.00;
 return foodPrice;
 }
 if(foodName=="Gobii chilli"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="Gobii Paper Dry"){
 foodPrice=180.00;
 return foodPrice;
 }
 if(foodName=="Baby corn chilli"){
 foodPrice=300.00;
 return foodPrice;
 }
 if(foodName=="salad"){
 foodPrice=80.00;
 return foodPrice;
 }
 if(foodName=="Green peas paper Dry"){
 foodPrice=190.00;
 return foodPrice;
 }
 if(foodName=="Mashroom paper Dry"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="Fish sardien"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="Fish bangada"){
 foodPrice=340.00;
 return foodPrice;
 }
 if(foodName=="Fish chilly"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="Fish kabab"){
 foodPrice=230.00;
 return foodPrice;
 }
 if(foodName=="crab Fry"){
 foodPrice=110.00;
 return foodPrice;
 }
 if(foodName=="Fish Fry"){
 foodPrice=450.00;
 return foodPrice;
 }
 if(foodName=="crab chilli"){
 foodPrice=390.00;
 return foodPrice;
 }
 else{
 System.out.println(foodName+"not found");
 }
 System.out.println("End of getFoodPricebyName");
 return foodPrice;
}
}