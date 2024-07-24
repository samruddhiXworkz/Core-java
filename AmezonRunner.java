class AmezonRunner{

public static void main(String product[]){
System.out.println("the main started");
   boolean addProduct=Amezon.addProductName("Mobile");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("laptop");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("FaceCream");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("faceWash");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("Alexa");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("Drone Camera");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("Shoe");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("Stove");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("Kurta");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("Watch");
   System.out.println("the addProduct "+addProduct);
   addProduct=Amezon.addProductName("EarRing");
   System.out.println("the addProduct "+addProduct);
   
   
 Amezon.readDetails();
System.out.println("the main ended");

}


}