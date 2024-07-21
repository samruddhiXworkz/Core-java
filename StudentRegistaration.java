class StudentRegistaration{
   static String name;
   static String fathername;
   static String surname;
   static String mothern;
   static String dob;
   static String caste;
   static String date0fSubmission;
 
 public static boolean createStudent(String firstName,String middleName,String lastname,String motherName,String dateOfBirth,String relign,String date){
   boolean isStudentRegistaration=false;
    name=firstName;
	fathername=middleName;
	surname=lastname;
	mothern=motherName;
	dob=dateOfBirth;
	caste=relign;
	date0fSubmission=date;
	isStudentRegistaration=true;
	return isStudentRegistaration;
 
 }
  public static void readDetails(){
  System.out.println("feathing student details ..");
    System.out.println("feathing student firstName is .."+name);
  System.out.println("feathing student middleName .."+fathername);
  System.out.println("feathing student lastname is .."+surname);
  System.out.println("feathing student motherName is .."+mothern);
  System.out.println("feathing student dateOfBirth is  .."+dob);
  System.out.println("feathing student relign is .."+caste);
  System.out.println("feathing student date is.."+date0fSubmission);

  
  
  
  }


}