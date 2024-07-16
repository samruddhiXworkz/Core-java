class NandiniParlourRunner{
public static void main(String nandini[]){
System.out.println("main started");
String name="Paneer";
int noOfProduct=9;
double price=NandiniParlour.getProductPriceByName(name);
System.out.println("the price for"+name+" is "+price);
System.out.println("number of no Of Product is"+noOfProduct);
System.out.println("number of total product is"+price*noOfProduct);


System.out.println("main ended");


}

}