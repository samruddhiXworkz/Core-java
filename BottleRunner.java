class  BottleRunner{
  
  public static void main(String bottle[]){
  
    Bottle ref=new Bottle();
	ref.brandName="Bisalari";
	ref.price=120.00;
    System.out.println("the brandName is "+ref.brandName);
	System.out.println("the price is "+ref.price);
	
    Bottle ref1=new Bottle();
	ref1.brandName="Moltin";
	ref1.price=30.00;
    System.out.println("the brandName is "+ref1.brandName);
	System.out.println("the price is "+ref1.price);
	
	Bottle ref2=new Bottle("tupperware",130.00);
	System.out.println("the brandName is "+ref2.brandName);
	System.out.println("the price is "+ref2.price);
	
  }


}
