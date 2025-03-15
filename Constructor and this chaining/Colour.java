class Colour
{
	String colour1;
	int kg;
	double price;
	float kg1;
	boolean avaliable;
	short number;
	long num;
	Colour()
	{
		super();
		System.out.println();
		System.out.println("Colour Details: ");
	}
	Colour(String colour1)
	{
		this();
		this.colour1=colour1;
	}
	Colour(int colour2)
	{
		this();
		this.kg=kg;
	}
	Colour(double price)
	{
		this();
		this.price=price;
	}
	Colour(float kg1)
	{
		this();
		this.kg1=kg1;
	}
	Colour(boolean avaliable)
	{
		this();
		this.avaliable=avaliable;
	}
	Colour(short number)
	{
		this();
		this.number=number;
	}
	Colour(long num)
	{
		this();
		this.num=num;
	}
	
	void display()
	{
		System.out.println("Holi Colour: "+this.colour1);
	}
	void display1()
	{
		System.out.println("Colour Kg: "+this.kg);
	}
	void display2()
	{
		System.out.println("Colour Price: "+this.price);
	}
	void display3()
	{
		System.out.println("Colour kg: "+this.kg1);
	}
	void display4()
	{
		System.out.println("Colour Avaliable: "+this.avaliable);
	}
	void display5()
	{
		System.out.println("Colour Short: "+this.number);
	}
	void display6()
	{
		System.out.println("Number Of Colours: "+this.num);
	}
}