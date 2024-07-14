class InsurancePackage{
 
 public static double find(String insuranceName){
	 System.out.println("Start of method");
	 
  double insurancePrice=0.0;
  if(insuranceName=="Hdfc life Insurance"){
 
  insurancePrice=9000.00;
  return insurancePrice;
  }
  if(insuranceName=="Max Life"){
   insurancePrice= 8500.80;
   return insurancePrice;
  }
  if(insuranceName=="Icc Life"){
	 insurancePrice=5555.60;
   return insurancePrice;	 
  }
  if(insuranceName=="bajaj Life"){
	 insurancePrice=6000.50;
	 return insurancePrice;
  }
  if(insuranceName=="SBI Life"){
	  insurancePrice =4050.70;
	  return insurancePrice;
  }
  if(insuranceName=="Canara SBIC Life Insurance"){
	  insurancePrice= 5000.90;
	  return insurancePrice;
  }
  if(insuranceName=="Sahara Life Insurance"){
	  insurancePrice=7000.60;
	  return insurancePrice;
  }
  if(insuranceName=="Aviva India"){
	  insurancePrice=6660.85;
	  return insurancePrice;
  }
  if(insuranceName=="Exide Life Insurance"){
	insurancePrice= 9800.60;
   return insurancePrice;	
  }
  if(insuranceName=="Barati Axa Life Insurance"){
	 insurancePrice=6900.70;
  return insurancePrice;	 
  }
 else{
    System.out.println(insuranceName +"not found");
 }
    system.out.println("end Of method");
    return insurancePrice;
 }

}