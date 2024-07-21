class RestaurantJobRegister{

    static String name;
	static String surname;
	static String address;
	static String city;
	static String state;
	static String emailId;
	static long mobileNum;
 public static boolean createUserDetails(String fname,String lname,String add,String cit,String st,String mail,long phoneNum){
 
   boolean isRestaurantJobRegister=false;
    name=fname;
	surname=lname;
	address=add;
	city=cit;
	state=st;
	emailId=mail;
	mobileNum=phoneNum;
    isRestaurantJobRegister=true;
	return isRestaurantJobRegister;
 }
public static void readDeatails(){

    System.out.println("feathing user details ..");
    System.out.println("feathing user fName is .."+name);
    System.out.println("feathing user lName is .."+surname);
    System.out.println("feathing user add is .."+address);
    System.out.println("feathing user cit is .."+city);
    System.out.println("feathing user mail is .."+emailId);
    System.out.println("feathing user phoneNum is .."+mobileNum);




}


}