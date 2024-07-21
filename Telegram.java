class Telegram{
   static String mail;
   static String userName;
   static long phoneNum;
   static String pwd;
   static String conformpwd;
   public static boolean CreateUserDetais(String email,String userN,long mobileNum,String password,String conformpassword){
   
   boolean isTelegram=false;
   mail=email;
   userName=userN;
   phoneNum=mobileNum;
   pwd=password;
   conformpwd=conformpassword;
   isTelegram=true;
   return isTelegram;
   }

public static void readDetails(){
	System.out.println("The user emailIdis "+mail);
	System.out.println("The user userName is "+userName);

	System.out.println("The user mobileNumber is "+phoneNum);

	System.out.println("The user password is "+pwd);
	System.out.println("The user conformpassword is "+conformpwd);

}

}