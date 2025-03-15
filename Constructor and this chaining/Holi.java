class Holi 
	{
    String holiColour;
    String location;
    int date;
    String day;
    String time;
    double quantity;
	boolean function;
	float people;

    Holi()
	{
        super();
        System.out.println();
        System.out.println("Holi Details");
    }

    Holi(String holiColour) 
	{
        this();
        this.holiColour = holiColour;
    }
	Holi(String location,int date)
	{
		this();
		this.location=location;
		this.date=date;
	}
	Holi(String holiColour,String location,int date,String day,String time,double quantity)
	{
		this();
		this.holiColour=holiColour;
		this.location=location;
		this.date=date;
		this.day=day;
		this.time=time;
		this.quantity=quantity;
	}
	Holi(int date,String day,String time,double quantity)
	{
		this();
		this.date=date;
		this.day=day;
		this.time=time;
		this.quantity=quantity;
	}
	Holi(int date)
	{
		this();
		this.date=date;
	}
	
    Holi(boolean function) 
	{
        this();
        this.function=function;
    }
	Holi(float people)
	{
		this();
		this.people=people;
	}
		

    void display() 
	{ 
        System.out.println("Holi Colour: " + this.holiColour);
    }
	void display1()
	{
		System.out.println("Holi Location: "+this.location+" Holi Date: "+this.date+"th");
	}
	void display2()
	{
		System.out.println("Holi Colour: "+this.holiColour);
		System.out.println("Holi Location: "+this.location);
		System.out.println("Holi Date: "+this.date+"th");
		System.out.println("Holi Day: "+this.day);
		System.out.println("Holi Time: "+this.time);
		System.out.println("Holi Quantity: "+this.quantity+"kg");
	}
	void display3()
	{
		System.out.println("Holi Date: "+this.date+"th");
		System.out.println("Holi Day: "+this.day);
		System.out.println("Holi Time: "+this.time);
		System.out.println("Holi Quantity: "+this.quantity+"kg");
	}
	void display4()
	{
			System.out.println("Holi Date: "+this.date);
	}
	void display5()
	{
		System.out.println("Holi colour: "+this.function);
		
	}
	void display6()
	{
		System.out.println("Number of people: "+this.people);
		
	}
	
}