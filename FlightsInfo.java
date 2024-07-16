class FlightsInfo{
public static double getFlightsPriceByDest(String flightDestinationName){
 double flightPrice=0.0;
 System.out.println("start of getFlightsPriceByDest");
  if(flightDestinationName=="Mumbai") return flightPrice=7700.00;
  if(flightDestinationName=="Jaipur") return flightPrice=8700.00;
  if(flightDestinationName=="Belagavi") return flightPrice=8000.00;
  if(flightDestinationName=="Benglore") return flightPrice=9000.00;
  if(flightDestinationName=="pune") return flightPrice=8700.00;
  if(flightDestinationName=="Loknow") return flightPrice=9900.00;
  if(flightDestinationName=="Mumbai") return flightPrice=7700.00;
  if(flightDestinationName=="Kolkatta") return flightPrice=6000.00;
  if(flightDestinationName=="patna") return flightPrice=7000.00;
  if(flightDestinationName=="Channai") return flightPrice=5000.00;
  if(flightDestinationName=="kerala") return flightPrice=77000.00;
  if(flightDestinationName=="Dubai") return flightPrice=78000.00;
  if(flightDestinationName=="Dehli") return flightPrice=9000.00;
  if(flightDestinationName=="USA") return flightPrice=77000.00;
  if(flightDestinationName=="Manglore") return flightPrice=60099.00;
  if(flightDestinationName=="Shivmogga") return flightPrice=6600.00;
  if(flightDestinationName=="Goa") return flightPrice=79990.00;
  if(flightDestinationName=="Tailand") return flightPrice=99999.00;
  if(flightDestinationName=="SouthKoria")return flightPrice=89999.00;
  if(flightDestinationName=="Japan") return flightPrice=7700.00;
  else{
  System.out.println(flightDestinationName +"it is not found");
  }
  System.out.println("End of getFlightsPriceByDest");
  return flightPrice;
}
public static double getFlightsPriceByDest(String flightDestinationName,int noOfticket){
 double flightPrice=0.0;
 System.out.println("start of getFlightsPriceByDest");
  if(flightDestinationName=="Mumbai") return flightPrice=7700.00*noOfticket;
  if(flightDestinationName=="Jaipur") return flightPrice=8700.00*noOfticket;
  if(flightDestinationName=="Belagavi") return flightPrice=8000.00*noOfticket;
  if(flightDestinationName=="Benglore") return flightPrice=9000.00*noOfticket;
  if(flightDestinationName=="pune") return flightPrice=8700.00*noOfticket;
  if(flightDestinationName=="Loknow") return flightPrice=9900.00*noOfticket;
  if(flightDestinationName=="Mumbai") return flightPrice=7700.00*noOfticket;
  if(flightDestinationName=="Kolkatta") return flightPrice=6000.00*noOfticket;
  if(flightDestinationName=="patna") return flightPrice=7000.00*noOfticket;
  if(flightDestinationName=="Channai") return flightPrice=5000.00*noOfticket;
  if(flightDestinationName=="kerala") return flightPrice=77000.00*noOfticket;
  if(flightDestinationName=="Dubai") return flightPrice=78000.00*noOfticket;
  if(flightDestinationName=="Dehli") return flightPrice=9000.00*noOfticket;
  if(flightDestinationName=="USA") return flightPrice=77000.00*noOfticket;
  if(flightDestinationName=="Manglore") return flightPrice=60099.00*noOfticket;
  if(flightDestinationName=="Shivmogga") return flightPrice=6600.00*noOfticket;
  if(flightDestinationName=="Goa") return flightPrice=79990.00*noOfticket;
  if(flightDestinationName=="Tailand") return flightPrice=99999.00*noOfticket;
  if(flightDestinationName=="SouthKoria")return flightPrice=89999.00*noOfticket;
  if(flightDestinationName=="Japan") return flightPrice=7700.00*noOfticket;
  else{
  System.out.println(flightDestinationName +"it is not found");
  }
  System.out.println("End of getFlightsPriceByDest");
  return flightPrice;
}
}