class SuperMarket{

//Arrays Declaration
static String groceries[]={"Wheat" , "Rice" ,"Ragi" ,"Urad Dal" , "Pikkle" , "Papad" , "Chatani" ,"Sugar" , "CoffiePowder" , "Honey" , "BrownSugar" , "Egg" , "Prowns" , "Chiken" , "MugDal" ,"TuraDal" , "Almond"};
static String vegitables[]={"Carrot","Beans","Ladies's Finger","Onion","Spinch","Brinjle","CouliFlower","Ginger","Capsicum","Pumpkin","Pea","GreenChilli","RedChilli","Potato","Cukumber"};
static String perfumes[]={"BellaVita","HpGold","Arab","fog","HpGold","SulthanGold","Dove","Gost","Nivya","Spinz","Rose","Nivya","Ks","Coco","jasmin"};
static String fruits[]={"Mango","Banana","Apple","Grapes","WaterMelun","Lemon","KiWi","Papaya","Stowbaary","Cherry","Drayagan","Orange","fig","pineapple","Pear"};
static String snaks[]={"Samosa","VadaPav","Bhel","Chips","MoMo","Pasta","Maggi","Kurkure","MeduVada","Dabeli","Dokala","Kachori","Snadwitch","PavBaji","SevPuri"};
static String chocalates[]={"DairyMilk","Snakers","Kitkat","5star","Milkchocklet","Dark","fuse","park","Silk","DarkFuse","Bournville","Nutties","Belgian","Cocca","Ruby"};
static String sweets[]={"GulabJamun","Milkpowder","Rasgulla","Rasmalai","SujiHalwa","BesanLaddu","CarrotHalwa","BadamBarfi","Kajukatli","GajarHalwa","LukiHalwa","Modk","coconotladdu","fruitCuster","DryFruit"};
static String cosmetic[]={"FaceCream","Foundation","Concealer","Eyeliner","Eyepencil"," Eyeshadow","Mascara","LipStick","BodyLotion","PondsWiteBeauty","Nivya","NailPolish","Perfume","HairCare","Lipbalm"};
static String alcohols[]={"Rum","Wisky","Ot","vodaka","EverClear","Brandy","Cognak","Cider","Vermoth","gin","beer","wine","Brandy","bijjui","soju"};
static String biscuits[]={"sunfeast","PalrleG","Goodday","Oreo","PriyaGold","Milano","Krackjack","SunfestDark","GingerBiscut","Speculls","TwentyTwenty","Chocklet","Dryfruits","Almond","50-50"};
static String coolDrinks[]={"cococola","maza","Sprite","7up","Lemonjuice","Fanta","ThumsUp","Pepsi","Mountain","AppyFizz","Smothy","MIlkShake","Mirinda","Limica","Lassi"};
static String iceCreams[]={"vennela","chockalet","ButerScoch","cone","Kulfi","Sharbat","Cookies","Strawbery","Faloodeh","Cherry","ChockletAlmond","ChockletCream","CheesIcecreeam","pearicecream","mangoIcecream"};
static String milkProduct[]={"Milk","Cream","Lassi","Chees","Clusters","Chees","Butter","Fermented","forzen","Icecream","MilkPowder","biscuit","MilkShake","AlmondMilk","ButterOmlet"};
static String homeApplicants[]={"Kettle","Blender","Door","Rice","Water","Microwave","Multicooker","Stove","Window","Blanket","glass","plate","Fan","charger","key"};
 public static void main(String dMart[]){
	 System.out.println("Main Started");
	 System.out.println("Welcome to Dmart ");
	 System.out.println("------------");
	 System.out.println("Avalable Gloceries are:"+groceries[0]+ ","+groceries[1]+ ","+groceries[2]+ ","+groceries[3]+ ","+groceries[4]+ ","+groceries[5]+ ","+groceries[6]+ ","+groceries[7]+ ","+groceries[8]+ ","+groceries[9]+ ","+groceries[10]+ ","+groceries[11]+ ","+groceries[12]+ ","+groceries[13]+ ","+groceries[14]);
	 System.out.println("Avalable Vegitables are:"+vegitables[0] + ","+vegitables[1]+ ","+vegitables[2]+ ","+vegitables[3]+ ","+vegitables[4]+ ","+vegitables[5]+ ","+vegitables[6]+ ","+vegitables[7]+ ","+vegitables[8]+ ","+vegitables[9]+ ","+vegitables[10]+ ","+vegitables[11]+ ","+vegitables[12]+ ","+vegitables[13]+ ","+vegitables[14]);
	 System.out.println("Avalable perfumes are:"+perfumes[0] + ","+perfumes[1] + ","+perfumes[2] + ","+perfumes[3] + ","+perfumes[4] + ","+perfumes[5] + ","+perfumes[6] + ","+perfumes[7] + ","+perfumes[8] + ","+perfumes[9] + ","+perfumes[10] + ","+perfumes[11] + ","+perfumes[12] + ","+perfumes[13] + ","+perfumes[14] );
	 System.out.println("Avalable fruits are:"+fruits[0] + ","+fruits[1]+ ","+fruits[2]+ ","+fruits[3]+ ","+fruits[4]+ ","+fruits[5]+ ","+fruits[6]+ ","+fruits[7]+ ","+fruits[8]+ ","+fruits[9]+ ","+fruits[10]+ ","+fruits[11]+ ","+fruits[12]+ ","+fruits[13]+ ","+fruits[14]);
	 System.out.println("Avalable Snaks are:"+snaks[0] + ","+snaks[1]+ ","+snaks[2]+ ","+snaks[3]+ ","+snaks[4]+ ","+snaks[5]+ ","+snaks[6]+ ","+snaks[7]+ ","+snaks[8]+ ","+snaks[9]+ ","+snaks[10]+ ","+snaks[11]+ ","+snaks[12]+ ","+snaks[13]+ ","+snaks[14]);
	 System.out.println("Avalable chocalates are:"+chocalates[0] + ","+chocalates[1]+ ","+chocalates[2]+ ","+chocalates[3]+ ","+chocalates[4]+ ","+chocalates[5]+ ","+chocalates[6]+ ","+chocalates[7]+ ","+chocalates[8]+ ","+chocalates[9]+ ","+chocalates[10]+ ","+chocalates[11]+ ","+chocalates[12]+ ","+chocalates[13]+ ","+chocalates[14]);
	 System.out.println("Avalable sweets are:"+sweets[0] + ","+sweets[1]+ ","+sweets[2]+ ","+sweets[3]+ ","+sweets[4]+ ","+sweets[5]+ ","+sweets[6]+ ","+sweets[7]+ ","+sweets[8]+ ","+sweets[9]+ ","+sweets[10]+ ","+sweets[11]+ ","+sweets[12]+ ","+sweets[13]+ ","+sweets[14]);
	 System.out.println("Avalable Cosmetic are:"+cosmetic[0] + ","+cosmetic[1] + ","+cosmetic[2] + ","+cosmetic[3] + ","+cosmetic[4] + ","+cosmetic[5] + ","+cosmetic[6] + ","+cosmetic[7] + ","+cosmetic[8] + ","+cosmetic[9] + ","+cosmetic[10] + ","+cosmetic[11] + ","+cosmetic[12] + ","+cosmetic[13] + ","+cosmetic[14]);
	 System.out.println("Avalable alcohols are:"+alcohols[0] + ","+alcohols[1] + ","+alcohols[2] + ","+alcohols[3] + ","+alcohols[4] + ","+alcohols[5] + ","+alcohols[6] + ","+alcohols[7] + ","+alcohols[8] + ","+alcohols[9] + ","+alcohols[10] + ","+alcohols[11] + ","+alcohols[12] + ","+alcohols[13] + ","+alcohols[14]);
	 System.out.println("Avalable biscuits are:"+biscuits[0] + ","+biscuits[1]+ ","+biscuits[2]+ ","+biscuits[3]+ ","+biscuits[4]+ ","+biscuits[5]+ ","+biscuits[6]+ ","+biscuits[7]+ ","+biscuits[8]+ ","+biscuits[9]+ ","+biscuits[10]+ ","+biscuits[11]+ ","+biscuits[12]+ ","+biscuits[13]+ ","+biscuits[14]);
	 System.out.println("Avalable coolDrinks are:"+coolDrinks[0] + ","+coolDrinks[1]);
	 System.out.println("Avalable iceCreams are:"+iceCreams[0] + ","+iceCreams[1]+ ","+iceCreams[2]+ ","+iceCreams[3]+ ","+iceCreams[4]+ ","+iceCreams[5]+ ","+iceCreams[6]+ ","+iceCreams[7]+ ","+iceCreams[8]+ ","+iceCreams[9]+ ","+iceCreams[10]+ ","+iceCreams[11]+ ","+iceCreams[12]+ ","+iceCreams[13]+ ","+iceCreams[14]);
     System.out.println("Avalable milkProduct are:"+milkProduct[0] + ","+milkProduct[2]+ ","+milkProduct[3]+ ","+milkProduct[4]+ ","+milkProduct[5]+ ","+milkProduct[6]+ ","+milkProduct[7]+ ","+milkProduct[8]+ ","+milkProduct[9]+ ","+milkProduct[10]+ ","+milkProduct[11]+ ","+milkProduct[12]+ ","+milkProduct[13]+ ","+milkProduct[14]);
	 System.out.println("Avalable Vegitables are:"+homeApplicants[0]+ ","+homeApplicants[1]+ ","+homeApplicants[2] + ","+homeApplicants[3]+ ","+homeApplicants[4]+ ","+homeApplicants[5]+ ","+homeApplicants[6]+ ","+homeApplicants[7]+ ","+homeApplicants[8]+ ","+homeApplicants[9]+ ","+homeApplicants[10]+ ","+homeApplicants[11]+ ","+homeApplicants[12]+ ","+homeApplicants[13]+ ","+homeApplicants[14]);

	 System.out.println("Main Ended");

 }
}