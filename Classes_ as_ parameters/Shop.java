class Shop
{
	//System.out.println("Shop");
	public void ads(Display display)
	{
		System.out.println("Display");
		if(display !=null){
			display.run();
		}
		else {
			System.out.println("its a null ");
		}
	}
}