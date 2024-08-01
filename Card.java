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

}