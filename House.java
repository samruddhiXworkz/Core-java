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
  

}