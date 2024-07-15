class Swiggy{
public static double getFoodPricebyName(String foodName){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyQuantity");
 
 if(foodName=="Lemon juice")return foodPrice=80.00;
  if(foodName=="Maggi") return foodPrice=50.00;
 if(foodName=="Pizza")return foodPrice=250.00;
 if(foodName=="SandWitch")return foodPrice=180.00;
 if(foodName=="French fry") return foodPrice=350.00;
 if(foodName=="cold coffe")return foodPrice =400.00;
 if(foodName=="Nodells")return foodPrice=380.00;
 if(foodName=="Fried Rice") return foodPrice=240.00;
 if(foodName=="Sejhavan Rice")return foodPrice=200.00;
 if(foodName=="Burger") return foodPrice=300.00;
 if(foodName=="kachori")return foodPrice=50.00;
 if(foodName=="samosa") return foodPrice=70.00;
 if(foodName=="Dabeli")return foodPrice=57.00;
 if(foodName=="paniPuri")return foodPrice=86.00; 
 if(foodName=="golgappa") return foodPrice=80.00; 
 if(foodName=="chayoos") return foodPrice=100.00;
 if(foodName=="veg cutlet")return foodPrice=400.00;
 if(foodName=="veg momo") return foodPrice=399.00; 
 if(foodName=="Mix veg subji")return foodPrice=280.00;
 if(foodName=="pokara")return foodPrice=180.00;
  else{
   System.out.println(foodName +"not found");
   }
   System.out.println("End of getFoodPricebyName");
   return foodPrice;
}
public static double getFoodPricebyQuantity(String foodName,int qnty){
 double foodPrice=0.0;
 System.out.println("start of getFoodPricebyName");
 
 if(foodName=="Lemon juice")return foodPrice=80.00*qnty;
  if(foodName=="Maggi") return foodPrice=50.00*qnty;
 if(foodName=="Pizza")return foodPrice=250.00*qnty;
 if(foodName=="SandWitch")return foodPrice=180.00*qnty;
 if(foodName=="French fry") return foodPrice=350.00*qnty;
 if(foodName=="cold coffe")return foodPrice =400.00*qnty;
 if(foodName=="Nodells")return foodPrice=380.00*qnty;
 if(foodName=="Fried Rice") return foodPrice=240.00*qnty;
 if(foodName=="Sejhavan Rice")return foodPrice=200.00*qnty;
 if(foodName=="Burger") return foodPrice=300.00*qnty;
 if(foodName=="kachori")return foodPrice=50.00*qnty;
 if(foodName=="samosa") return foodPrice=70.00*qnty;
 if(foodName=="Dabeli")return foodPrice=57.00*qnty;
 if(foodName=="paniPuri")return foodPrice=86.00*qnty; 
 if(foodName=="golgappa") return foodPrice=80.00*qnty; 
 if(foodName=="chayoos") return foodPrice=100.00*qnty;
 if(foodName=="veg cutlet")return foodPrice=400.00*qnty;
 if(foodName=="veg momo") return foodPrice=399.00*qnty; 
 if(foodName=="Mix veg subji")return foodPrice=280.00*qnty;
 if(foodName=="pokara")return foodPrice=180.00*qnty;
  else{
   System.out.println(foodName +"not found");
   }
   System.out.println("End of getFoodPricebyQuantity");
   return foodPrice;
}

}