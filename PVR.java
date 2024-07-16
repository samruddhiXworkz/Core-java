class PVR{
	
 public static double getMoviePricebyName(String movieName){
	 
	 double moviePrice = 0.0;
	 System.out.println("getMoviePricebyName started");
	 
   if(movieName == "Ramayana")return moviePrice= 380.80;
   if(movieName == "Dil ne pir yaad kiya")return moviePrice= 470.00;
   if(movieName == "Kalki") return moviePrice= 300.00;
   if(movieName == "baahubalo") return moviePrice= 400.00;
   if(movieName == "RRR")  return moviePrice= 500.98;
   if(movieName == "Saptha Sagaradhache ello")return moviePrice= 530.00;
   if(movieName == "Mithwa") return moviePrice= 790.00;
   if(movieName == "KGF") return moviePrice = 360.00;
   if(movieName == "KGF 2") return moviePrice= 400.00;
   if(movieName == "Kateera") return moviePrice= 309.98;
   if(movieName == "Tiger") return moviePrice= 950.45;
   if(movieName == "hum aapake hai kon") return moviePrice= 750.00;
   if(movieName == "Kantara")return moviePrice= 490.34;
   if(movieName == "Mr Madhimaye")return moviePrice= 400.00;
   if(movieName == "Harata") return moviePrice = 399.45;
   if(movieName == "Adhipatra") return moviePrice= 300.45;
   if(movieName == "Ms Dhoni") return moviePrice= 492.45;
   if(movieName == "My Name is Khan") return moviePrice= 990.95;
   if(movieName == "Mission Raniganj")return moviePrice= 540.45;
   if(movieName == "Kabil") return moviePrice = 999.45;
  else{
  System.out.println(movieName + "Not found");
  }
  
  System.out.println("getMoviePricebyName Ended");
  return moviePrice;
  
  }
  public static double getMoviePricebyNoofTicket(String movieName,int noOfTicket){
	 
	 double moviePrice = 0.0;
	 System.out.println("getMoviePricebyName started");
	 
   if(movieName == "Ramayana")return moviePrice= 380.80*noOfTicket;
   if(movieName == "Dil ne pir yaad kiya")return moviePrice= 470.00*noOfTicket;
   if(movieName == "Kalki") return moviePrice= 300.00*noOfTicket;
   if(movieName == "baahubalo") return moviePrice= 400.00*noOfTicket;
   if(movieName == "RRR")  return moviePrice= 500.98*noOfTicket;
   if(movieName == "Saptha Sagaradhache ello")return moviePrice= 530.00*noOfTicket;
   if(movieName == "Mithwa") return moviePrice= 790.00*noOfTicket;
   if(movieName == "KGF") return moviePrice = 360.00*noOfTicket;
   if(movieName == "KGF 2") return moviePrice= 400.00*noOfTicket;
   if(movieName == "Kateera") return moviePrice= 309.98*noOfTicket;
   if(movieName == "Tiger") return moviePrice= 950.45*noOfTicket;
   if(movieName == "hum aapake hai kon") return moviePrice= 750.00*noOfTicket;
   if(movieName == "Kantara")return moviePrice= 490.34*noOfTicket;
   if(movieName == "Mr Madhimaye")return moviePrice= 400.00*noOfTicket;
   if(movieName == "Harata") return moviePrice = 399.45*noOfTicket;
   if(movieName == "Adhipatra") return moviePrice= 300.45*noOfTicket;
   if(movieName == "Ms Dhoni") return moviePrice= 492.45*noOfTicket;
   if(movieName == "My Name is Khan") return moviePrice= 990.95*noOfTicket;
   if(movieName == "Mission Raniganj")return moviePrice= 540.45*noOfTicket;
   if(movieName == "Kabil") return moviePrice = 999.45*noOfTicket;
  else{
  System.out.println(movieName + "Not found");
  }
  
  System.out.println("getMoviePricebyNoofTicket Ended");
  return moviePrice;
  
  }
  
}
  
