class NandiniParlour{
public static double getProductPriceByName(String milkProductName){
 double milkPrice=0.0;
 System.out.println("start of getProductPriceByName");
 
 if(milkProductName=="Basundi") return milkPrice=820.00;
 if(milkProductName=="Milk") return milkPrice=100.00;
 if(milkProductName=="Curd") return milkPrice=420.00;
 if(milkProductName=="Butter") return milkPrice=820.00;
 if(milkProductName=="Gee") return milkPrice=520.00;
 if(milkProductName=="Flavoured Milk") return milkPrice=220.00;
 if(milkProductName=="Dairy Whitener") return milkPrice=360.00;
 if(milkProductName=="Milk Shakes") return milkPrice=430.00;
 if(milkProductName=="Lassi") return milkPrice=320.00;
 if(milkProductName=="Paneer")return milkPrice=220.00;
else{
 System.out.println(milkProductName +"Not found");
 
}
 System.out.println("End of getProductPriceByName");
 return milkPrice ;
}
public static double getProductPriceByNoOfProduct(String milkProductName,int noOfProduct){
 double milkPrice=0.0;
 System.out.println("start of getProductPriceByNoOfProduct");
 
 if(milkProductName=="Basundi") return milkPrice=820.00*noOfProduct;
 if(milkProductName=="Milk") return milkPrice=100.00*noOfProduct;
 if(milkProductName=="Curd") return milkPrice=420.00*noOfProduct;
 if(milkProductName=="Butter") return milkPrice=820.00*noOfProduct;
 if(milkProductName=="Gee") return milkPrice=520.00*noOfProduct;
 if(milkProductName=="Flavoured Milk") return milkPrice=220.00*noOfProduct;
 if(milkProductName=="Dairy Whitener") return milkPrice=360.00*noOfProduct;
 if(milkProductName=="Milk Shakes") return milkPrice=430.00*noOfProduct;
 if(milkProductName=="Lassi") return milkPrice=320.00*noOfProduct;
 if(milkProductName=="Paneer")return milkPrice=220.00*noOfProduct;
else{
 System.out.println(milkProductName +"Not found");
 
}
 System.out.println("End of getProductPriceByNoOfProduct");
 return milkPrice ;
}

}