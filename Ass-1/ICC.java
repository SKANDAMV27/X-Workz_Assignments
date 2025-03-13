class ICC
{
	public static void scheduleMatch() 
	{
		System.out.println("Match scheduled."); 
		}
    public static void announceRankings() 
	{
		System.out.println("Announcing team rankings.");
		}
    public static void introduceRules() 
	{ 
		System.out.println("New rules introduced."); 
		}
    public static void penalizeTeam() 
	{
		System.out.println("Team penalized for misconduct."); 
		}
    public static void rewardBestPlayer() 
	{
		System.out.println("Best player awarded."); 
		}
	public static void main(String[] args)
	{
		championship.startLeague();
		championship.conductFinal();
		championship.presentTrophy();
		championship.upadteLeaderboard();
		championship.reviewPerformance();
		scheduleMatch();
		announceRankings();
		introduceRules();
		penalizeTeam();
		rewardBestPlayer();
	}
}