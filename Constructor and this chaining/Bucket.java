class Bucket
{
	String name;
	double price;
	String shape;
	int volume;
	String colour;
	char grade;
	Bucket()
	{
		super();
		System.out.println();
		System.out.println("Bucket Details:");
	}
	Bucket(String name)
	{
		super();
		this.name=name;
	}
	Bucket(String name,double price)
	{
		this();
		this.name=name;
		this.price=price;
	}
	Bucket(String name,double price,String shape)
	{
		this();
		this.name=name;
		this.price=price;
		this.shape=shape;
	}
	Bucket(String name,double price,String shape,String colour)
	{
		this();
		this.name=name;
		this.price=price;
		this.shape=shape;
		this.colour=colour;
	}
	Bucket(String colour,int volume)
	{
		this();
		this.colour=colour;
		this.volume=volume;
	}
	Bucket(String shape,char grade)
	{
		this();
		this.shape=shape;
		this.grade=grade;
	}
	Bucket(char grade)
	{
		this();
		this.grade=grade;
	}
	
	void display()
	{
		System.out.println("Bucket Name: "+this.name);
	}
	void display1()
	{
		System.out.println("Bucket Name:"+this.name);
		System.out.println("Bucket price:"+this.price);
	}
	void display2()
	{	
		System.out.println("Bucket Balloon:"+this.name);
		System.out.println("Bucket Ballon Price:"+this.price);
		System.out.println("Bucket Balloons Shape:"+this.shape);

	}
	void display3()
	{
		System.out.println("Bucket Name: "+this.name);
		System.out.println("Bucket price: "+this.price);
		System.out.println("Bucket Shape: "+this.shape);
		System.out.println("Bucket Colour: "+this.colour);
	}
	void display4()
	{
		System.out.println("Bucket Colour: "+this.colour);
		System.out.println("Bucket volume: "+this.volume);
	}
	void display5()
	{
		System.out.println("Bucket Shape: "+this.shape);
		System.out.println("Bucket Grade: "+this.grade);
	}
	void display6()
	{
		System.out.println("Bucket Grade: "+this.grade);
		System.out.println();
		System.out.println("Bucket Details End.");
	}
}