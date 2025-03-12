class Supra{
	public static void startEngine()
	{ 
		System.out.println("Supra engine started!"); 
		}
    public static void accelerate() 
	{
		System.out.println("Supra is accelerating!"); 
		}
    public static void brake() 
	{ 
		System.out.println("Brakes applied!"); 
		}
    public static void drift() 
	{
		System.out.println("Supra is drifting!"); 
		}
    public static void refuel() 
	{ 
		System.out.println("Supra refueled!"); 
		}
	
	public static void main(String[] args)
	{
		
		performanceaParts.installTurbo();
		performanceaParts.upgradeBrakes();
		performanceaParts.tuneExhaust();
		performanceaParts.changeSuspension();
		performanceaParts.replaceTires();	
		startEngine();
		accelerate();
		brake();
		drift();
		refuel();
	}
}