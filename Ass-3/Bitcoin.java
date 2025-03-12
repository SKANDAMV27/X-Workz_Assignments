class Bitcoin
{
	public static void mine()
	{
		System.out.println("Mining Bitcoin.");
	}
	public static void trade()
	{
		System.out.println("Trading Bitcoin.");
	}
	public static void checkNetwork()
	{
		System.out.println("Checking Bitcoin Network..");
		trade();
		
	}
	public static void price()
	{
		System.out.println("Checking Bitcoin Price.");
		mine();
	}
}