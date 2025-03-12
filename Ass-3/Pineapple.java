class Pineapple
{
	public static void eat()
	{
		System.out.println("Pineapple Eating....");
	}
	public static void juice()
	{
		System.out.println("Making Pineapple Juice...");
	}
	public static void checkRipeness()
	{
		System.out.println("Checking pineapple ripeness....");
		eat();
	}
	public static void sell()
	{
		System.out.println("Pineapple Selling");
		juice();
	}
}