class Main
{
	public static void main(String[] a)
	{
		System.out.println("Information About Ladder..");
		float size = 100;
		String name ="Ashyion";
		boolean yes=true;
		double price = 25000;
		int sold = 4;
		int steps = 18;
		String colour= "White";
		char order = 'c';
		int age = 5;
		double discount = 2000;
		char grade = 'B';
		String item = "Aluminium";
		int weight = 10;  
		Ladder.size(size);
		Ladder.company(name);
		Ladder.avaliable(yes);
		Ladder.price(price,sold);
		Ladder.steps(steps,colour,order);
		Ladder.offer(age,discount,grade);
		Ladder.item(item,weight);
		System.out.println("Ladder Information Is Done!");
		System.out.println();
		System.out.println("List of Food Items:");
		String name1="Biriyani";
		FoodItem.biriyani(name1);
		int kg=5;
		FoodItem.apple(kg);
		boolean grade1=true;
		FoodItem.Avalible(grade1);
		String item1 = "kadubu";
		int number = 10;
		FoodItem.kadabu(item1,number);
		int n1 = 5;
		double n2 = 1000;
		FoodItem.pizza(n1,n2);
		int n4 = 1;
		String pices="Chicken";
		float water =1.5f;
		FoodItem.cambo(n4,pices,water);
		char grade2 ='A';
		int star = 5;
		String food ="DOSA";
		FoodItem.order(grade2,star,food);
		System.out.println("FooD Item List Done!!");
		
		System.out.println();
		System.out.println("Papers Lists:");
		String name2="Paper";
		paper.name(name2);
		int n3=50;
		paper.number(n3);
		int n6 = 25;
		String question="Question Paper";
		paper.question(n6,question);
		double n8 = 1000;
		String n9 ="News paper";
		paper.news(n8,n9);
		char a1='A';
		int n10 = 50;
		String cet="Question Papers";
		paper.cet(a1,n10,cet);
		int line = 10;
		String parr="paragraph";
		double nu = 5050;
		paper.line(line,parr,nu);
		System.out.println("Paper List DONE!!.");
		
		System.out.println();
		System.out.println("List OF Beer:");
		String var10="Wiskey";
		Beer.Beer1(var10);
		System.out.println();
		String get10 = "WhiteBoard";
		whiteBoard.class10(get10);
		System.out.println("WhiteBoard List is DONE!!.");
		
		System.out.println();
		System.out.println("List of Masks:");
		int mv6=45;
		mask.skanda1(mv6);
		System.out.println("End of marks List...");
		System.out.println();
		System.out.println("List of whiskey...");
		int ms=47;
		whiskey.skanda1(ms);
		System.out.println("DONE!");
		
		
	}
	}