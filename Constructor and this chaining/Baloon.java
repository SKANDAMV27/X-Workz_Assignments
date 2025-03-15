class Baloon
{
	String name;
	double price;
	String shape;
	int volume;
	String colour;
	char grade;
	Baloon()
	{
		super();
		System.out.println();
		System.out.println("Boolean Details:");
	}
	Baloon(String name)
	{
		this.name=name;
	}
	Baloon(String name,double price)
	{
		//this(name);
		this.price=price;
	}
	Baloon(String name,double price,String shape)
	{
		this();
		this.shape=shape;
	}
	Baloon(String name,double price,String shape,String colour)
	{
		this();
		this.colour=colour;
	}
	Baloon(String colour,int volume)
	{
		this();
		this.volume=volume;
	}
	Baloon(String shape,char grade)
	{
		this();
		this.grade=grade;
	}
	Baloon(char grade)
	{
		this();
	}
	
	void display()
	{
		System.out.println("Balloon Name: "+this.name);
	}
	void display1()
	{
		System.out.println("Balloon Name:"+this.name);
		System.out.println("Balloons price:"+this.price);
	}
	void display2()
	{	
		System.out.println("Bubble Balloon:"+this.name);
		System.out.println("Bubble Ballon Price:"+this.price);
		System.out.println("Bubble Balloons Shape:"+this.shape);

	}
	void display3()
	{
		System.out.println("Bolloon Name: "+this.name);
		System.out.println("Balloon price: "+this.price);
		System.out.println("Balloon Shape: "+this.shape);
		System.out.println("Balloon Colour: "+this.colour);
	}
	void display4()
	{
		System.out.println("Balloon Colour: "+this.colour);
		System.out.println("Balloon volume: "+this.volume);
	}
	void display5()
	{
		System.out.println("Balloon Shape: "+this.shape);
		System.out.println("Balloon Grade: "+this.grade);
	}
	void display6()
	{
		System.out.println("Balloon Grade: "+this.grade);
		System.out.println();
		System.out.println("Balloon Details End.");
	}
}