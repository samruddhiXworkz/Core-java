class InsurancePackageRunner{
  public static void main(String args[]){
  System.out.println("The main started");
      String insuranceName="Max Life";
      double price =InsurancePackage.find(insuranceName);
      System.out.println("the price is"+price);
   System.out.println("The main ended");

  }


}