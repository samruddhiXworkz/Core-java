class JioRechargeRunner{
public static void main(String jio[]){
 System.out.println("The main Started");
      String name="28Days with 1.5GB/day";
	  int noOfPack=3;
      double price =JioRecharge.getJioPricePlan(name);
      System.out.println("the price for"+name+" is "+price);
	  System.out.println("number of no Of pack is"+noOfPack);
     System.out.println("number of total pack is"+price*noOfPack);
 System.out.println("The main Ended");

}

}