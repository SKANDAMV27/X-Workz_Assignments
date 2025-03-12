class Main
{
	public static void main(String [] agrs)
	{
		System.out.println("MOBILE NUMBER>>");
		long num = 9481949968l;
		String restult =Assignment.name(num);
		System.out.println(restult);
		System.out.println("------------------------------------");
		System.out.println("Company Owner Name");
		String company="Google";
		String com=Assignment.ownerName(company);
		System.out.println(com);
		System.out.println("=========================================");
		System.out.println("List Of FoodItems Price.");
		String food="Fish Fry";
		int item=Assignment.price(food);
		System.out.println(item);
		System.out.println("*******************************************");
		System.out.println("Balance.");
		long account=485326958574l;
		double check=Assignment.balance(account);
		System.out.println(check+"rs");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("List of Chepest Product.");
		String product="pen";
		int price = Assignment.amount(product);
		System.out.println(price+"rs");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Lists.");
		String name="whisky";
		String people=Assignment.alive(name);
		System.out.println(people);
		
		System.out.println();
		System.out.println("DONE!!!!!!!!!!!!!!!");
		
		
	}
	
}