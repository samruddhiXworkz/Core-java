class KVGBankRunner{
public static void main(String details[]){


    boolean createUserDetails =KVGBank.createUserDetails("sam","Raj","kuri","20/01/2003",0,0,null,"20/02/2090");
	   if(createUserDetails==true)
       KVGBank.readUserDetails();

}



}