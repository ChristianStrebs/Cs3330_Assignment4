package edu.oop.guild.model;

public enum PackageType {

    FOOD,
    POTION,
    ARTIFACT;

    public String label() {
        switch (this) {
            case FOOD:
                return "Snack crate";
            case POTION:
                return "Potion case";
            case ARTIFACT:
                return "Ancient artifact";
            default:
                return "Unknown package";
        }
    }
}