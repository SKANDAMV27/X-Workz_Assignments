class IPL{
	public static void hostTournament() 
	{ 
		System.out.println("Hosting IPL tournament."); 
		}
    public static void sellTickets() 
	{
		System.out.println("Selling IPL tickets."); 
		}
    public static void broadcastMatches() 
	{ 
		System.out.println("Broadcasting IPL matches."); 
		}
    public static void announceWinners() 
	{ 
		System.out.println("Announcing IPL winners."); 
		}
    public static void distributePrize() 
	{
		System.out.println("Distributing IPL prize money."); 
		}	
	public static void main(String[] args)
	{
		
		System.out.println("IPL Sponsors Types:");
		Sponsor.fundEvent();
		Sponsor.advertise();
		Sponsor.collaborate();
		Sponsor.investInPlayers();
		Sponsor.launchPromotions();
		hostTournament();
		sellTickets();
		broadcastMatches();
		announceWinners();
		distributePrize();
		
	}
}