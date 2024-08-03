class Bank{

   int id;
   String managerName;
   String name;
   String branchName;
   String ifscCode;
   String swiftCode;
   int noOfWorker;
   
   public Bank(){
	   System.out.println("The Object is created");
   }
  public Bank(int id,String managerName,String branchName,String name,String ifscCode,String swiftCode,int noOfWorker){
	  
	this.id=id;
	this.managerName=managerName;
	this.branchName=branchName;
	this.name =name;
	this.ifscCode=ifscCode;
	this.swiftCode=swiftCode;
	this.noOfWorker=noOfWorker;
	  
  }
   public void getBankDetails(){
	System.out.println("the bank deatails are ");
	System.out.println("the bank id is "+this.id);
	System.out.println("the bank name is "+this.name);
	System.out.println("the bank managerName is "+this.managerName);
	System.out.println("the bank branchName is "+this.branchName);
	System.out.println("the bank ifscCode is "+this.ifscCode);
	System.out.println("the bank swiftCode is "+this.swiftCode);
	System.out.println("the bank noOfWorker is "+this.noOfWorker);
	   
	   
	   
   }
}
