class Main
{
	public static void main(String[] a)
	{
		String item ="Egg pups";
		String some ="more";
		Bakery.buy(item,some);
		boolean opened = true;
		Bakery.open(opened);
		boolean closed = false;
		Bakery.close(closed);
		String Owner="Abhi";
		Bakery.owner(Owner);
		String worker = "Dhanush";
		Bakery.cashier(worker);
		
	}
}