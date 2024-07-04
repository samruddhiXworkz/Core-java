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
	 //System.out.println("Avalable nonVegStarter are:"+nonVegStarter[0]+ ","+nonVegStarter[1]+ ","+nonVegStarter[2]+ ","+nonVegStarter[3]+ ","+nonVegStarter[4]+ ","+nonVegStarter[5]+ ","+nonVegStarter[6]+ ","+nonVegStarter[7]+ ","+nonVegStarter[8]+ ","+nonVegStarter[9]+ ","+nonVegStarter[10]);
	 //System.out.println("Avalable vegStarter are:"+vegStarter[0]+ ","+vegStarter[1]+ ","+vegStarter[2]+ ","+vegStarter[3]+ ","+vegStarter[4]+ ","+vegStarter[5]+ ","+vegStarter[6]+ ","+vegStarter[7]+ ","+vegStarter[8]+ ","+vegStarter[9]+ ","+vegStarter[10]);
	 //System.out.println("Avalable nonVegMainCources are:"+nonVegMainCources[0]+ ","+nonVegMainCources[1]+ ","+nonVegMainCources[2]+ ","+nonVegMainCources[3]+ ","+nonVegMainCources[4]+ ","+nonVegMainCources[5]+ ","+nonVegMainCources[6]+ ","+nonVegMainCources[7]+ ","+nonVegMainCources[8]+ ","+nonVegMainCources[9]+ ","+nonVegMainCources[10] );
	 //System.out.println("Avalable vegMainCources are:"+vegMainCources[0]+ ","+vegMainCources[1]+ ","+vegMainCources[2]+ ","+vegMainCources[3]+ ","+vegMainCources[4]+ ","+vegMainCources[5]+ ","+vegMainCources[6]+ ","+vegMainCources[7]+ ","+vegMainCources[8]+ ","+vegMainCources[9]+ ","+vegMainCources[10]);
      
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