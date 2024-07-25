class TeaPointRunner{


public static void main(String[] teaname){

   System.out.println("The main Started");
   boolean addTea=TeaPoint.addTeaName("ilachi Tea");
   System.out.println("the tea added is "+addTea);
     
     addTea=TeaPoint.addTeaName("gingerTea");
	 System.out.println("tea name added "+addTea);
	 
     addTea=TeaPoint.addTeaName("ayrvedic Tea");
	 System.out.println("tea name added"+addTea);
	 addTea=TeaPoint.addTeaName("green tea");
	 System.out.println("tea name added "+addTea);
	 
	 addTea=TeaPoint.addTeaName("chocklate tea");
	 System.out.println("tea name is added "+addTea);
	 
	 addTea=TeaPoint.addTeaName("lemon Tea");
	 System.out.println("tea name is added "+addTea);
	 
	 addTea=TeaPoint.addTeaName("clasic");
	 System.out.println("tea name is added "+addTea);
	 
	 
    TeaPoint.showTeaNames();
	boolean updateTea=TeaPoint.updateTeaName("masala tea", "chocklate tea");
	System.out.println("update Tea name added"+updateTea);
    TeaPoint.showTeaNames();
	
	boolean deleteTea=TeaPoint.deleteTeaName("lemon Tea");
	System.out.println("tea name is deleted"+deleteTea);
	TeaPoint.showTeaNames();
   System.out.println("The main Ended");



}


}