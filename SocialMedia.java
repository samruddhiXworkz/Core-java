class SocialMedia{
 
  String id;
  String name;
  String profileName;
  String email;
 
 public SocialMedia(){
	 System.out.println("the Object is Created");
 }
 public SocialMedia(String id,String name,String profileName,String email){
	 
  this.id=id;                                             
  this.name=name;
  this.profileName=profileName;
  this.email=email;
	 
 }
 public void getSocialMediaDetails() {

 System.out.println("The social media details is ");
  System.out.println("The social media id is "+this.id);
  System.out.println("The SocialMedia name is "+this.name);
  System.out.println("The social media profileName is "+this.profileName);
  System.out.println("The social media email is "+this.email);

}
}