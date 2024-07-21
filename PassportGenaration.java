class PassportGenaration{
	static String cpvLoc;
	static String dcdrLoc;
	static String nm;
	static String sn;
	static String dateofBirth;
    static String mailId;
	static String  login;
	static String password;
	static String conformPassword;
	static String hintAnswer;
	static String hintQuestion;
	static String captaCode;
	static String ismailIdLoginSame;
	
    public static boolean createUserPassport(String cpvLocation,String dcdrLocation,String name,String surName,String dob,String email,String isEmailLoginSame, String loginId,String pwd,String conformPwd,String hintQues,String hintAns,String capta){
        boolean isPassPortCreated=false;
		   	cpvLoc  =cpvLocation;
			dcdrLoc =dcdrLocation;
			 nm=name;
			 sn=surName;
			 dateofBirth=dob;
			 mailId=email;
			 ismailIdLoginSame=isEmailLoginSame;
			 password=pwd;
			 login=loginId;
			 conformPassword=conformPwd;
			 hintAnswer=hintAnswer;
			 hintQuestion=hintQuestion;
			 captaCode=capta;	
		isPassPortCreated=true;	
		return isPassPortCreated;
}
    public static void readUserPassportDetails(){
	System.out.println("Feating...user Details..");	
	System.out.println("The user cpvLocation is "+cpvLoc);
	System.out.println("The user dcdrLocation is "+dcdrLoc);
	System.out.println("yhe user name is "+nm);
	System.out.println("the user surName is "+sn);
	System.out.println("the user dob is "+dateofBirth);
	System.out.println("the user email is "+mailId);
	System.out.println("the user isEmailLoginSame is "+ismailIdLoginSame);
	System.out.println("the user loginId is "+login);
	System.out.println("the user password is "+password);
	System.out.println("the user conform password is "+conformPassword);
	System.out.println("then user hintQues is "+hintQuestion);
	System.out.println("thr user hintAns is "+hintAnswer);
	System.out.println("the user Capta is "+captaCode);
	
	}


}