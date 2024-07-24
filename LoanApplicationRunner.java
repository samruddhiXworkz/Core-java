class LoanApplicationRunner{

    public static void main(String[]loan){
		
		System.out.println("Main Started");
		boolean isLoanCreated=LoanApplication.createLoanAccount(null,"houseloan",null,"kvg","0 intrest","two");
		if(isLoanCreated == true)
		LoanApplication.readLoanAccount();
		System.out.println("Main ended");
	}
}