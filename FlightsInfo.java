class FlightsInfo{
public static double getFlightsPriceByDest(String flightDestinationName){
 double flightPrice=0.0;
 System.out.println("start of getFlightsPriceByDest");
  if(flightDestinationName=="Mumbai"){
  flightPrice=7700.00;
  return flightPrice;
  }
  
  if(flightDestinationName=="Jaipur"){
  flightPrice=8700.00;
  return flightPrice;
  }
  if(flightDestinationName=="Belagavi"){
  flightPrice=8000.00;
  return flightPrice;
  }
  if(flightDestinationName=="Benglore"){
  flightPrice=9000.00;
  return flightPrice;
  }
  if(flightDestinationName=="pune"){
  flightPrice=8700.00;
  return flightPrice;
  }
  if(flightDestinationName=="Loknow"){
  flightPrice=9900.00;
  return flightPrice;
  }
  if(flightDestinationName=="Mumbai"){
  flightPrice=7700.00;
  return flightPrice;
  }
  if(flightDestinationName=="Kolkatta"){
  flightPrice=6000.00;
  return flightPrice;
  }
  if(flightDestinationName=="patna"){
  flightPrice=7000.00;
  return flightPrice;
  }
  if(flightDestinationName=="Channai"){
  flightPrice=5000.00;
  return flightPrice;
  }
  if(flightDestinationName=="kerala"){
  flightPrice=77000.00;
  return flightPrice;
  }
  if(flightDestinationName=="Dubai"){
  flightPrice=78000.00;
  return flightPrice;
  }
  if(flightDestinationName=="Dehli"){
  flightPrice=9000.00;
  return flightPrice;
  }
  if(flightDestinationName=="USA"){
  flightPrice=77000.00;
  return flightPrice;
  }
  if(flightDestinationName=="Manglore"){
  flightPrice=60099.00;
  return flightPrice;
  }
  if(flightDestinationName=="Shivmogga"){
  flightPrice=6600.00;
  return flightPrice;
  }
  if(flightDestinationName=="Goa"){
  flightPrice=79990.00;
  return flightPrice;
  }
  if(flightDestinationName=="Tailand"){
  flightPrice=99999.00;
  return flightPrice;
  }
  if(flightDestinationName=="SouthKoria"){
  flightPrice=89999.00;
  return flightPrice;
  }
  if(flightDestinationName=="Japan"){
  flightPrice=7700.00;
  return flightPrice;
  }
  else{
  System.out.println(flightDestinationName +"it is not found");
  }
  System.out.println("End of getFlightsPriceByDest");
  return flightPrice;
}
}