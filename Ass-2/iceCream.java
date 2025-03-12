class iceCream{
	public static void chooseFlavor() 
	{ 
		System.out.println("Vanilla flavor chosen."); 
	}
    public static void scoop() 
	{ 
		System.out.println("Scooping ice cream into the bowl."); 
	}
    public static void addToppings() 
	{ 
		System.out.println("Adding sprinkles and chocolate syrup."); 
	}
    public static void serve() 
	{	
		System.out.println("Ice cream is served!"); 
	}
    public static void eat() 
	{ 
		System.out.println("Enjoying the ice cream!"); 
	}
	public static void main(String[] args)
	{

		System.out.println("Types of Ice Cream Avaliable...");
		iceFlavor.cone();
		iceFlavor.cup();
		iceFlavor.familyPack();
		iceFlavor.culphy();
		iceFlavor.chokobar();
		chooseFlavor();
		scoop();
		addToppings();
		serve();
		eat();
	}
	}