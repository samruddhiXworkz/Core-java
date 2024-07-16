class JioRecharge{

public static double getJioPricePlan(String jioPlanName){
  double jioPrice=0.0;
  System.out.println("Start of Main");
  if(jioPlanName=="28Days with 1.5GB/day")return jioPrice=299.00;
  if(jioPlanName=="18Days with 1.5GB/day") return jioPrice=199.00;
  if(jioPlanName=="22Days  with 1.5GB/day") return jioPrice=299.00;
  if(jioPlanName=="56Days  with 1.5GB/day") return jioPrice=579.00;
  if(jioPlanName=="84Days  with 1.5GB/day") return jioPrice=799.00;;
  if(jioPlanName=="70Days with 1.5GB/day")return jioPrice=666.00;
  if(jioPlanName=="365Days with 1.5GB/day")return jioPrice=3999.00;
  if(jioPlanName=="45Days with 1.5GB/day")return jioPrice=560.00;
  if(jioPlanName=="50Days with 1.0GB/day")return jioPrice=500.00;
  if(jioPlanName=="28Days with 2GB/day")return jioPrice=500.00;	  
  if(jioPlanName=="3Month with 2GB/day")return jioPrice=899.00;
  if(jioPlanName=="45Days with 1GB/day")return jioPrice=499.00;;
  if(jioPlanName=="15Days with 2GB/day")return jioPrice=200.00;
  if(jioPlanName=="30Days with 1GB/day")return jioPrice=300.00;
  if(jioPlanName=="45Days with 3GB/Day") return jioPrice=699.00;
  if(jioPlanName=="65Days with 2GB/day")return jioPrice=699.00;
  
  else{
  System.out.println(jioPlanName +"is not found");
  }
  System.out.println("End of Main");
  jioPrice=0.0;
  return jioPrice;
}
public static double getJioPricePlan(String jioPlanName,int noOfPack){
  double jioPrice=0.0;
  System.out.println("Start of Main");
  if(jioPlanName=="28Days with 1.5GB/day")return jioPrice=299.00*noOfPack;
  if(jioPlanName=="18Days with 1.5GB/day") return jioPrice=199.00*noOfPack;
  if(jioPlanName=="22Days  with 1.5GB/day") return jioPrice=299.00*noOfPack;
  if(jioPlanName=="56Days  with 1.5GB/day") return jioPrice=579.00*noOfPack;
  if(jioPlanName=="84Days  with 1.5GB/day") return jioPrice=799.00*noOfPack;
  if(jioPlanName=="70Days with 1.5GB/day")return jioPrice=666.00*noOfPack;
  if(jioPlanName=="365Days with 1.5GB/day")return jioPrice=3999.00*noOfPack;
  if(jioPlanName=="45Days with 1.5GB/day")return jioPrice=560.00*noOfPack;
  if(jioPlanName=="50Days with 1.0GB/day")return jioPrice=500.00*noOfPack;
  if(jioPlanName=="28Days with 2GB/day")return jioPrice=500.00*noOfPack;	  
  if(jioPlanName=="3Month with 2GB/day")return jioPrice=899.00*noOfPack;
  if(jioPlanName=="45Days with 1GB/day")return jioPrice=499.00*noOfPack;
  if(jioPlanName=="15Days with 2GB/day")return jioPrice=200.00*noOfPack;
  if(jioPlanName=="30Days with 1GB/day")return jioPrice=300.00*noOfPack;
  if(jioPlanName=="45Days with 3GB/Day") return jioPrice=699.00*noOfPack;
  if(jioPlanName=="65Days with 2GB/day")return jioPrice=699.00*noOfPack;
  
  else{
  System.out.println(jioPlanName +"is not found");
  }
  System.out.println("End of Main");
  jioPrice=0.0;
  return jioPrice;
}

}