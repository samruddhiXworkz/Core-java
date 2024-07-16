class InsurancePackageRunner{
  public static void main(String args[]){
  System.out.println("The main started");
      String insuranceName="Max Life";
	  int noOfWeek=5;
      double price =InsurancePackage.find(insuranceName);
      System.out.println("the price is"+price);
	 System.out.println("number of no Of week is"+noOfWeek);
     System.out.println("number of total week is"+price*noOfWeek);
   System.out.println("The main ended");

  }


}