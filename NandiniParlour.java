class NandiniParlour{
public static double getProductPriceByName(String milkProductName){
 double milkPrice=0.0;
 System.out.println("start of getProductPriceByName");
 
 if(milkProductName=="Basundi"){
 milkPrice=820.00;
 return milkPrice;
 }
 if(milkProductName=="Milk"){
 milkPrice=100.00;
 return milkPrice;
 }
 if(milkProductName=="Curd"){
 milkPrice=420.00;
 return milkPrice;
 }
 if(milkProductName=="Butter"){
 milkPrice=820.00;
 return milkPrice;
 }
 if(milkProductName=="Gee"){
 milkPrice=520.00;
 return milkPrice;
 }
 if(milkProductName=="Flavoured Milk"){
 milkPrice=220.00;
 return milkPrice;
 }
 if(milkProductName=="Dairy Whitener"){
 milkPrice=360.00;
 return milkPrice;
 }
 if(milkProductName=="Milk Shakes"){
 milkPrice=430.00;
 return milkPrice;
 }
 if(milkProductName=="Lassi"){
 milkPrice=320.00;
 return milkPrice;
 }
 if(milkProductName=="Paneer"){
 milkPrice=220.00;
 return milkPrice;
 }
else{
 System.out.println(milkProductName +"Not found");
 
}
 System.out.println("End of getProductPriceByName");
 return milkPrice ;
}

}