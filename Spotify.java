 class Spotify{
	
	static String email;
	static String setPassword;
	static String name ;
	static String dob ;
	static String gender;

	public static boolean createAccount(String emailIn, String setPasswordIn, String nameIn , String dobIn , String genderIn){
		System.out.println("Creating account...");
		
		boolean isAccountCreated = false;
		boolean isEmailValid=false;
		boolean isSetPasswordInValid=false;
		boolean isNameInValid=false;
		boolean isDobInValid=false;
        boolean isGenderInValid=false;
        if(emailIn!=null){		
		email = emailIn;
		isEmailValid=true;
		}else
			System.out.println("the Email invalid");
		if(setPasswordIn!=null){
		setPassword = setPasswordIn;
		isSetPasswordInValid=true;
		}else
			System.out.println("the password Invalid");
		if(nameIn!=null){
		name = nameIn;
		isNameInValid=true;
		}else
			System.out.println("the name is Invalid");
		if(dobIn!=null){
		dob = dobIn;
		isDobInValid=true;
		}else
			System.out.println("the dob is invalid");
		if(genderIn!=null){
		gender = genderIn;
	    isGenderInValid=true;
	    }else
		System.out.println("the gender is Invalid");
       if(isEmailValid==true&&isSetPasswordInValid==true&&isNameInValid==true&&isDobInValid==true&& isGenderInValid==true)
		isAccountCreated=true;
		return isAccountCreated;
	}
	
	public static void readData(){
		System.out.println("fetching details...");
		
		System.out.println("email: "+email);
		System.out.println("password: "+setPassword);
		System.out.println("name: "+name); 
		System.out.println("date of birth: "+dob);
		System.out.println("genderIn: "+gender);
		
	}
}
