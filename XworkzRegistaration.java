class XworkzRegistaration{
   static String name;
   static String fathername;
   static String surname;
   static String dob;
   static String caste;
   static int percent;
   static String date0fSubmission;
 
 public static boolean createStudent(String firstName,String middleName,String lastname,String dateOfBirth,String relign,String date){
   boolean isXworkzRegistaration=false;
   boolean isFirstNameValid=false;
   boolean isMiddleNameValid=false;
   boolean isLastNameValid=false;
   boolean isDateOfBirthValid=false;
   boolean isRelignValid=false;

   boolean isDateValid=false;
   if(firstName!=null){
    name=firstName;
	isFirstNameValid=true;
   }else
	   System.out.println("the First Name is Invalid");
   if(middleName!=null){
	fathername=middleName;
	isMiddleNameValid=true;
	}else
	   System.out.println("the middle Name is Invalid");
   if(lastname!=null){
	surname=lastname;
    isLastNameValid=true;
	}else
	   System.out.println("the last Name is Invalid");
   
     if(dateOfBirth!=null){
	dob=dateOfBirth;
	isDateOfBirthValid=true;
	}else
	   System.out.println("the Date of birth is Invalid");
    if(relign!=null){
	caste=relign;
	isRelignValid=true;
	}else
	   System.out.println("the relign is Invalid");
   if(date!=null){
	date0fSubmission=date;
	isDateValid=true;
	}else
	   System.out.println("the Date is Invalid");
   
	isXworkzRegistaration=true;
	return isXworkzRegistaration;
 
 }
  public static void readDetails(){
  System.out.println("feathing student details ..");
  System.out.println("feathing student firstName is .."+name);
  System.out.println("feathing student middleName .."+fathername);
  System.out.println("feathing student lastname is .."+surname);
  System.out.println("feathing student dateOfBirth is  .."+dob);
  System.out.println("feathing student relign is .."+caste);
  System.out.println("feathing student date is.."+date0fSubmission);

  
  
  
  }


}