class LoanApplicationRunner{

    public static void main(String[]loan){
		
		System.out.println("Main Started");
		boolean isLoanCreated=LoanApplication.createLoanAccount(null,"null","null","null","null","null");
		if(isLoanCreated == true)
		LoanApplication.readLoanAccount();
		System.out.println("Main ended");
	}
}