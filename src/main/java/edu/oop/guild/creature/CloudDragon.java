package edu.oop.guild.creature;

import edu.oop.guild.model.RealmType;

public class CloudDragon extends Creature {
// Returns required name,max weight, and native realm
    public String name() {
        return "Nimbus the Cloud Dragon";
    }

    public int carryingCapacityKg() {
        return 80;
    }

    public RealmType nativeRealm() {
        return RealmType.SKY;
    }
}