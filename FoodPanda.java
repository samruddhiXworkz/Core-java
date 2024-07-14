class FoodPanda{
public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Fish Suka"){
 foodPrice=390.00;
 return foodPrice;
 }
 if(foodName=="prawns suka"){
 foodPrice=450.00;
 return foodPrice;
 }
 if(foodName=="Prawns Chilli"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="Silver Rawa Fry"){
 foodPrice=230.00;
 return foodPrice;
 }
 if(foodName=="Chiken 65"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="Chiken suka"){
 foodPrice=460.00;
 return foodPrice;
 }
 if(foodName=="Chiken kabab"){
 foodPrice=100.00;
 return foodPrice;
 }
 if(foodName=="Chiken chilli"){
 foodPrice=680.00;
 return foodPrice;
 }
 if(foodName=="Motton Curry"){
 foodPrice=990.00;
 return foodPrice;
 }
 if(foodName=="Motton Suka"){
 foodPrice=360.00;
 return foodPrice;
 }
 if(foodName=="Mutton kabab"){
 foodPrice=560.00;
 return foodPrice;
 }
 if(foodName=="Chiken manchorori"){
 foodPrice=890.00;
 return foodPrice;
 }
 if(foodName=="Chiken lolipop"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="pudina Chiken"){
 foodPrice=680.00;
 return foodPrice;
 }
 if(foodName=="lemon chiken"){
 foodPrice=340.00;
 return foodPrice;
 }
 if(foodName=="Chiken DrumStic"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="Chiken Dry Paper"){
 foodPrice=230.00;
 return foodPrice;
 }
 if(foodName=="Egg Masala"){
 foodPrice=110.00;
 return foodPrice;
 }
 if(foodName=="Egg Curry"){
 foodPrice=50.00;
 return foodPrice;
 }
 if(foodName=="Egg Omlet"){
 foodPrice=370.00;
 return foodPrice;
 }
 else{
 System.out.println(foodName+"not found");
 }
 System.out.println("End of getFoodPricebyName");
 return foodPrice;
}
}