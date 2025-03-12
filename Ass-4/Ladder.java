class Ladder{
	public static void size(float size)
	{
		System.out.println("Ladder Size: "+size+"m");	
		

	}
	public static void company(String name)
	{
		System.out.println("Ladder Company Name: "+name);

		
	}
	public static void avaliable(boolean yesorno)
	{
		System.out.println("Ladder Avalibility: "+yesorno);
	}
	public static void price(double price,int sold)
	{
		System.out.println("Ladder Price: "+price+"Ladder Sold: "+sold+" in a Day.");
	}
	public static void steps(int steps,String colour,char order)
	{
		System.out.println("Number of Steps in Ladder: "+steps +"Ladder Colour: " +colour +"Ladder order" +order);
	}
	public static void offer(int age,double discount,char grade)
	{
		System.out.println("Warranty for Ladder: "+age+"Years" +"Discount For Ladder: "+discount+"Grade For Ladder: " +grade);
	}
	
	public static void item(String item,int weight)
	{
		System.out.println("Type of Material is Used: "+item +"Weight of Ladder: " +weight+"kg.");
		 
	}
	}