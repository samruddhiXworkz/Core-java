class AmazonAccontCreatedRunner{

	public static void main(String[] amazon){
	
		boolean isAmazonAccontCreated=AmazonAccontCreated.createUserAmazonAccount(0,"sam@gmail.com","Sammu123","Sammu123","Sam","kuri");
		
		if(isAmazonAccontCreated==true)
		AmazonAccontCreated.readUserAmazonAccountDetails();
	}
}