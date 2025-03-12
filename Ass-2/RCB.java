class RCB{
	public static void selectPlayers() 
	{
		System.out.println("Selecting players for RCB."); 
		}
    public static void practice() 
	{
		System.out.println("RCB players practicing.");
		}
    public static void playMatch() 
	{
		System.out.println("RCB is playing a match."); 
		}
    public static void celebrateVictory()
	{ 
		System.out.println("RCB celebrating victory!"); 
		}
    public static void strategize() 
	{	
		System.out.println("RCB discussing strategy."); 
		}
	public static void main(String[] args)
	{
		System.out.println("RCB");
		TeamCoach.motivate();
		TeamCoach.analyzeOpponents();
		TeamCoach.conductTranning();
		TeamCoach.planMatch();
		TeamCoach.reviewPerformance();
		selectPlayers();
		practice();
		playMatch();
		celebrateVictory();
		strategize();
	}
	}