class SangeetaMobilesRunner{
public static void main(String sangeeta[]){
 System.out.println("the main is started");
 String name="Samsung Galaxy A15";
 int noofphone=5;
 double price=SangeetaMobiles.getMobilePriceByBrand(name);
 System.out.println("the price for "+name+" is "+price);
 System.out.println("the Number of phones is "+noofphone);
 System.out.println("the Food item total price  is"+noofphone*price);
 
 System.out.println("the main is ended");

}

}