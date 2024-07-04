class BlueBus{
  static int dateFounded=2006;
  static String founders[]={"Phanindra","Charan","Sudhakar"};
  static String headQuarters="Bengaluru";
  static String busName[]={"SRS","VRL","Vlvo","Gupta","venkat","sugama","Indian","RajHams","sss","Airavat"};

  public static void main(String bus[]){
  System.out.println("The main started");
  System.out.println("------------");
  System.out.println("The BlueBus Datefounded is "+dateFounded);
   //System.out.println("The BlueBus founders is "+founders);
	 for(int ref=0;ref<founders.length;ref++){
	 String value =founders[ref];
	 System.out.println(value);
	}
  System.out.println("The BlueBus headQuarters is "+headQuarters);
    for(int ref=0;ref<busName.length;ref++){
	 //returns value /ref
	 String value =busName[ref];
	System.out.println(value);
	}

  System.out.println("The main ended");

  
  
  }
}