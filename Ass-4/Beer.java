class Beer
{
	public static void Beer1(String name)
	{
		System.out.println(name);
		String var="Beer";
		int var1 = 7;
		boolean var2=true;
		double var4=1452;
		char  var5= 'A';
		Avaliable1(var2);
		pice(var1);
		brand(var,var1);
		party(var,var1);
		bootel(var,var1,var5);
		shop(var,var1,var4);
		
		
	}
	public static void  Avaliable1(boolean yesorno)
	{
		System.out.println(yesorno);
	}
	public static void pice(int nur)
	{
		System.out.println(nur);
	}
	public static void brand(String brand,int nuk)
	{
		System.out.println(brand + nuk);
	}
	public static void party(String beer,int nh)
	{
		System.out.println(beer+nh);
	}
	public static void bootel(String bootel,int ng,char lk)
	{
		System.out.println(bootel + ng + lk);
	}
	public static void shop(String shop,int nb,double var)
	{
		System.out.println(shop + nb + var);
	}
}