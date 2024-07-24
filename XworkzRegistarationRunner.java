class XworkzRegistarationRunner{
public static void main(String details[]){
   boolean createStudent=XworkzRegistaration.createStudent("sam","Raj",null,"20/01/2003","cat-1","22/07/2030");
	if(createStudent==true)
    XworkzRegistaration.readDetails();
}



}