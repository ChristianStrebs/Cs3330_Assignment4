package edu.oop.guild.creature;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.RealmType;
import java.util.Objects;
//Abstract methods
public abstract class Creature {

    public abstract String name();

    public abstract int carryingCapacityKg();
    //Identifies realm where creature is native to
    public abstract RealmType nativeRealm();
    //Checks if all the request requirements are met
    public boolean canCarry(DeliveryRequest request) {
        Objects.requireNonNull(request, "request must not be null");

        if (request.getDestinationRealm() != nativeRealm()) {
            return false;
        }
        if (request.getWeightKg() > carryingCapacityKg()) {
            return false;
        }
        return true;
    }
}