class UberEatsRunner{

	public static void main(String eats[]){
	
		System.out.println("Main Started");
			
			String name="Manchori";
			int qty=2;
		
			double price=UberEats.search(name);
			
			System.out.println("The food name is:"+name);
			System.out.println("The food quantity  is:"+qty);
			System.out.println("The tota  food price is:"+qty*price);
			
		System.out.println("Main Ended");
	}
}