
class JuicePointRunner{
public static void main(String juice[]){
System.out.println("main Started");
  boolean addJuice=JuicePoint.addJuiceName("Mango juice");
  System.out.println("the juice added "+addJuice);
    addJuice=JuicePoint.addJuiceName("Stobarry Juice");
	System.out.println("the juice added "+addJuice);
	addJuice=JuicePoint.addJuiceName("Apple Juice");
	System.out.println("the juice added "+addJuice);
	addJuice=JuicePoint.addJuiceName("Grapes Juice");
	System.out.println("the Juice added "+addJuice);
	addJuice=JuicePoint.addJuiceName("chikku juice");
	System.out.println("teh juice added "+addJuice);
	addJuice=JuicePoint.addJuiceName("DryFruit Juice");
	System.out.println("the juice added "+addJuice);
	addJuice=JuicePoint.addJuiceName("paluda");
	System.out.println("the juice added"+addJuice);
	addJuice=JuicePoint.addJuiceName("jamun juice");
	System.out.println("the juice added"+addJuice);
 JuicePoint.showDetails();
 
    boolean updateJuice=JuicePoint.updateJuiceName("Mango juice","papaya Juice");
	System.out.println("the juice name is updated "+updateJuice);
	JuicePoint.showDetails();
	
	boolean deleteJuice=JuicePoint.deleteJuiceName("chikku juice");
	System.out.println("the juice name delete"+deleteJuice);
	JuicePoint.showDetails();
System.out.println("main Ended");

}


}