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
}