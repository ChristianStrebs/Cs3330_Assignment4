package edu.oop.guild.factory;

import edu.oop.guild.model.RealmType;

public class RealmFactoryProvider {
	
	private RealmFactory factory;

	public RealmFactory forRealm(RealmType realm) {
		if (realm == null)
			throw new NullPointerException();
		if (realm == RealmType.SKY)
		{
			factory = new SkyRealmFactory();
		}
		if (realm == RealmType.UNDERGROUND)
		{
			factory = new UndergroundRealmFactory();
		}
		return factory;
	}

}
