class wallet
{
	public static void addMoney()
	{
		System.out.println("Adding Money to wallet.");
	}
	public static void spendMoney()
	{
		System.out.println("Spending money from wallet.");
	}
	public static void checkBalance()
	{
		System.out.println("check the balance in wallet...");
		addMoney();
	}
	public static void checkCuurency()
	{
		System.out.println("Check the amount in wallet.");
		spendMoney();
	}
}