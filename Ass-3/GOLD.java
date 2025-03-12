class GOLD{
	public static void buy()
	{
		System.out.println("Buying The Gold..!");
	}
	public static void sell()
	{
		System.out.println("Selling the Gold.!");
		checkPurity();
	}
	public static void checkPurity()
	{
		System.out.println("Checking the Purity of the Gold..!");
	}
	public static void checkMarket()
	{
		System.out.println("Check the Gold Market...!");
		buy();
	}
}