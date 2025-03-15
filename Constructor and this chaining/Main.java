class Main {
    public static void main(String... args) {
        Baloon baloon1 = new Baloon("Latex Balloons");
        baloon1.display();
        Baloon baloon2 = new Baloon("Foil Balloons", 450);
        baloon2.display1();
        Baloon baloon3 = new Baloon("Bubble Balloons", 650, "Bubble Shape");
        baloon3.display2();
        Baloon baloon4 = new Baloon("Water Balloons", 520, "Round Shape", "Blue");
        baloon4.display3();
        Baloon baloon5 = new Baloon("Red", 10);
        baloon5.display4();
        Baloon baloon6 = new Baloon("Heart Shape", 'A');
        baloon6.display5();
        Baloon baloon7 = new Baloon('B');
        baloon7.display6();

        Holi holi1 = new Holi("Green");
        holi1.display(); 
		Holi holi2 = new Holi("Rajajinagar",14);
		holi2.display1();
		Holi holi3 = new Holi("Blue","Thirthahalli",14,"Friday","2:30pm",20.5);
		holi3.display2();
		Holi holi4 = new Holi(12,"Monday","10:00",15.3);
		holi4.display3();
		Holi holi5 = new Holi(18);
		holi5.display4();
		Holi holi6 = new Holi(true);
		holi6.display5();
		Holi holi7 = new Holi(2.5f);
		holi7.display6();

		Puchkari punchkari1 = new Puchkari("Blue");
		punchkari1.display();
		Puchkari punchkari2 = new Puchkari("Blue","Rubber");
		punchkari2.display1();
		Puchkari punchkari3 = new Puchkari(100);
		punchkari3.display2();
		Puchkari punchkari4 = new Puchkari(450,true);
		punchkari4.display3();
		Puchkari punchkari5 = new Puchkari('A');
		punchkari5.display4();
		Puchkari punchkari6 = new Puchkari(false);
		punchkari6.display5();
		Puchkari punchkari7 = new Puchkari("Blue","Rubber",14,450,'A',true);
		punchkari7.display6();
		
		Colour colour1 = new Colour("Blue");
		colour1.display();
		Colour colour2 = new Colour(20);
		colour2.display1();
		Colour colour3 = new Colour(450);
		colour3.display2();
		Colour colour4 = new Colour(2.2f);
		colour4.display3();
		Colour colour5 = new Colour(false);
		colour5.display4();
		Colour colour6 = new Colour(2.0);
		colour6.display5();
		Colour colour7 = new Colour(20l);
		colour7.display6();
		
		Egg egg1 = new Egg("white");
		egg1.display();
		Egg egg2 = new Egg(20);
		egg2.display1();
		Egg egg3 = new Egg(450);
		egg3.display2();
		Egg egg4 = new Egg(2.2f);
		egg4.display3();
		Egg egg5 = new Egg(false);
		egg5.display4();
		Egg egg6 = new Egg(2.0);
		egg6.display5();
		Egg egg7 = new Egg(20l);
		egg7.display6();
		
		Bucket bucket1 = new Bucket("JCB Bucket");
        bucket1.display();
        Bucket bucket2 = new Bucket("Foil Bucket", 450);
        baloon2.display1();
        Bucket bucket3 = new Bucket("Bubble Bucket", 650, "Bubble Shape");
        bucket3.display2();
        Bucket bucket4 = new Bucket("Water Bucket", 520, "Round Shape", "Blue");
        bucket4.display3();
        Bucket bucket5 = new Bucket("Red", 10);
        bucket5.display4();
        Bucket bucket6 = new Bucket("Dram Shape", 'A');
        bucket6.display5();
        Bucket bucket7 = new Bucket('B');
        bucket7.display6(); 
		
		Tomata tomata1 = new Tomata("Tomata");
        tomata1.display();
        Tomata tomata2 = new Tomata("Foil", 450);
        tomata2.display1();
        Tomata tomata3 = new Tomata("Bubble Tomata", 650, " Bubble Shape");
        tomata3.display2();
        Tomata tomata4 = new Tomata("Water Tomata", 520, "Round Shape", "Red");
        tomata4.display3();
        Tomata tomata5 = new Tomata("Red", 10);
        tomata5.display4();
        Tomata tomata6 = new Tomata("Heart Shape", 'A');
        tomata6.display5();
        Tomata tomata7 = new Tomata('B');
        tomata7.display6();
		
		WaterBall waterball1 = new WaterBall("green");
		waterball1.display();
		WaterBall waterball2 = new WaterBall(40);
		waterball2.display1();
		WaterBall waterball3 = new WaterBall(750);
		waterball3.display2();
		WaterBall waterball4 = new WaterBall(2.2f);
		waterball4.display3();
		WaterBall waterball5 = new WaterBall(true);
		waterball5.display4();
		WaterBall waterball6 = new WaterBall(4.0);
		waterball6.display5();
		WaterBall waterball7 = new WaterBall(253);
		waterball7.display6();
		
		Gun gun1 = new Gun("Gun");
        gun1.display();

        Gun gun2 = new Gun("Foil", 450);
        gun2.display1();

        Gun gun3 = new Gun("Bubble Gun", 650, "Bubble Shape");
        gun3.display2();

        Gun gun4 = new Gun("Water Gun", 520, "Round Shape", "Red");
        gun4.display3();

        Gun gun5 = new Gun("Red", 10);
        gun5.display4();

        Gun gun6 = new Gun("Heart Shape", 'A');
        gun6.display5();

        Gun gun7 = new Gun('B');
        gun7.display6();
		
		
    }
}

