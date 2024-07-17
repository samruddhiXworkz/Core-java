 class GmailDetails {
    public static void main(String[] args) {
        String[] emails = {"sam@gmail.com", "kom@gmail.com" ,"sush@gmail.com","david@gmail.com","nil@gmail.com"};
        String[] names = {"Sam","kom","sush","David","Nilu" };
        String[] dob = {"2020-01-01","2020-02-02", "2020-03-03", "2020-04-04", "2020-05-05","2020-08-21"};
        printDetails(emails, names, dob);
    }
	public static void printDetails(String[] emails, String[] names, String[] dob) {
		    boolean found=false;
			String input="sam@gmail.com";
	        System.out.println("user deatails are:");
			
		     for (int i = 0; i < emails.length; i++) {
            if (emails[i].equalsIgnoreCase(input)) {
                System.out.println("Name: " + names[i]);
                System.out.println("Email: " + emails[i]);
                System.out.println("DOB: " + dob[i]);
				found=true;
				break;	
            }
        }
		if(!found){
		System.out.println("Email not found");
		}
    }
}