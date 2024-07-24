class SpotifyRunner{

	public static void main(String[] run){
		
		boolean createAccount=Spotify.createAccount(null, "sam@123", "samu", "20/01/2003s", null);
		
		if(createAccount==true)
		Spotify.readData();
	}
}

   
   

