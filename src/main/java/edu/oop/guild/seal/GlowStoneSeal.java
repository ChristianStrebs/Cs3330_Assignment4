package edu.oop.guild.seal;

public class GlowStoneSeal implements PackageSeal{
	
	private int durability;
	
	public GlowStoneSeal() {
		
	}

	@Override
	public String apply(String label) {
		if (label == null)
		{
			throw new NullPointerException();
		}
		label = "◆ " + label + " ◆";
		return label;
	}

	@Override
	public int durability() {
		durability = 12;
		return durability;
	}

}
