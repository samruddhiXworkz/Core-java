class JioRechargeRunner{
public static void main(String jio[]){
 System.out.println("The main Started");
      String name="28Days with 1.5GB/day";
      double price =JioRecharge.getJioPricePlan(name);
      System.out.println("the price for"+name+" is "+price);
 System.out.println("The main Ended");

}

}