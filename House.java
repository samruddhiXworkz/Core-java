class House{
  
  int id;
  int noOfRooms;
  int noOfFloors;
  String houseName;
  String areaInSqrt;
  int noOfMembers;
  
    public House(){
		System.out.println("object is created");
	}
    public House(int id,int noOfRooms,int noOfFloors,String houseName,String areaInSqrt,int noOfMembers){
  this.id=id;
  this.noOfRooms=noOfRooms;
  this.noOfFloors=noOfFloors;
  this.houseName=houseName;
  this.areaInSqrt=areaInSqrt;
  this.noOfMembers=noOfMembers;
		
	}
  public void getHouseDetails(){
  System.out.println("the house deatails are :");
  System.out.println("the house id is "+this.id);
  System.out.println("the no Of Rooms are "+this.noOfRooms);
  System.out.println("the noOfFloors are "+this.noOfFloors);
  System.out.println("the home name is "+this.houseName);
  System.out.println("the areaInSqrt is "+this.areaInSqrt);
  System.out.println("the noOfMembers are "+this.noOfMembers);
  }

}