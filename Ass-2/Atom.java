class Atom {
    public static void split() 
	{
		System.out.println("Atom is splitting in a fission reaction!");
		}
    public static void combine() 
	{
		System.out.println("Atoms are fusing in a fusion reaction!"); 
		}
    public static void vibrate() 
	{
		System.out.println("Atom is vibrating due to thermal energy!"); 
		}
    public static void bond() 
	{
		System.out.println("Atoms are forming a chemical bond!"); 
		}
    public static void ionize() 
	{
		System.out.println("Atom has been ionized!"); 
		}
		public static void main(String[] args)
		{
		QuantumMechanics.observeParticle();
        QuantumMechanics.measureEnergy();
        QuantumMechanics.entangleAtoms();
        QuantumMechanics.calculateWaveFunction();
		split();
		combine();
		vibrate();
		bond();
		ionize();
	}
}
