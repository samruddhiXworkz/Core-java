class MeshoAccontCreated{
  static String givenName;
  static String surname;
  static long phoneNumber;
  static String mailId;
  static String password;
  static String conformPassword;
  public static boolean createUserAccount(String name,String lastname,long mobileNumber,String emailId,String pwd,String conformPwd){
  boolean isMeshoAccontCreated=false;
  givenName=name;
  surname=lastname;
  phoneNumber=mobileNumber;
  mailId=emailId;
  password=pwd;
  conformPassword=conformPwd;

  isMeshoAccontCreated=true;
  return isMeshoAccontCreated;
   
  }
 public static void readUserAccountDeatails(){
 
 	System.out.println("Feating...user Details..");	
	System.out.println("The user name is "+givenName);
    System.out.println("The user lastname is "+surname);
	System.out.println("The user mobileNumber is "+phoneNumber);
	System.out.println("The user emailIdis "+mailId);
	System.out.println("The user pwd is "+password);
	System.out.println("The user conformPwd is "+conformPassword);
	
	

 
 
 }

}