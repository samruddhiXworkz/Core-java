class MedicalStore{

static String medicineNames[]={null,null,null,null,null,null,null,null,null};
static int start;

public static boolean addMadicineName(String medicineName){
 boolean isAddMedicineNameValid=false;
 if(start<medicineNames.length){
 if(medicineName!=null){
 medicineNames[start++]=medicineName;

 }else
 System.out.println("the medicineName is Invalid");
 }else
	 System.out.println("the medicineNames are full");
 isAddMedicineNameValid=true;
 return isAddMedicineNameValid;
} 

public static void showDetails(){
   for(String medicineName:medicineNames){
   System.out.println(medicineName);
   
   }

}
  

}