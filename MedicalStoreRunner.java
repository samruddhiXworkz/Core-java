class MedicalStoreRunner{

public static void main(String medicine[]){

System.out.println("main started");

boolean addmedicine=MedicalStore.addMadicineName("dolo");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("Omini");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("parasitmol");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("adderal");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("ativan");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("atorvastain");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("insuline glarge");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("nicotine");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("latenoporest");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("Dabigatran");
System.out.println("the medicine added"+addmedicine);
addmedicine=MedicalStore.addMadicineName("mupirocin");
System.out.println("the medicine added"+addmedicine);
MedicalStore.showDetails();
boolean updateMedicine=MedicalStore.updateMedicineName("nicotine","painkiller");
System.out.println("the medicine is updated "+updateMedicine);
MedicalStore.showDetails();
boolean deleteMedicine=MedicalStore.deleteMedicinName("Dabigatran");
System.out.println("the medicine is delete "+deleteMedicine);
MedicalStore.showDetails();
System.out.println("End started");



}

}