class Lalipop{
	public static void unwrap() 
	{
		System.out.println("Lollipop unwrapped."); 
		}
    public static void lick() 
	{
		System.out.println("Licking the lollipop.");
		}
    public static void bite()
	{ 
		System.out.println("Biting the lollipop."); 
		}
    public static void finish() 
	{
		System.out.println("Lollipop finished."); 
		}
    public static void throwStick()
	{
		System.out.println("Stick thrown in the bin.");
		}
	public static void main(String[] args)
	{
		System.out.println("Type of Lalipop flovors are Avaliable: ");
		Flovors.choclate();
		Flovors.orange();
		Flovors.strawberry();
		Flovors.mango();
		Flovors.apple();
		unwrap();
		lick();
		bite();
		finish();
		throwStick();
		System.out.println("Thank You!");
	}
}
