class InsurancePackage{
 
 public static double find(String insuranceName){
	 
  double insurancePrice=0.0;
  if(insuranceName=="Hdfc life Insurance")return insurancePrice=9000.00;
  if(insuranceName=="Max Life") return insurancePrice= 8500.80;
  if(insuranceName=="Icc Life") return insurancePrice=5555.60;	 
  if(insuranceName=="bajaj Life")return insurancePrice=6000.50;
  if(insuranceName=="SBI Life") return insurancePrice=4050.70;
  if(insuranceName=="Canara SBIC Life Insurance") return insurancePrice=5000.70;
  if(insuranceName=="Sahara Life Insurance")return insurancePrice=7000.60;
  if(insuranceName=="Aviva India") return insurancePrice=6660.85;
  if(insuranceName=="Exide Life Insurance") return insurancePrice= 9800.60;	
  if(insuranceName=="Barati Axa Life Insurance")return insurancePrice=6900.70;	 
 else{
    System.out.println(insuranceName +"not found");
 }
    return insurancePrice;
 }
public static double find(String insuranceName,int noOfWeek){
	 
  double insurancePrice=0.0;
  if(insuranceName=="Hdfc life Insurance")return insurancePrice=9000.00*noOfWeek;
  if(insuranceName=="Max Life") return insurancePrice= 8500.80*noOfWeek;
  if(insuranceName=="Icc Life") return insurancePrice=5555.60*noOfWeek;	 
  if(insuranceName=="bajaj Life")return insurancePrice=6000.50*noOfWeek;
  if(insuranceName=="SBI Life") return insurancePrice=4050.70*noOfWeek;
  if(insuranceName=="Canara SBIC Life Insurance") return insurancePrice=5000.70*noOfWeek;
  if(insuranceName=="Sahara Life Insurance")return insurancePrice=7000.60*noOfWeek;
  if(insuranceName=="Aviva India") return insurancePrice=6660.85*noOfWeek;
  if(insuranceName=="Exide Life Insurance") return insurancePrice= 9800.60*noOfWeek;	
  if(insuranceName=="Barati Axa Life Insurance")return insurancePrice=6900.70*noOfWeek;	 
 else{
    System.out.println(insuranceName +"not found");
 }
    return insurancePrice;
 }
}