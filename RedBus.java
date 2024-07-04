class RedBus{
  static int dateFounded=2006;
  static String founders[]={"Phanindra","Charan","Sudhakar"};
  static String headQuarters="Bengaluru";
  static String busName[]={"SRS","VRL","Vlvo","Gupta","venkat","sugama","Indian","RajHams","sss","Airavat"};

  public static void main(String bus[]){
  System.out.println("The main started");
  System.out.println("------------");
  System.out.println("The RedBus founders is "+founders);
	for(String founder:founders){
	  System.out.println(founder);
	}
  System.out.println("The RedBus headQuarters is "+headQuarters);
    for(String item:busName){
	System.out.println(item);
	}

  System.out.println("The main ended");

  
  
  }
}