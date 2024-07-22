class AmazonAccontCreated{
  static String givenName;
  static String surname;
  static long phoneNumber;
  static String mailId;
  static String password;
  static String conformPassword;
  public static boolean createUserAccount(String name,String lastname,long mobileNumber,String emailId,String pwd,String conformPwd){
  boolean isAmazonAccontCreated=false;
  boolean isNameValid=false;
  boolean isLastNameValid=false;
  boolean isMobileNumberValid=false;
  boolean isEmailIdValid=false;
  boolean isPwdValid=false;
  boolean isConformValid=false;
  if(name!=null){
  givenName=name;
  isNameValid=true;
  }else
  System.out.println("the name is Invalid");
  if(lastname!=null){
  surname=lastname;
  isLastNameValid=true;
  }else
	  System.out.println("the last name Invalid");
  if(mobileNumber!=0){
  phoneNumber=mobileNumber;
  isMobileNumberValid=true;
  }else
	  System.out.println("The mobile number Invalid");
  if(emailId!=null){
  mailId=emailId;
  isEmailIdValid=true;
  }else
	  System.out.println("the mailId is Invalid");
  if(pwd!=null){
  password=pwd;
  isPwdValid=true;
  }else
	  System.out.println("the password is invalid");
  if(conformPwd!=null){
  conformPassword=conformPwd;
  isConformValid=true;
  }else
	  System.out.println("the conformPassword is invalid");

  isAmazonAccontCreated=true;
  return isAmazonAccontCreated;
   
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