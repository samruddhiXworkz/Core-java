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
}
