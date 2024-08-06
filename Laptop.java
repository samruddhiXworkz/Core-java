class Laptop{
 static String laptopName[]={"hp","Dell","Acer","Apple","lenovo"};
 static int hpPrice=30000;
 static int dellPrice=89009;
 static int acerPrice=290000;
 static int applePrice=87666;
 static int lenovoprice=289090;
 static int keywordPrice=200;
 static int mousePrice=300;
 

 
 
 public static int laptopPrice(String lpname,boolean offerAdded){
 System.out.println("Available Laptops with Offers:");  
 int totalPrice=0;
   if(lpname==laptopName[0]){
	   if(offerAdded==true){
	System.out.println("the offer is added");
	 totalPrice=hpPrice+keywordPrice;
	   }else
   System.out.println("no offer is added");
   System.out.println(hpPrice);	
   }

   else if(lpname==laptopName[1]){
	   if(offerAdded==true){
		 System.out.println("the offer is added");
	 totalPrice=hpPrice+keywordPrice;  
	   }else
   System.out.println("no offer is added");
   System.out.println(dellPrice);	   
	}
    else if(lpname==laptopName[2]){
		 if(offerAdded==true){
		 System.out.println("the offer is added");
	 totalPrice=hpPrice+keywordPrice;  
	   }else
   System.out.println("no offer is added");
   System.out.println(acerPrice);	   
	}
    else if(lpname==laptopName[3]){
		 if(offerAdded==true){
		 System.out.println("the offer is added");
	 totalPrice=hpPrice+keywordPrice;  
	   }else
   System.out.println("no offer is added");
   System.out.println(applePrice);	   
	}
 
    else if(lpname==laptopName[4]){
		 if(offerAdded==true){
		 System.out.println("the offer is added");
	 totalPrice=hpPrice+keywordPrice;  
	   }else
   System.out.println("no offer is added");
   System.out.println(lenovoprice);	   
	}
return totalPrice;
 }
}