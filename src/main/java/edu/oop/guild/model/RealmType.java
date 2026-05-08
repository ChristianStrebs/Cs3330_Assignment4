package edu.oop.guild.model;

public enum RealmType {

    SKY,
    UNDERGROUND;

    public String displayName() {
        if (this == SKY) {
            return "Sky Kingdom";
        } else {
            return "Underground Market";
        }
    }
}