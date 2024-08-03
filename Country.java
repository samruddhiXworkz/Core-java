class Country{
  int countryId;
  int noOfStates;
  String primeMinister;
  String population;

   public Country(){
	   System.out.println("the object Created ");
	   
   }
   public Country(int countryId,int noOfStates,String primeMinister,String population){
	    this.countryId=countryId;
        this.noOfStates=noOfStates;
        this.primeMinister =primeMinister;
		this.population = population;
   }
   public void getCountryDetails(){
   		System.out.println("Country's generated");
		System.out.println("Country Id of Germany is " + this.countryId);
		System.out.println("Number of States in Germany is " + this.noOfStates);
		System.out.println("Prime Minister in Germany is " + this.primeMinister);
		System.out.println("Population in Germany is " + this.population);
		System.out.println("Main Ended");
   }
   
   
}