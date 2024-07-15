class SwiggyRunner{
 public static void main(String food[]){
 System.out.println("Main started");
 String name="Maggi";
 int qnty=7;
 double price=Swiggy.getFoodPricebyName(name);
 System.out.println("the price for"+name +"is"+price);
 System.out.println("the quantity product is "+name);
 System.out.println("the Food item total price  is "+qnty*price);
  System.out.println("Main started");

 }

}