class Swiggy{
public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Lemon juice"){
 foodPrice=80.00;
 return foodPrice;
 }
  if(foodName=="Maggi"){
 foodPrice=50.00;
 return foodPrice;
 }
 if(foodName=="Pizza"){
 foodPrice=250.00;
 return foodPrice;
 }
 if(foodName=="SandWitch"){
 foodPrice=180.00;
 return foodPrice;
 }
 if(foodName=="French fry"){
 foodPrice=350.00;
 return foodPrice;
 } 
 if(foodName=="cold coffe"){
 foodPrice=400.00;
 return foodPrice;
 }
 if(foodName=="Nodells"){
 foodPrice=380.00;
 return foodPrice;
 }
 if(foodName=="Fried Rice"){
 foodPrice=240.00;
 return foodPrice;
 }
 if(foodName=="Sejhavan Rice"){
 foodPrice=200.00;
 return foodPrice;
 } 
 if(foodName=="Burger"){
 foodPrice=300.00;
 return foodPrice;
 } 
 if(foodName=="kachori"){
 foodPrice=50.00;
 return foodPrice;
 }
 if(foodName=="samosa"){
 foodPrice=70.00;
 return foodPrice;
 }
 if(foodName=="Dabeli"){
 foodPrice=59.00;
 return foodPrice;
 } 
 if(foodName=="paniPuri"){
 foodPrice=88.00;
 return foodPrice;
 } 
 if(foodName=="golgappa"){
 foodPrice=80.00;
 return foodPrice;
 } 
 if(foodName=="chayoos"){
 foodPrice=100.00;
 return foodPrice;
 }
 if(foodName=="veg cutlet"){
 foodPrice=400.00;
 return foodPrice;
 } 
 if(foodName=="veg momo"){
 foodPrice=399.00;
 return foodPrice;
 } 
 if(foodName=="Mix veg subji"){
 foodPrice=280.00;
 return foodPrice;
 }
 if(foodName=="pokara"){
 foodPrice=180.00;
 return foodPrice;
 }
  else{
   System.out.println(foodName +"not found");
   }
   System.out.println("End of getFoodPricebyName");
   return foodPrice;
}

}