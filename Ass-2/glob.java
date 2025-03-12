class glob{
	public static void rotate()
	{
		System.out.println("Globe is rotating."); 
		}
    public static void zoom()
	{ 
		System.out.println("Zooming into a country."); 
		}
    public static void tilt() 
	{ 
		System.out.println("Tilting the globe.");
		}
    public static void highlightContinents() 
	{ 
		System.out.println("Highlighting continents."); 
		}
    public static void markLocation() 
	{
		System.out.println("Marking a location."); 
		}
	public static void main(String[] args){
	System.out.println("Describe The Glob:");
	Geography.describeMountains();
	Geography.describeRivers();
	Geography.describeOcean();
	Geography.describeForests();
	Geography.describeDesert();
	rotate();
	zoom();
	tilt();
	highlightContinents();
	markLocation();
	}
}