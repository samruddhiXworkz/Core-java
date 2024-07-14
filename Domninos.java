class Domninos{
public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Fresh Vegii"){
 foodPrice=200.00;
 return foodPrice;
 }
 if(foodName=="Chees Corn"){
 foodPrice=190.00;
 return foodPrice;
 }
 if(foodName=="Chees n Tomoto"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="Chreemi Pista Pizza"){
 foodPrice=330.00;
 return foodPrice;
 }
 if(foodName=="paneer makani"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="Deluxi Veggi"){
 foodPrice=140.00;
 return foodPrice;
 }
 if(foodName=="Kadayi paneer"){
 foodPrice=100.00;
 return foodPrice;
 }
 if(foodName=="Corn n chees parata Pizza"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="chees parata pizza"){
 foodPrice=180.00;
 return foodPrice;
 }
 if(foodName=="Chikan Popkorn"){
 foodPrice=300.00;
 return foodPrice;
 }
 if(foodName=="Chicken chilli"){
 foodPrice=80.00;
 return foodPrice;
 }
 if(foodName=="Indi Chikan Tikka"){
 foodPrice=190.00;
 return foodPrice;
 }
 if(foodName=="Chiken Fest pizza"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="chiken maximus"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="Farm Hpouse"){
 foodPrice=340.00;
 return foodPrice;
 }
 if(foodName=="Maximus Green Wave"){
 foodPrice=480.00;
 return foodPrice;
 }
 if(foodName=="BBq Chicken"){
 foodPrice=230.00;
 return foodPrice;
 }
 if(foodName=="chiken bacon ranch"){
 foodPrice=110.00;
 return foodPrice;
 }
 if(foodName=="6chees Pizza"){
 foodPrice=450.00;
 return foodPrice;
 }
 if(foodName=="Spinch"){
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