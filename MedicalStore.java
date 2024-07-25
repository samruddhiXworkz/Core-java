import java.util.Arrays;
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
 public static boolean updateMedicineName(String oldMedicineName,String newMedicineName){
	 boolean isAddMedicineNameUpdate=false;
	 for(int position=0;position<medicineNames.length;position++){
		 if(medicineNames[position]==oldMedicineName){
			 medicineNames[position]=newMedicineName;
			 isAddMedicineNameUpdate=true;
		 }
	 }
	if(isAddMedicineNameUpdate==false)
    System.out.println(oldMedicineName+"not found");
    System.out.println("the medicineName is update");
	return isAddMedicineNameUpdate;
 }
 public static boolean deleteMedicinName(String medicineName){
	boolean isMedicineNameDelete=false;
	int position,newPosition;
	for(position=0 ,newPosition=0;position<medicineNames.length;position++){
		if(medicineNames[position]!=medicineName){
			medicineNames[newPosition]=medicineNames[position];
			 newPosition++;
			 System.out.println(newPosition);
		}else
			isMedicineNameDelete=true;
	}
	int newLength=newPosition;
	System.out.println(newLength);
	medicineNames=Arrays.copyOf(medicineNames,newLength);
    if(isMedicineNameDelete==false){
    System.out.println(medicineName+"medicineNames");	
}
   return isMedicineNameDelete;
}

}