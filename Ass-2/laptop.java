class laptop{
	public static void start() 
	{
		System.out.println("Laptop is starting...");
		}
    public static void shutdown()
	{
		System.out.println("Laptop is shutting down..."); 
		}
    public static void openLid()
	{ 
		System.out.println("Lid opened."); 
		}
    public static void closeLid() 
	{
		System.out.println("Lid closed."); 
		}
    public static void showBattery() 
	{ 
		System.out.println("Battery is at 80%.");
		}
	public static void main(String[] args)
	{
		System.out.println("Laptop Accessories!");
		Accessories.mouse();
		Accessories.keyboard();
		Accessories.USB();
		Accessories.Storage();
		Accessories.processor();
		start();
		shutdown();
		openLid();
		closeLid();
		showBattery();
	}
}