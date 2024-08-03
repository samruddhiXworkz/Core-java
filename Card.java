class Card{

  int cardId;
  String cardHolderName;
  long cardNo;
  String expDate;
  int cvv;
  
  public Card(){
	  System.out.println("The Object Created");
  }
  public Card(int cardId,String cardHolderName,long cardNo,String expDate,int cvv){
	  
  this.cardId=cardId;
  this.cardHolderName=cardHolderName;
  this.cardNo=cardNo;
  this.expDate=expDate;
  this.cvv=cvv;
	  
  }
  public void getCardDetails(){
  System.out.println("the creadit card deatails are ");
  System.out.println("the creadit Id is "+this.cardId);
  System.out.println("the creadit holder name is "+this.cardHolderName);
  System.out.println("the creadit card No is "+this.cardNo);
  System.out.println("the creadit card expDate is "+this.expDate);
  System.out.println("the creadit card cvv is "+this.cvv);
	  
	  
  }

}