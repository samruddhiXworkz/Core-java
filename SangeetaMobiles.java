class SangeetaMobiles{
public static double getMobilePriceByBrand(String mobileBrandName){
  double mobilePrice=0.0;
  System.out.println("start of getMobilePriceByBrand");
  if(mobileBrandName=="Redami note 9 Pro"){
  mobilePrice=15000.00;
  return mobilePrice;
  }
  if(mobileBrandName==" iPhone 13 Starlight 512GB"){
  mobilePrice=35000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Samsung Galaxy A15"){
  mobilePrice=23000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Realmi 12 5G"){
  mobilePrice=17000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Poco 9 5G"){
  mobilePrice=14000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Vivo y29 5G"){
  mobilePrice=18000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Redami 11 5G "){
  mobilePrice=19000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Samsung Galaxy S24 Altra 5G "){
  mobilePrice=140000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Apple iPhone 13 128GB Green"){
  mobilePrice=270000.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Redami note 7"){
  mobilePrice=12999.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Xiaomi 14 CIVI 8GB/256GB "){
  mobilePrice=43999.00;
  return mobilePrice;
  }
  if(mobileBrandName=="OPPO F27 Pro+ 5G 8GB Ram"){
  mobilePrice=28999.00;
  return mobilePrice;
  }
  if(mobileBrandName=="GFive Rose 114  "){
  mobilePrice=99.00;
  return mobilePrice;
  }
  if(mobileBrandName=="ITel A27 Crytal Blue 2GB 32GB"){
  mobilePrice=5999.00;
  return mobilePrice;
  }
  if(mobileBrandName=="Samsung Galaxy Z Flip (8 GB RAM) 256 GB Storage"){
  mobilePrice=84999.00;
  return mobilePrice;
  }
  if(mobileBrandName=="OPPO Reno11 Pro 5G"){
  mobilePrice=38000.00;
  return mobilePrice;
  }
  else{
    System.out.println(mobileBrandName +"is not found");
  }
  System.out.println("End of getMobilePriceByBrand");
  return mobilePrice;
}


}