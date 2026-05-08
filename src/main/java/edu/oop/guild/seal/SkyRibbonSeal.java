package edu.oop.guild.seal;

public class SkyRibbonSeal implements PackageSeal{

	private int durability;
	
	public SkyRibbonSeal() {
		
	}
	
	@Override
	public String apply(String label) {
		if (label == null)
		{
			throw new NullPointerException();
		}
		label = "☁ " + label + " ☁";
		return label;
	}

	@Override
	public int durability() {
		durability = 7; // There is no way to get durability without hardcoding it as there is no clear way to derive it
		return durability;
	}

}
