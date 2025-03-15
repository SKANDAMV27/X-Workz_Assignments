class Puchkari{
	String colour;
	String material;
	int size;
	double price;
	char grade;
	boolean avaliable;
	Puchkari()
	{
		super();
		System.out.println();
		System.out.println("Puchkari Details: ");
	}
	Puchkari(String colour)
	{
		this();
		this.colour=colour;
	}
	Puchkari(String colour,String material)
	{
		this();
		this.colour=colour;
		this.material=material;
	}
	Puchkari(int size)
	{
		this();
		this.size=size;
	}
	Puchkari(double price,boolean avaliable)
	{
		this();
		this.price=price;
		this.avaliable=avaliable;
	}
	Puchkari(char grade)
	{
		this();
		this.grade=grade;
	}
	Puchkari(boolean avaliable)
	{
		this();
		this.avaliable=avaliable;
	}
	Puchkari(String colour,String material,int size,double price,char grade,boolean avaliable)
	{
		this();
		this.colour=colour;
		this.material=material;
		this.size=size;
		this.price=price;
		this.grade=grade;
		this.avaliable=avaliable;
	}
	void display()
	{
		System.out.println("Puchkari Colour: "+this.colour);
	}
	void display1()
	{
		System.out.println("Puchkari Colour: "+this.colour);
		System.out.println("Puchkari Material: "+this.material);
	}
	void display2()
	{
		System.out.println("Puchkari Size : "+this.size+"mm");
	}
	void display3()
	{
		System.out.println("Puchkari Price: "+this.price);
		System.out.println("Puchkari Avaliable: "+this.avaliable);
	}
	void display4()
	{
		System.out.println("Puchkari Grade: "+this.grade);
	}
	void display5()
	{
		System.out.println("Puchkari Avaliable: "+this.avaliable);
	}
	void display6()
	{
		System.out.println("Puchkari Colour: "+this.colour);
		System.out.println("Puchkari Material: "+this.material);
		System.out.println("Puchkari Size: "+this.size);
		System.out.println("Puchkari Price: "+this.price);
		System.out.println("Puchkari Grade: "+this.grade);
		System.out.println("Puchkari Avaliable: "+this.avaliable);
	}
}