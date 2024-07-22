class SpotifyRunner{

	public static void main(String[] run){
		
		boolean createAccount=Spotify.createAccount("null", "null", "null", "null", "null");
		
		if(createAccount=true)
		Spotify.readData();
	}
}