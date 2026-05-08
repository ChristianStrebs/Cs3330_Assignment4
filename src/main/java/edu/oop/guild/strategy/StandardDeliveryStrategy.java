package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;

public class StandardDeliveryStrategy implements DeliveryCostStrategy{

	private int coins;
	
	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null)
			throw new NullPointerException();
		coins = 0;
		coins += request.getWeightKg();
		coins += request.getDistanceLeagues();
		coins *= 3;
		if (request.isFragile() == true)
			coins += 5;
		if (request.getPackageType() == PackageType.POTION)
			coins += 5;
		if (request.getPackageType() == PackageType.ARTIFACT)
			coins += 12;
		return coins;
	}

}
