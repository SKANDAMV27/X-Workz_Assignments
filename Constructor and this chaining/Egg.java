class Egg
{
	String colour1;
	int kg;
	double price;
	float kg1;
	boolean avaliable;
	short number;
	long num;
	Egg()
	{
		super();
		System.out.println();
		System.out.println("Egg Details: ");
	}
	Egg(String colour1)
	{
		this();
		this.colour1=colour1;
	}
	Egg(int kg)
	{
		this();
		this.kg=kg;
	}
	Egg(double price)
	{
		this();
		this.price=price;
	}
	Egg(float kg1)
	{
		this();
		this.kg1=kg1;
	}
	Egg(boolean avaliable)
	{
		this();
		this.avaliable=avaliable;
	}
	Egg(short number)
	{
		this();
		this.number=number;
	}
	Egg(long num)
	{
		this();
		this.num=num;
	}
	
	void display()
	{
		System.out.println("Egg Colour: "+this.colour1);
	}
	void display1()
	{
		System.out.println("Egg Number: "+this.kg);
	}
	void display2()
	{
		System.out.println("Egg Price: "+this.price);
	}
	void display3()
	{
		System.out.println("Egg kg: "+this.kg1);
	}
	void display4()
	{
		System.out.println("Egg Avaliable: "+this.avaliable);
	}
	void display5()
	{
		System.out.println("Egg Short: "+this.number);
	}
	void display6()
	{
		System.out.println("Number Of Egg: "+this.num);
	}
}
