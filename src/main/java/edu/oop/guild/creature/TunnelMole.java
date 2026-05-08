package edu.oop.guild.creature;

import edu.oop.guild.model.RealmType;

public class TunnelMole extends Creature {
// Returns required name,max weight, and native realm
    public String name() {
        return "Grumble the Tunnel Mole";
    }

    public int carryingCapacityKg() {
        return 30;
    }

    public RealmType nativeRealm() {
        return RealmType.UNDERGROUND;
    }
}