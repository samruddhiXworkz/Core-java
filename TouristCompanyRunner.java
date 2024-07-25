class TouristCompanyRunner{
public static void main(String tourest[]){
  System.out.println("main started");
   boolean addTourist=TouristCompany.addTouristName("kedarnath");
   System.out.println("the tourest added"+addTourist);
   addTourist=TouristCompany.addTouristName("Badarinath");
   System.out.println("the tourest added"+addTourist);
   addTourist=TouristCompany.addTouristName("Honnavar");
   System.out.println("the tourest added"+addTourist);
    addTourist=TouristCompany.addTouristName("Dandali");
   System.out.println("the tourest added"+addTourist);
   addTourist=TouristCompany.addTouristName("Mysure");
   System.out.println("the tourest added"+addTourist);
   addTourist=TouristCompany.addTouristName("adiyogi");
   System.out.println("the tourest added"+addTourist);
   addTourist=TouristCompany.addTouristName("manali");
   System.out.println("the tourest added"+addTourist);
    addTourist=TouristCompany.addTouristName("Rayagad");
   System.out.println("the tourest added"+addTourist);
    addTourist=TouristCompany.addTouristName("jagannat");
   System.out.println("the tourest added"+addTourist);
    addTourist=TouristCompany.addTouristName("jyothirling");
   System.out.println("the tourest added"+addTourist);
   TouristCompany.showDetails();
   boolean updateTourust=TouristCompany.updateTourustName("jagannat","Tirupati");
   System.out.println("the update Tourust"+updateTourust);
   TouristCompany.showDetails();
   boolean deleteTourust=TouristCompany.deleteTourustName("Honnavar");
   System.out.println("the delete Tourust"+deleteTourust);
   TouristCompany.showDetails();
  System.out.println("main started");


}


}