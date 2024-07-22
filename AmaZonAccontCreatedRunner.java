class AmazonAccontCreatedRunner{



public static void main(String amazon[]){
     boolean createUserAccount = AmazonAccontCreated.createUserAccount("null","null",0,"null","null","null");
	   
	   if(createUserAccount=true)
	   AmazonAccontCreated.readUserAccountDeatails();



}
}