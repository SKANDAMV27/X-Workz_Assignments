class MNC{
	public static void hireEmployee() 
	{
		System.out.println("Hiring an employee."); 
		}
    public static void fireEmployee() 
	{ 
		System.out.println("Firing an employee."); 
		}
    public static void launchProduct() 
	{
		System.out.println("Launching a new product."); 
		}
    public static void conductMeeting() 
	{
		System.out.println("Conducting a business meeting."); 
		}
    public static void reportRevenue() 
	{ 
		System.out.println("Reporting annual revenue."); 
		}
	public static void main(String[] args)
	{
		System.out.println("Different Types of Deperment in the MNC Company:");
		department.processPayroll();
		department.counductingTranning();
		department.manageBenefits();
		department. handelRecrutment();
		department.organizesEvents();
		hireEmployee();
		fireEmployee();
		launchProduct();
		conductMeeting();
		reportRevenue();
	}
	}