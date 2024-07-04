class Swiggy{
//Arrays Declaration
static String nonVegStarter[]={"ChikenSpringroll","FishPokara","Soups","omelet","egg65","chiken65","kabab","chikenpatties","meatballs","chilliprawns"};
static String vegStarter[]={"samosa","cottagecheese","paneerTikka","harabarakabab","mashroom","dahipuri","gobimanchori","Nodles","friedrice","kachori"};
static String nonVegMainCources[]={"FishPokarga","nihariRecipe","muttonsoup","goatcurry","muttonkarahi","keemacurry","muttonBiryani","shamikabab","chikenmakani","chikenTikka"};
static String vegMainCources[]={"LemonRice","gujaratikadi","panner","uraddaal","daalkari","Roti","saagPaneer","nimonapaneer","motorpaneer","fulav"};


 public static void main(String swiggy[]){
	 System.out.println("Main Started");
	 System.out.println("Welcome to Swiggy ");
	 System.out.println("------------");
	 
	  for(String foodName:nonVegStarter){
			 System.out.println(foodName);
		 }
	  for(String foodName:vegStarter){
			 System.out.println(foodName);
		 }
      for(String foodName:nonVegMainCources){
			 System.out.println(foodName);
		 }
	  for(String foodName:vegMainCources){
			 System.out.println(foodName);
		 }	 

	 System.out.println("Main Ended");

 }
}