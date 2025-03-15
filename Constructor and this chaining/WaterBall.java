class WaterBall
{
	
	String colour1;
	int kg;
	double price;
	float kg1;
	boolean avaliable;
	short number;
	long num;
	WaterBall()
	{
		super();
		System.out.println();
		System.out.println("WaterBall Details: ");
	}
	WaterBall(String colour1)
	{
		this();
		this.colour1=colour1;
	}
	WaterBall(int colour2)
	{
		this();
		this.kg=kg;
	}
	WaterBall(double price)
	{
		this();
		this.price=price;
	}
	WaterBall(float kg1)
	{
		this();
		this.kg1=kg1;
	}
	WaterBall(boolean avaliable)
	{
		this();
		this.avaliable=avaliable;
	}
	WaterBall(short number)
	{
		this();
		this.number=number;
	}
	WaterBall(long num)
	{
		this();
		this.num=num;
	}
	
	void display()
	{
		System.out.println("WaterBall Colour: "+this.colour1);
	}
	void display1()
	{
		System.out.println("WaterBall Kg: "+this.kg);
	}
	void display2()
	{
		System.out.println("WaterBall Price: "+this.price);
	}
	void display3()
	{
		System.out.println("WaterBall kg: "+this.kg1);
	}
	void display4()
	{
		System.out.println("WaterBall Avaliable: "+this.avaliable);
	}
	void display5()
	{
		System.out.println("WaterBall Short: "+this.number);
	}
	void display6()
	{
		System.out.println("Number Of WaterBall: "+this.num);
	}
}