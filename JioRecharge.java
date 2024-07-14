class JioRecharge{

public static double getJioPricePlan(String jioPlanName){
  double jioPrice=0.0;
  System.out.println("Start of Main");
  if(jioPlanName=="28Days with 1.5GB/day"){
  jioPrice=299.00;
  return jioPrice;
  }
  if(jioPlanName=="18Days with 1.5GB/day"){
  jioPrice=199.00;
  return jioPrice;
  }
  if(jioPlanName=="22Days  with 1.5GB/day"){
  jioPrice=299.00;
  return jioPrice;
  }
  if(jioPlanName=="56Days  with 1.5GB/day"){
  jioPrice=579.00;
  return jioPrice;
  }
  if(jioPlanName=="84Days  with 1.5GB/day"){
  jioPrice=799.00;
  return jioPrice;
  }
  if(jioPlanName=="70Days with 1.5GB/day"){
  jioPrice=666.00;
  return jioPrice;
  }
  if(jioPlanName=="365Days with 1.5GB/day"){
  jioPrice=3999.00;
  return jioPrice;
  }
  if(jioPlanName=="45Days with 1.5GB/day"){
  jioPrice=560.00;
  return jioPrice;
  }
  if(jioPlanName=="50Days with 1.0GB/day"){
	jioPrice=500.00;
	return jioPrice;
  }
  if(jioPlanName=="28Days with 2GB/day"){
	  jioPrice=399.00;
	  return jioPrice;	  
  }
  if(jioPlanName=="3Month with 2GB/day"){
	  jioPrice=899.00;
	  return jioPrice;
  }
  if(jioPlanName=="45Days with 1GB/day"){
	  jioPrice=499.00;
	  return jioPrice;
  }
  if(jioPlanName=="15Days with 2GB/day"){
	  jioPrice=200.00;
	  return jioPrice;
  }
  if(jioPlanName=="30Days with 1GB/day"){
	  jioPrice=300.00;
	  return jioPrice;
  }
  if(jioPlanName=="45Days with 3GB/Day"){
	  jioPrice=699.00;
	  return jioPrice;
  }
  if(jioPlanName=="65Days with 2GB/day"){
	  jioPrice=699.00;
	  return jioPrice;
  }
  
  else{
  System.out.println(jioPlanName +"is not found");
  }
  System.out.println("End of Main");
  jioPrice=0.0;
  return jioPrice;
}

}