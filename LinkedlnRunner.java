class LinkedlnRunner{

public static void main(String[]job){
	
	System.out.println("Main started");
	boolean createLinkedlnAccount=Linkedln.createLinkedlnAccount("null","null","null","null","null","null",0,"null","null","null","null");
	if(createLinkedlnAccount=true)
	Linkedln.readLinkedlnAccount();
	System.out.println("Main ended");
}
}