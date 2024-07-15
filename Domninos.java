class Domninos{
public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Fresh Vegii") return foodPrice= 200.00;
 if(foodName=="Chees Corn") return foodPrice=190.00;
 if(foodName=="Chees n Tomoto") return foodPrice=280.00;
 if(foodName=="Chreemi Pista Pizza")return foodPrice=330.00;
 if(foodName=="paneer makani")return foodPrice=480.00;
 if(foodName=="Deluxi Veggi")return foodPrice=140.00;
 if(foodName=="Kadayi paneer")return foodPrice=100.00;
 if(foodName=="Corn n chees parata Pizza")return foodPrice=280.00;
 if(foodName=="chees parata pizza") return foodPrice=180.00;
 if(foodName=="Chikan Popkorn")return foodPrice=300.00;
 if(foodName=="Chicken chilli")return foodPrice=80.00;
 if(foodName=="Indi Chikan Tikka")return foodPrice=190.00;
 if(foodName=="Chiken Fest pizza")return foodPrice=280.00;
 if(foodName=="chiken maximus")return foodPrice=480.00;
 if(foodName=="Farm Hpouse") return foodPrice=340.00;
 if(foodName=="Maximus Green Wave")return foodPrice=480.00;
 if(foodName=="BBq Chicken")return foodPrice=230.00;
 if(foodName=="chiken bacon ranch") return foodPrice=400.00;
 if(foodName=="6chees Pizza")return foodPrice=450.00;
 if(foodName=="Spinch")return foodPrice=390.00;
 else{
 System.out.println(foodName+"not found");
 }
 System.out.println("End of getFoodPricebyName");
 return foodPrice;
}
public static double getFoodPricebyQuanty(String foodName ,int qnty){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyQuanty");
 
 if(foodName=="Fresh Vegii") return foodPrice= 200.00*qnty;
 if(foodName=="Chees Corn") return foodPrice=190.00*qnty;
 if(foodName=="Chees n Tomoto") return foodPrice=280.00*qnty;
 if(foodName=="Chreemi Pista Pizza")return foodPrice=330.00*qnty;
 if(foodName=="paneer makani")return foodPrice=480.00*qnty;
 if(foodName=="Deluxi Veggi")return foodPrice=140.00*qnty;
 if(foodName=="Kadayi paneer")return foodPrice=100.00*qnty;
 if(foodName=="Corn n chees parata Pizza")return foodPrice=280.00*qnty;
 if(foodName=="chees parata pizza") return foodPrice=180.00*qnty;
 if(foodName=="Chikan Popkorn")return foodPrice=300.00*qnty;
 if(foodName=="Chicken chilli")return foodPrice=80.00*qnty;
 if(foodName=="Indi Chikan Tikka")return foodPrice=190.00*qnty;
 if(foodName=="Chiken Fest pizza")return foodPrice=280.00*qnty;
 if(foodName=="chiken maximus")return foodPrice=480.00*qnty;
 if(foodName=="Farm Hpouse") return foodPrice=340.00*qnty;
 if(foodName=="Maximus Green Wave")return foodPrice=480.00*qnty;
 if(foodName=="BBq Chicken")return foodPrice=230.00*qnty;
 if(foodName=="chiken bacon ranch") return foodPrice=400.00*qnty;
 if(foodName=="6chees Pizza")return foodPrice=450.00*qnty;
 if(foodName=="Spinch")return foodPrice=390.00*qnty;
 else{
 System.out.println(foodName+"not found");
 }
 System.out.println("End of getFoodPricebyName");
 return foodPrice;
}
}