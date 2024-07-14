class PVR{
	
 public static double getMoviePricebyName(String movieName){
	 
	 double moviePrice = 0.0;
	 System.out.println("getMoviePricebyName started");
	 
   if(movieName == "Ramayana"){
    moviePrice = 380.80;
	return moviePrice;
   }
  
  else if(movieName == "Dil ne pir yaad kiya"){
    moviePrice = 470.00;
	return moviePrice;
   }
  
  else if(movieName == "Kalki"){
	  moviePrice = 300.00;
	  return moviePrice;
   }
  
  else if(movieName == "baahubalo"){
	  moviePrice = 400.00;
	  return moviePrice;
  }
  
  else if(movieName == "RRR"){
	  moviePrice = 500.98;
	  return moviePrice;
  }
  
  else if(movieName == "Saptha Sagaradhache ello"){
	  moviePrice = 530.00;
	  return moviePrice;
  }
  
  else if(movieName == "Mithwa"){
	  moviePrice = 790.00;
	  return moviePrice;
  }
  
  else if(movieName == "KGF"){
	  moviePrice = 360.00;
	  return moviePrice;
  }
  
  else if(movieName == "KGF 2"){
	  moviePrice = 400.00;
	  return moviePrice;
  }
  
  else if(movieName == "Kateera"){
	  moviePrice = 309.98;
	  return moviePrice;
  }
  
  else if(movieName == "Tiger") {
	  moviePrice = 950.45;
	  return moviePrice;
  }
  
  else if(movieName == "hum aapake hai kon"){
	  moviePrice = 750.00;
	  return moviePrice;
  }
  
  else if(movieName == "Kantara"){
	  moviePrice = 490.34;
	  return moviePrice;
  }
  
  else if(movieName == "Mr Madhimaye"){
	  moviePrice = 400.00;
	  return moviePrice;
  }
  
  else if(movieName == "Harata"){
	  moviePrice = 399.45;
	  return moviePrice;
  }
  
  else if(movieName == "Adhipatra"){
	  moviePrice = 300.45;
	  return moviePrice;
  }
  
  else if(movieName == "Ms Dhoni"){
	  moviePrice = 492.45;
	  return moviePrice;
  }
  
  else if(movieName == "My Name is Khan"){
	  moviePrice = 990.95;
	  return moviePrice;
  }
  
  else if(movieName == "Mission Raniganj"){
	  moviePrice = 540.45;
	  return moviePrice;
  }
  
  else if(movieName == "Kabil"){
	  moviePrice = 999.45;
	  return moviePrice;
  }
  
  else{
  System.out.println(movieName + "Not found");
  }
  
  System.out.println("getMoviePricebyName Ended");
  return moviePrice;
  
  }
  
}