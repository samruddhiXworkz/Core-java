class SangeetaMobiles{
public static double getMobilePriceByBrand(String mobileBrandName){
  double mobilePrice=0.0;
  System.out.println("start of getMobilePriceByBrand");
  if(mobileBrandName=="Redami note 9 Pro") return mobilePrice;
  if(mobileBrandName==" iPhone 13 Starlight 512GB") return mobilePrice=35000.00;
  if(mobileBrandName=="Samsung Galaxy A15") return mobilePrice=23000.00;
  if(mobileBrandName=="Realmi 12 5G")return mobilePrice=17000.00;
  if(mobileBrandName=="Nokia") return mobilePrice=14000.00;
  if(mobileBrandName=="Vivo y29 5G") return mobilePrice=18000.00;
  if(mobileBrandName=="Redami 11 5G ") return mobilePrice=19000.00;
  if(mobileBrandName=="Samsung Galaxy S24 Altra 5G ")return mobilePrice=14000.00;
  if(mobileBrandName=="Apple iPhone 13 128GB Green")return mobilePrice=270000.00;
  if(mobileBrandName=="Redami note 7") return mobilePrice=12999.00;
  if(mobileBrandName=="Xiaomi 14 CIVI 8GB/256GB ")return mobilePrice=43999.00;
  if(mobileBrandName=="OPPO F27 Pro+ 5G 8GB Ram") return mobilePrice=28999.00;
  if(mobileBrandName=="GFive Rose 114  ")return mobilePrice=99.00;
  if(mobileBrandName=="ITel A27 Crytal Blue 2GB 32GB")return mobilePrice=5999.00;
  if(mobileBrandName=="Samsung Galaxy Z Flip (8 GB RAM) 256 GB Storage")return mobilePrice=84999.00;
  if(mobileBrandName=="OPPO Reno11 Pro 5G")return mobilePrice=38000.00;
  else{
    System.out.println(mobileBrandName +"is not found");
  }
  System.out.println("End of getMobilePriceByBrand");
  return mobilePrice;
}
public static double getMobilePriceByNoOfPhone(String mobileBrandName,int noofphone){
  double mobilePrice=0.0;
  System.out.println("start of getMobilePriceByNoOfPhone");
  if(mobileBrandName=="Redami note 9 Pro") return mobilePrice=14000*noofphone;
  if(mobileBrandName==" iPhone 13 Starlight 512GB") return mobilePrice=35000.00*noofphone;
  if(mobileBrandName=="Samsung Galaxy A15") return mobilePrice=23000.00*noofphone;
  if(mobileBrandName=="Realmi 12 5G")return mobilePrice=17000.00*noofphone;
  if(mobileBrandName=="Nokia") return mobilePrice=14000.00*noofphone;
  if(mobileBrandName=="Vivo y29 5G") return mobilePrice=18000.00*noofphone;
  if(mobileBrandName=="Redami 11 5G ") return mobilePrice=19000.00*noofphone;
  if(mobileBrandName=="Samsung Galaxy S24 Altra 5G ")return mobilePrice=14000.00*noofphone;
  if(mobileBrandName=="Apple iPhone 13 128GB Green")return mobilePrice=270000.00*noofphone;
  if(mobileBrandName=="Redami note 7") return mobilePrice=12999.00*noofphone;
  if(mobileBrandName=="Xiaomi 14 CIVI 8GB/256GB ")return mobilePrice=43999.00*noofphone;
  if(mobileBrandName=="OPPO F27 Pro+ 5G 8GB Ram") return mobilePrice=28999.00*noofphone;
  if(mobileBrandName=="GFive Rose 114  ")return mobilePrice=99.00*noofphone;
  if(mobileBrandName=="ITel A27 Crytal Blue 2GB 32GB")return mobilePrice=5999.00*noofphone;
  if(mobileBrandName=="Samsung Galaxy Z Flip (8 GB RAM) 256 GB Storage")return mobilePrice=84999.00*noofphone;
  if(mobileBrandName=="OPPO Reno11 Pro 5G")return mobilePrice=38000.00*noofphone;
  else{
    System.out.println(mobileBrandName +"is not found");
  }
  System.out.println("End of getMobilePriceByNoOfPhone");
  return mobilePrice;
}

}