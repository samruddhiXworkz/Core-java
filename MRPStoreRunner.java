class MRPStoreRunner{
public static void main(String alchols[]){
  System.out.println("main started");
  boolean addAlchool=MRPStore.addAlcholName("Rum");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("whisky");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("gin");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("soju");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("Vodka");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("Brandy");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("sigani");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("tequila");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("Beer");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("cognac");
  System.out.println("alchol added"+addAlchool);
  addAlchool=MRPStore.addAlcholName("Champange");
  System.out.println("alchol added"+addAlchool);
  MRPStore.showDetails();
  boolean updatealchol=MRPStore.updateAlcholName("Brandy","golden green");
  System.out.println("updatealchol"+updatealchol);
  MRPStore.showDetails();
  boolean deletealchol=MRPStore.deleteAlcholName("golden green");
  System.out.println("deleteAlchol"+deletealchol);
  MRPStore.showDetails();
  System.out.println("main ended");

}


}