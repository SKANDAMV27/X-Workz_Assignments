class Runner{
	public static void main(String... args){
		
		Display display=new Display();
		Shop shop=new Shop();
		shop.ads(display);
		Poster poster = new Poster();
		Theater threater = new Theater();
		threater.show(poster);
		//Player player = new Player();
		//RCB rcb = new RCB();
		//rcb.selectPlayer(player);
		Astronaut astronaut = new Astronaut();
		Space space = new Space();
		space.mission(astronaut);
		Fuel fuel = new Fuel();
		Rocket rocket = new Rocket();
		rocket.launch(fuel);
		Fever fever = new Fever();
		Dolo650 dolo650 = new Dolo650();
		dolo650.take(fever);
		Haircut haircut = new Haircut();
		Barbar barbar = new Barbar();
		barbar.cutting(haircut);
		Camera camera = new Camera();
		CameraBattery camerabattery = new CameraBattery();
		camerabattery.cameraBag(camera);
		Mango mango = new Mango();
		Fruit fruit = new Fruit();
		fruit.sell(mango);
		Pillow pillow = new Pillow();
		Bed bed = new Bed();
		bed.sold(pillow);
		
		
		
	}
}