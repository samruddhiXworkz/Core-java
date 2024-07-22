 class Linkedln{
	
static String first;
static String last;
static String email;
static String pword;
static String confirm;
static String nation;
static int pin;
static String comp;
static String role;
static String ind;
static String edu;

public static boolean createLinkedlnAccount(String firstName, String lastName,String emailId, String pwd,String confirmPwd,String country,int pinCode,String company, String title, String industry,String education){
	
	boolean isLinkedlnCreated = false;
	boolean isFirstNameValid=false;
	boolean isLastNameValid=false;
	boolean isEmailIdValid=false;
	boolean isPwdValid=false;
	boolean isConfirmPwdValid=false;
	boolean isCountryValid=false;
	boolean isPincodeValid=false;
	boolean isCompanyValid=false;
	boolean isTitleValid=false;
	boolean isIndustryValid=false;
	boolean isEducationValid=false;
	if(firstName!=null){
	first = firstName;
	isFirstNameValid=true;
	}else
		System.out.println("the first name Invalid");
	if(lastName!=null){
	last = lastName;
	isLastNameValid=true;
	}else
		System.out.println("the last name Invalid");
	if(emailId!=null){
	email = emailId;
	isEmailIdValid=true;
	}else
		System.out.println("the emailId Invalid");
	if(pwd!=null){
	pword = pwd;
	isPwdValid=true;
	}else
		System.out.println("the pword is Invalid");
	if(confirmPwd!=null){
	confirm = confirmPwd;
	isConfirmPwdValid=true;
	}else
		System.out.println("the confirmPwd is Invalid");
	if(country!=null){
	nation = country;
	isCountryValid=true;
	}else
		System.out.println("the country is Invalid");
	if(pinCode!=0){
	pin = pinCode;
	isPincodeValid=true;
	}else
		System.out.println("the pinCode invalid");
	if(company!=null){
	comp = company;
	isCompanyValid=true;
	}else
		System.out.println("the company is Invalid");
	if(title!=null){
	role = title;
	isTitleValid=true;
	}else
		System.out.println("the Title is Invalid");
	if(industry!=null){
	ind = industry;
    isIndustryValid=true;
	}else
		System.out.println("the education is Invalid");
	if(education!=null){
	edu = education;
	isEducationValid=true;
	}else
		System.out.println("the Education is Invalid");
	if(isFirstNameValid==true && isLastNameValid==true && isEmailIdValid==true && isPwdValid==true &&isConfirmPwdValid==true && isCountryValid==true && isPincodeValid==true && isCompanyValid==true &&isTitleValid==true && isEducationValid==true)
	isLinkedlnCreated = true;
	return isLinkedlnCreated;
}
    
	public static void readLinkedlnAccount(){
		
		System.out.println("details...");
		System.out.println("First Name:"+first);
		System.out.println("Last Name:"+last);
		System.out.println("email Id:"+email);
		System.out.println("Password:"+pword);
		System.out.println("Confirm Password:"+confirm);
		System.out.println("Country:"+nation);
		System.out.println("Pin Code:"+pin);
		System.out.println("Company:"+comp);
		System.out.println("Title:"+role);
		System.out.println("Industry:"+ind);
		System.out.println("Education:"+edu);
		
	
}
}