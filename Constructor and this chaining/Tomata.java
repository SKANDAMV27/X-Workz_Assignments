class Tomata
{
	String name;
	double price;
	String shape;
	int volume;
	String colour;
	char grade;
	Tomata()
	{
		super();
		System.out.println();
		System.out.println("Tomata Details:");
	}
	Tomata(String name)
	{
		super();
		this.name=name;
	}
	Tomata(String name,double price)
	{
		this();
		this.name=name;
		this.price=price;
	}
	Tomata(String name,double price,String shape)
	{
		this();
		this.name=name;
		this.price=price;
		this.shape=shape;
	}
	Tomata(String name,double price,String shape,String colour)
	{
		this();
		this.name=name;
		this.price=price;
		this.shape=shape;
		this.colour=colour;
	}
	Tomata(String colour,int volume)
	{
		this();
		this.colour=colour;
		this.volume=volume;
	}
	Tomata(String shape,char grade)
	{
		this();
		this.shape=shape;
		this.grade=grade;
	}
	Tomata(char grade)
	{
		this();
		this.grade=grade;
	}
	
	void display()
	{
		System.out.println("Tomata Name: "+this.name);
	}
	void display1()
	{
		System.out.println("Tomata Name:"+this.name);
		System.out.println("Tomata price:"+this.price);
	}
	void display2()
	{	
		System.out.println("Tomata :"+this.name);
		System.out.println("Tomata Price:"+this.price);
		System.out.println("Tomata Shape:"+this.shape);

	}
	void display3()
	{
		System.out.println("Tomata Name: "+this.name);
		System.out.println("Tomata price: "+this.price);
		System.out.println("Tomata Shape: "+this.shape);
		System.out.println("Tomata Colour: "+this.colour);
	}
	void display4()
	{
		System.out.println("Tomata Colour: "+this.colour);
		System.out.println("Tomata volume: "+this.volume);
	}
	void display5()
	{
		System.out.println("Tomata Shape: "+this.shape);
		System.out.println("Tomata Grade: "+this.grade);
	}
	void display6()
	{
		System.out.println("Tomata Grade: "+this.grade);
		System.out.println();
		System.out.println("Tomata Details End.");
	}
}