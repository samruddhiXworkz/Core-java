class KVGBank{
  static String  name;
  static String  fatherName;
  static String surname;
  static String dob;
  static long adharNum;
  static long mobileNum;
  static String address;
  static String date;
  public static boolean createUserDetails(String fname,String mname,String lname,String dateofbirth,long adhar,long phoneNum,String add,String dt){
	boolean isKVGBank=false;
    boolean isValidUserDetailsValid=validUserDeatails(fname,mname,lname,dateofbirth,adhar,phoneNum,add,dt);
	
	return isKVGBank;
  }
  public static boolean validUserDeatails(String fname,String mname,String lname,String dateofbirth,long adhar,long phoneNum,String add,String dt){
	boolean isValidUserDetailsValid=false;
	boolean isfnameValid=false;
	boolean ismnameValid=false;
	boolean islnameValid=false;
	boolean isdateofbirthValid=false;
	boolean isadharValid=false;
	boolean isphoneNumValid=false;
	boolean isaddValid=false;
	boolean isdtValid=false;

    if(fname!=null){
	name=fname;
	isfnameValid=true;
	}else
		System.out.println("the First name is  Invalid");
	if(mname!=null){
	fatherName=mname;
	ismnameValid=true;
	}else
		System.out.println("the Middle name is Invalid");
	if(lname!=null){
	surname=lname;
	islnameValid=true;
	}
	else
		System.out.println("The Last name is Invalid");
	if(dateofbirth!=null){
	dob=dateofbirth;
	isdateofbirthValid=true;
	}else
		System.out.println("the dateofbirth is Invalid");
	if(adhar!=0){
	adharNum=adhar;
	isadharValid=true;
	}else
		System.out.println("the adhar is invalid");
	if(phoneNum!=0){
	mobileNum=phoneNum;
	isphoneNumValid=true;
	}else
		System.out.println("the Phone number is Invalid");
	if(add!=null){
	address=add;
	isaddValid=true;
	}else
		System.out.println("the address is Invalid");
	if(dt!=null){
	date=dt;
	isdtValid=true;
	}else
		System.out.println("the date is invalid");
	
	  if(isfnameValid==true&& ismnameValid==true&& islnameValid==true&&isdateofbirthValid==true&&isadharValid==true&&isaddValid==true&&isdtValid==true&&isphoneNumValid==true){
	  isValidUserDetailsValid=true;
	  }  	  
	return isValidUserDetailsValid;  
	  
  }
  
  public static void readUserDetails(){
  
   System.out.println("feathing user details ..");
    System.out.println("feathing user fName is .."+name);
    System.out.println("feathing user mName is .."+fatherName);
	System.out.println("feathing user lname is .."+surname);
    System.out.println("feathing user dateofbirth is .."+dob);
	System.out.println("feathing user add is .."+address);
    System.out.println("feathing user adhar is .."+adharNum);
    System.out.println("feathing user phoneNum is .."+mobileNum);
  
  
  }
  


}