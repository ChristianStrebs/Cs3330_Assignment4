package edu.oop.guild.model;

import java.util.Objects;

public class DeliveryRequest {

    private PackageType packageType;
    private int weightKg;
    private int distanceLeagues;
    private RealmType destinationRealm;
    private boolean fragile;
    // Makes a delivery request and checks weight, and distance are positive
    public DeliveryRequest(PackageType packageType, int weightKg, int distanceLeagues,
                           RealmType destinationRealm, boolean fragile) {

        if (packageType == null) {
            throw new NullPointerException("packageType must not be null");
        }
        if (weightKg <= 0) {
            throw new IllegalArgumentException("weightKg must be greater than 0, got: " + weightKg);
        }
        if (distanceLeagues <= 0) {
            throw new IllegalArgumentException("distanceLeagues must be greater than 0, got: " + distanceLeagues);
        }
        Objects.requireNonNull(destinationRealm, "destinationRealm must not be null");

        this.packageType = packageType;
        this.weightKg = weightKg;
        this.distanceLeagues = distanceLeagues;
        this.destinationRealm = destinationRealm;
        this.fragile = fragile;
    }
    //Getters
    public PackageType getPackageType() {
        return packageType;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public int getDistanceLeagues() {
        return distanceLeagues;
    }

    public RealmType getDestinationRealm() {
        return destinationRealm;
    }

    public boolean isFragile() {
        return fragile;
    }
}