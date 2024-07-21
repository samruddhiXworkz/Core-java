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
	name=fname;
	fatherName=mname;
	surname=lname;
	dob=dateofbirth;
	adharNum=adhar;
	mobileNum=phoneNum;
	address=add;
	date=dt;
	isKVGBank=true;
	return isKVGBank;
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